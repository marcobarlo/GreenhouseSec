package com.tdd.greenhouse.UI;

import java.util.Date;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SpringLayout;

public class ErrorLog extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static ErrorLog instance;
	private final JScrollPane scrollPane = new JScrollPane();
	private DefaultListModel<String> listModel;
	private static boolean update=true;
	private JButton btnMute;
	/**
	 * Create the frame.
	 */
	private JList<String> list;
	private ErrorLog() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 692, 279);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		sl_contentPane.putConstraint(SpringLayout.NORTH, scrollPane, 30, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, scrollPane, 5, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, scrollPane, 225, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, scrollPane, -5, SpringLayout.EAST, contentPane);
		contentPane.setLayout(sl_contentPane);
		contentPane.add(scrollPane);
		listModel = new DefaultListModel<String>();
		list = new JList<String>(listModel);
		list.setVisibleRowCount(10);
		scrollPane.setViewportView(list);
		
		this.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent e) 
		    {
		    	if(instance != null)
		    		instance.btnMute.setText("Mute Log");
		    	update =true;
		    }
		});
		
		JButton btnClean = new JButton("Clear Log");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnClean, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnClean, 0, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnClean, 109, SpringLayout.WEST, contentPane);
		btnClean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listModel.clear();
			}
		});
		contentPane.add(btnClean);
		
		btnMute = new JButton("Mute Log");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnMute, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnMute, 119, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMute, 228, SpringLayout.WEST, contentPane);
		btnMute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update=!update;
				if(btnMute.getText().equals("Mute Log"))
					btnMute.setText("Unmute Log");
				else
					btnMute.setText("Mute Log");
			}
		});
		contentPane.add(btnMute);
		this.setTitle("Log degli errori");
	}
	public static ErrorLog getInstance()
	{
		if(instance != null)
			return instance;
		else
			instance=new ErrorLog();
		return instance;
	}
	public void addError(String mex, int idAmbiente, int idSezione, int idColtivazione, String tipo)
	{
		String message = "*** "+mex+ "  -- Ambiente : "+ idAmbiente+
				" -- Sezione: "+idSezione+ " -- Coltivazione: "+idColtivazione+" -- Tipo: "+tipo + " -- "+new Date() +" ***";
		listModel.addElement(message);
		list = new JList<String>(listModel);
	}
	public void clean()
	{
		listModel.clear();
	}
	public static boolean getIsUpdating()
	{
		return update;
	}

}
