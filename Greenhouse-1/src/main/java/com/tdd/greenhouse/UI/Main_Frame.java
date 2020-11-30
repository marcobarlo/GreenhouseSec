package com.tdd.greenhouse.UI;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//import javax.swing.JDialog;
import javax.swing.JFrame;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import com.tdd.greenhouse.Business_Logic.ControllerFacade;
import com.tdd.greenhouse.Connection.Allarme;

import com.tdd.greenhouse.Main;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Component;
import javax.swing.Box;

public class Main_Frame extends JFrame {

	/**
	 * 
	 */
	private JLabel lblWelcome;
	private JLabel lblError;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMail;
	private JTextField txtPass;
	private JButton btnLogOut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Frame frame = new Main_Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void ricercaColtivazione() {

		try {
			Research_Tab frameRes = Research_Tab.getInstance();
			frameRes.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Main_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1439, 889);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setExtendedState( this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
		contentPane = new JPanel();
		contentPane.setBorder(null);
		contentPane.setSize(contentPane.getMaximumSize());
		contentPane.setBounds(new Rectangle(100, 100, screenSize.width, screenSize.height));
		setContentPane(contentPane);

		//this.setResizable(false);
		
		Frame frame = this;
		contentPane.setLayout(null);
		
		
		lblWelcome = new JLabel("New label");
		//lblWelcome.setBounds(422, 371, 502, 28);
		lblWelcome.setBounds(new Rectangle(screenSize.width/2-400/2,screenSize.height/2-70, 400,20));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblWelcome);
		lblWelcome.setVisible(false);
		
		lblError = new JLabel("New label");
		lblError.setBounds(new Rectangle(screenSize.width/2-400/2,screenSize.height/2-70, 400,20));
		//lblError.setBounds(422, 328, 502, 82);
		lblError.setHorizontalAlignment(SwingConstants.CENTER);
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblError);
		lblError.setVisible(false);
		
		JButton searchButton = new JButton("Cerca una coltivazione");
		searchButton.setBounds(34, 27, 177, 23);
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblError.setVisible(false);
				lblWelcome.setVisible(false);
				ricercaColtivazione();
			}
		});
		contentPane.setLayout(null);
		getContentPane().add(searchButton);
		
		JLabel lblMail = new JLabel("Email:");
		//lblMail.setBounds(433, 191, 109, 28);
		lblMail.setBounds(new Rectangle(screenSize.width/2-300,screenSize.height/2-30, 177,20));
		lblMail.setHorizontalAlignment(SwingConstants.TRAILING);
		lblMail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblMail);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(new Rectangle(screenSize.width/2-300,screenSize.height/2+10, 177,20));
		//lblPassword.setBounds(433, 234, 109, 28);
		lblPassword.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblPassword);
		
		txtMail = new JTextField();
		txtMail.setBounds(new Rectangle(screenSize.width/2-177/2,screenSize.height/2-30, 177,20));
		//txtMail.setBounds(591, 197, 177, 20);
		contentPane.add(txtMail);
		txtMail.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setBounds(new Rectangle(screenSize.width/2-177/2,screenSize.height/2+10, 177,20));
		//txtPass.setBounds(591, 240, 177, 20);
		contentPane.add(txtPass);
		txtPass.setColumns(10);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(295, 27, 177, 23);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblError.setVisible(false);
				lblWelcome.setText("Hai eseguito il log out!");
				lblWelcome.setVisible(true);
				ControllerFacade.logOut();
				btnLogOut.setVisible(false);
				Frame[] lf=Frame.getFrames();
				for(Frame f : lf)
				{
					if(!f.equals(frame))
						f.dispose();
				}
			}
		});
		btnLogOut.setVisible(false);
		contentPane.add(btnLogOut);

		
		JButton btnLogin = new JButton("Log in");
		btnLogin.setBounds(new Rectangle(screenSize.width/2-177/2,screenSize.height/2+50, 177,20));
		//btnLogin.setBounds(600, 297, 155, 23);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loginHandler(lblWelcome, lblError, btnLogOut,frame);
			}
		});
		contentPane.add(btnLogin);
		
		this.getRootPane().setDefaultButton(btnLogin);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		rigidArea.setBounds(210, 10, 85, 50);
		contentPane.add(rigidArea);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 30, 36, 20);
		contentPane.add(horizontalStrut);
		
		EventBus.getDefault().register(this);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) 
		    {
				lblError.setVisible(false);
				lblWelcome.setVisible(false);
		        e.getWindow().dispose();
		        System.out.println("Shutting down Mainframe...");
		        Main.shutdown();
		    }
		});
		
	}
	@Subscribe(threadMode = ThreadMode.BACKGROUND)
	public void onEvent(Allarme event)
	{
		/*JOptionPane optionPane = new JOptionPane(event.getMex() + "\nAmbiente : "+ event.getIdAmbiente()+
				" \nSezione: "+event.getIdSez()+ " \nColtivazione: "+event.getIdColt()+" -"+event.getTipo(), JOptionPane.WARNING_MESSAGE);
		JDialog dialog = optionPane.createDialog(null, event.getMex() + "\nAmbiente : "+ event.getIdAmbiente()+
				" \nSezione: "+event.getIdSez()+ " \nColtivazione: "+event.getIdColt()+" -"+event.getTipo());
		dialog.setModal(false);
		dialog.setTitle("Attenzione! Malfunzionamento!");
		dialog.setVisible(true);*/
		if(ErrorLog.getIsUpdating()==true)
		{
			ErrorLog log = ErrorLog.getInstance();
			log.addError(event.getMex(),  event.getIdAmbiente(),  event.getIdSez(),  event.getIdColt(),  event.getTipoColtivazione());
			log.setVisible(true);
		}
	}

	private void loginHandler(JLabel lblWelcome, JLabel lblError, JButton btnLogOut, Frame frame) {
		lblError.setVisible(false);
		lblWelcome.setVisible(false);
		String mail= txtMail.getText();
		String pass= txtPass.getText();
		Frame[] lf=Frame.getFrames();
		for(Frame f : lf)
		{
			if(!f.equals(frame))
				f.dispose();
		}
		if(mail.equals("") || pass.equals(""))
		{
			lblError.setText("Errore! Inserisci i campi mail e password!");
			lblError.setVisible(true);
		}
		else
		{
			mail.replace("'", "").trim().toLowerCase().replace("\"", "").replace("*", "");
			String role=ControllerFacade.login(mail,pass);
			if(role!=null)
			{
				lblWelcome.setText("Benvenuto "+role+" "+ mail);
				lblWelcome.setVisible(true);
				btnLogOut.setVisible(true);
			}
			else
			{
				lblError.setText("Email o password errati!");
				lblError.setVisible(true);					
				btnLogOut.setVisible(false);
			}
		}
	}
}