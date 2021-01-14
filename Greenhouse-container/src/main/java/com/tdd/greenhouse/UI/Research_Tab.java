package com.tdd.greenhouse.UI;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.tdd.greenhouse.Business_Logic.*;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SpringLayout;


public class Research_Tab extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField rigaTextField;
	private JTextField tipoTextField;
	private JTextField sezioneTextField;
	private JTextField posizioneTextField;
	private JTable table;
	private static Research_Tab instance;
	private ArrayList<ColtivazioneBusiness> colts= new ArrayList<ColtivazioneBusiness>();

	/**
	 * Create the frame.
	 */

	
	private Research_Tab() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 559, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//this.setResizable(false);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		Dimension screenSize = contentPane.getSize();
		JLabel lblNewLabel = new JLabel("tipo");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 34, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel, 36, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel, 80, SpringLayout.WEST, contentPane);
		contentPane.add(lblNewLabel);
		
		JLabel lblSezione = new JLabel("sezione");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblSezione, 22, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblSezione, -200, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblSezione, 36, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblSezione, -120, SpringLayout.EAST, contentPane);
		contentPane.add(lblSezione);
		
		JLabel lblRiga = new JLabel("fila");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblRiga, 55, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblRiga, 34, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblRiga, 69, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblRiga, 80, SpringLayout.WEST, contentPane);
		contentPane.add(lblRiga);
		
		JLabel lblPosizioneNellaRiga = new JLabel("posizione nella riga");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblPosizioneNellaRiga, 55, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPosizioneNellaRiga, -240, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblPosizioneNellaRiga, 69, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblPosizioneNellaRiga, -120, SpringLayout.EAST, contentPane);
		contentPane.add(lblPosizioneNellaRiga);
		
		rigaTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, rigaTextField, 52, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, rigaTextField, 80, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, rigaTextField, 72, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, rigaTextField, 166, SpringLayout.WEST, contentPane);
		contentPane.add(rigaTextField);
		rigaTextField.setColumns(10);
		
		tipoTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, tipoTextField, 19, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, tipoTextField, 80, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, tipoTextField, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, tipoTextField, 166, SpringLayout.WEST, contentPane);
		contentPane.add(tipoTextField);
		tipoTextField.setColumns(10);
		
		sezioneTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, sezioneTextField, 19, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, sezioneTextField, -120, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, sezioneTextField, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, sezioneTextField, -34, SpringLayout.EAST, contentPane);
		contentPane.add(sezioneTextField);
		sezioneTextField.setColumns(10);
		
		posizioneTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, posizioneTextField, 52, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, posizioneTextField, -120, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, posizioneTextField, 72, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, posizioneTextField, -34, SpringLayout.EAST, contentPane);
		contentPane.add(posizioneTextField);
		posizioneTextField.setColumns(10);
		
		JLabel lblError = new JLabel("Errore");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblError, 124, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblError, screenSize.width/2+50, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblError, 138, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblError, -(screenSize.width/2+50), SpringLayout.EAST, contentPane);
		contentPane.add(lblError);
		lblError.setVisible(false);

		JButton btnNewButton = new JButton("Ricerca coltivazione");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnNewButton, 80, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnNewButton, screenSize.width/2+150, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, btnNewButton, 110, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnNewButton, -(screenSize.width/2+150), SpringLayout.EAST, contentPane);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tipo, pos,sez,row;
				int posizione,sezione,fila;
				tipo = tipoTextField.getText();
				pos=posizioneTextField.getText();
				sez=sezioneTextField.getText();
				row=rigaTextField.getText();
				lblError.setVisible(false);
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				int n_rows=model.getRowCount();
				for(int i=0; i<n_rows; i++)
				{
					model.removeRow(0);
				}
				try
				{
					posizione=getInt(lblError,pos);
					sezione=getInt(lblError,sez);
					fila=getInt(lblError,row);
					if (validaValori(lblError, sezione, posizione, fila)) 
					{
						if(tipo.equals("") && (sezione==-1))
						{
							lblError.setVisible(true);
							lblError.setText("Inserisci correttamente almeno uno dei campi tra sezione e tipo!!");
						}
						else if( (posizione!=-1) && (fila==-1))
						{
							lblError.setVisible(true);
							lblError.setText("Se inserisci la posizione devi inserire anche la fila!!");
						}
						else
						{
							if(tipo.equals(""))
								tipo=null;
							colts=(ArrayList<ColtivazioneBusiness>) ControllerFacade.ricercaColtivazione(tipo, sezione,posizione,fila);
							Collections.sort(colts, new ColtivazioneBusiness());
							for(ColtivazioneBusiness c: colts)
							{
								model.insertRow(model.getRowCount(), new Object[] {String.valueOf(c.getID_coltivazione()),String.valueOf(c.getSezione()), String.valueOf(c.getFila()),
										String.valueOf(c.getPosizione()), String.valueOf(c.getTipo()),String.valueOf(c.getStato()),String.valueOf(c.getData_prossima_op())});
							}
						
						}
					}
				}
				catch(NumberFormatException e){}
			}
		});
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 149, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 10, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, -40, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, -10, SpringLayout.EAST, contentPane);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Sezione", "Fila", "Posizione", "Tipo", "Stato", "Data Prossima Op"
			}
		));
		
		JButton mostra = new JButton("Mostra dettagli");
		sl_contentPane.putConstraint(SpringLayout.NORTH, mostra, -30, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, mostra, 36, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, mostra, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, mostra, 247, SpringLayout.WEST, contentPane);
		mostra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblError.setVisible(false);
				int n_rows=table.getSelectedRows().length;
				if(n_rows>1)
				{
					lblError.setVisible(true);
					lblError.setText("Devi selezionare una sola coltivazione per ottenerne i dettagli!!");
				}
				else
				{
					int row=table.getSelectedRow();
					if(row != -1)
					{
						try {
							Coltivazione_tab frame2 = new Coltivazione_tab(colts.get(row));
							frame2.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}
		});
		contentPane.add(mostra);
		
		JButton modificaParamAmb = new JButton("Modifica Parametri Ambientali");
		sl_contentPane.putConstraint(SpringLayout.NORTH, modificaParamAmb, -30, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, modificaParamAmb, -247, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, modificaParamAmb, -10, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, modificaParamAmb, -36, SpringLayout.EAST, contentPane);
		modificaParamAmb.setFont(new Font("Tahoma", Font.PLAIN, 11));
		modificaParamAmb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);
				String role=ControllerFacade.getSessionRole();
				if(role!=null && role.equals("agronomo"))
				{
					int rows[] = table.getSelectedRows();
					List<Integer> ids = new ArrayList<Integer>();
					if(rows.length>0) 
					{
						for(int i=0 ; i< rows.length; i++)
							ids.add(colts.get(rows[i]).getID_coltivazione());
						try {
							ModificaAmbienteTab frame2 = new ModificaAmbienteTab(ids);
							frame2.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}
				else
				{
					lblError.setVisible(true);
					lblError.setText("Non hai i permessi per modificare gli ambienti, logga come agronomo!");
				}
			}
		});
		contentPane.add(modificaParamAmb);
				
		mostra.setVisible(false);
		modificaParamAmb.setVisible(false); 
		ListSelectionModel cellSelectionModel = table.getSelectionModel();
		  
		cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
		public void valueChanged(ListSelectionEvent e) {
		mostra.setVisible(true);
		modificaParamAmb.setVisible(true); }
		});
	
	}
	
	
	private int getInt(JLabel lblError,String text)
	{
		int number;
		try {number=Integer.parseInt(text);}
		catch(NumberFormatException e)
		{
			number = -1;
			if(!text.equals(""))
			{
				lblError.setText("Errore, sezione, fila e posizione sono numeri positivi!");
				lblError.setVisible(true);
				throw e;
			}
		}
		return number;
	}
	
	private boolean validaValori(JLabel lblError,int sezione, int posizione,  int fila)
	{
		if(sezione==0 || sezione < -1)
		{
			lblError.setText("Errore, inserisci un identificativo di sezione positivo");
			lblError.setVisible(true);
			return false;
		}
		else if(posizione==0 || posizione < -1 )
		{
			lblError.setText("Errore, inserisci una posizione positiva");
			lblError.setVisible(true);
			return false;
		}
		else if(fila==0 || fila < -1 )
		{
			lblError.setText("Errore, inserisci una fila positiva");
			lblError.setVisible(true);
			return false;
		}
		return true;
	}
	
	public static Research_Tab getInstance()
	{
		if(instance != null)
			return instance;
		else
			instance=new Research_Tab();
		return instance;
	}
}