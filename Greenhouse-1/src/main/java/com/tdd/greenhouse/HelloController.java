package com.tdd.greenhouse;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @GetMapping(value = "/public", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping(value = "/denied", produces = MediaType.TEXT_PLAIN_VALUE)
    public String denied() {
        return "DENIED!";
    }
      
    @DeleteMapping("/coltivazione/{id}")
    public ResponseEntity<Boolean> deleteDocument(@PathVariable long id) {
        System.out.println("calling delete operation");
        //boolean deleted = documentRepository.deleteById(id);
        boolean deleted = true;
        return ResponseEntity.ok(deleted);
    }
    
    @GetMapping(value = "/coltivazione/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean getDocument(@PathVariable("id") long id) throws JsonProcessingException
    {
        return true;
    }
    
    
    @PostMapping("/coltivazioni")
    public ResponseEntity<Boolean> createDocument(@RequestBody boolean bol) {
        return ResponseEntity.ok(true);
    }

    
    @GetMapping(value = "/coltivazioni", produces = MediaType.TEXT_PLAIN_VALUE)
    public String coltivaziget() {
        return "Mele e lamponi list";
    }
    

    /*@GetMapping("/coltivazioni")
    public List<Document> listDocument(Model model) {
        configCommonAttributes(model);
        return documentRepository.findAll();
    }*/
    
}