package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pacifico_View {
	
	//Attributes
	private JLabel label;
	private JPanel panel;
	
	private JButton blor;
	private JButton bpin;
	private JButton bjira;
	private JButton bpan;
	
	//Constructor
	public Pacifico_View(){
		this.panel = new JPanel();
		
		this.label = new JLabel("Pacifico");
		this.label.setBounds(200, 25, 100, 50);
		this.panel.add(label);
		
		this.bjira = new JButton ("Jirafa");
		this.bjira.setBounds(25, 100, 200, 100);
		this.bjira.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Jira_View jv = new Jira_View();
	        	IG.vista.setContentPane(jv.getjira());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bjira);
		
		this.bpan = new JButton ("Oso Panda");
		this.bpan.setBounds(250, 100, 200, 100);
		this.bpan.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Pan_View pnv = new Pan_View();
	        	IG.vista.setContentPane (pnv.getpan());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bpan);
		
		this.blor = new JButton ("Loro");
		this.blor.setBounds(25, 225, 200, 100);
		this.blor.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Lor_View lv = new Lor_View();
	        	IG.vista.setContentPane(lv.getlor());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(blor);
		
		this.bpin = new JButton ("Pinguino");
		this.bpin.setBounds(250, 225, 200, 100);
		this.bpin.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Pin_View pv = new Pin_View();
	        	IG.vista.setContentPane(pv.getpin());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bpin);
	
	this.panel.setSize(500, 500);
	this.panel.setLayout(null);
	this.panel.setVisible(true);
}
	
	public JPanel getpac() {
		return this.panel;
	}
}