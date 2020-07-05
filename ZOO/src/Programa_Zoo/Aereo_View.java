package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aereo_View {
	
	//Attributes
	private JLabel label;
	private JPanel panel;
	
	private JButton bagui;
	private JButton blor;
	
	//Constructor
	public Aereo_View(){
		this.panel = new JPanel();
		
		this.label = new JLabel("Aereo");
		this.label.setBounds(200, 50, 100, 50);
		this.panel.add(label);
	
		this.bagui = new JButton ("Aguila");
		this.bagui.setBounds(25, 150, 200, 100);
		this.bagui.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Agui_View av = new Agui_View();
	        	IG.vista.setContentPane(av.getagui());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bagui);
		
		this.blor = new JButton ("Loro");
		this.blor.setBounds(250, 150, 200, 100);
		this.blor.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Lor_View lv = new Lor_View();
	        	IG.vista.setContentPane(lv.getlor());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(blor);
	
	this.panel.setSize(500, 500);
	this.panel.setLayout(null);
	this.panel.setVisible(true);
}
	
	public JPanel getaer() {
		return this.panel;
	}
}