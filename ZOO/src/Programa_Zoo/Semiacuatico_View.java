package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Semiacuatico_View {
	
	//Attributes
	private JLabel label;
	private JPanel panel;
	
	private JButton bcoco;
	private JButton bpin;
	private JButton bfoc;
	private JButton bpol;
	
	//Constructor
	public Semiacuatico_View(){
		this.panel = new JPanel();
		
		this.label = new JLabel("Semiacuatico");
		this.label.setBounds(200, 25, 100, 50);
		this.panel.add(label);
	
		this.bfoc = new JButton ("Foca");
		this.bfoc.setBounds(25, 100, 200, 100);
		this.bfoc.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Foc_View fv = new Foc_View();
	        	IG.vista.setContentPane(fv.getfoc());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bfoc);
		
		this.bpol = new JButton ("Oso Polar");
		this.bpol.setBounds(250, 100, 200, 100);
		this.bpol.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Pol_View plv = new Pol_View();
	        	IG.vista.setContentPane(plv.getpol());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bpol);
		
		this.bcoco = new JButton ("Cocodrilo");
		this.bcoco.setBounds(25, 225, 200, 100);
		this.bcoco.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Coco_View cv = new Coco_View();
	        	IG.vista.setContentPane(cv.getcoco());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bcoco);
		
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
	
	public JPanel getsem() {
		return this.panel;
	}
}