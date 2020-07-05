package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rep_View extends JFrame{
	
	//Attributes
	private JLabel label;
	private JPanel panelrep;
	private JButton botonhuevos;
	private JButton botonvientre;
	
	//Constructor
	public Rep_View(){
		this.panelrep = new JPanel();
		
		this.label = new JLabel("Reproduccion");
		this.label.setBounds(200, 50, 100, 50);
		this.panelrep.add(label);
		
		this.botonhuevos = new JButton ("Oviparos");
		this.botonhuevos.setBounds(25, 200, 200, 100);
		this.botonhuevos.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Huevos_View hv = new Huevos_View();
	        	IG.vista.setContentPane(hv.gethuevos());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panelrep.add(botonhuevos);
		
		this.botonvientre = new JButton ("Viviparos");
		this.botonvientre.setBounds(250, 200, 200, 100);
		this.botonvientre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent d) {
	        	Vientre_View vv = new Vientre_View();
	        	IG.vista.setContentPane(vv.getvientre());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
			 }
	    });
		this.panelrep.add(botonvientre);
		
		this.panelrep.setSize(500, 500);
		this.panelrep.setLayout(null);
		this.panelrep.setVisible(true);
		
		
	}
	
	public JPanel getrep() {
		return this.panelrep;
	}
}
