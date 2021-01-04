package com.tdd.greenhouse;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.keycloak.KeycloakSecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.tdd.greenhouse.Business_Logic.ColtivazioneBusiness;
import com.tdd.greenhouse.Business_Logic.ControllerFacade;
import com.tdd.greenhouse.Business_Logic.DettagliBusiness;
import com.tdd.greenhouse.security.*;

@RestController
public class HelloController {
    @Autowired
    private HttpServletRequest request;

    //@Autowired
    //private ControllerFacade facade;
	
    @GetMapping(value = "/public", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/denied", produces = MediaType.TEXT_PLAIN_VALUE)
    public String denied() {
        return "DENIED!";
    }

    
    @GetMapping(value = "sezione/{idsez}/coltivazione/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ReturnGetColtivazione getColtivazione(@PathVariable("id") long id,@PathVariable("idsez") long idsez, Model model) throws JsonProcessingException
    {
        configCommonAttributes(model);
        int idi = (int) id;
        int ids = (int) idsez;
        ColtivazioneBusiness colt = ControllerFacade.getColtivazioneByID(idi,ids);
        if(colt!=null)
        {
        	DettagliBusiness dett = ControllerFacade.getDettagliColtivazione(idi);
        	return new ReturnGetColtivazione(dett,colt);
        }
        else
        	throw new NotFoundException();
    }    

    @PutMapping(value = "sezione/{idsez}/coltivazione/{id}")
    public ResponseEntity<Boolean> putColtivazione(@PathVariable("id") long id,@PathVariable("idsez") long idsez, @RequestBody ParamsPut parametri/*, @RequestBody float umidita,  @RequestBody float irradianza*/,Model model) throws JsonProcessingException
    {
        int idi = (int) id;
        int ids = (int) idsez;
        //ColtivazioneBusiness colt = ControllerFacade.getColtivazioneByID(idi);
        boolean risposta = ControllerFacade.modificaAmbiente(idi, ids, parametri.getTemperatura(), parametri.getUmidita(), parametri.getIrradianza());
        return ResponseEntity.ok(risposta);
    }    
    

    private void configCommonAttributes(Model model) {
        model.addAttribute("identity", new Identity(getKeycloakSecurityContext()));

    }

    private KeycloakSecurityContext getKeycloakSecurityContext() {
        return (KeycloakSecurityContext) request.getAttribute(KeycloakSecurityContext.class.getName());
    }
    
    @PostMapping("/coltivazioni")
    public ResponseEntity<Boolean> createDocument(@RequestBody boolean bol) {
        return ResponseEntity.ok(true);
    }

    
    @GetMapping(value = "sezione/{idsez}/coltivazioni", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ColtivazioneBusiness> coltivaziget(@PathVariable("idsez") long idsez, Model model) {
    	configCommonAttributes(model);
        int ids = (int) idsez;
    	List<ColtivazioneBusiness> retval = new ArrayList<ColtivazioneBusiness>();
    	retval = ControllerFacade.ricercaColtivazione(null,ids,-1,-1);
        return retval;
    }
    
    
	  @DeleteMapping("/coltivazione/{id}")
	  public ResponseEntity<Boolean> deleteDocument(@PathVariable long id) {
	      System.out.println("calling delete operation");
	      //boolean deleted = documentRepository.deleteById(id);
	      boolean deleted = true;
	      return ResponseEntity.ok(deleted);
	  }


	@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Coltivazione not found")
	public class NotFoundException extends RuntimeException {
	
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	}
}