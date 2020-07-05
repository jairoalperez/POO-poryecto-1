package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Huevos_View {

	//Attributes
		private JPanel panel;
		private JLabel label;
		private JButton botonagui;
		private JButton botonaves;
		private JButton botoncoco;
		private JButton botonlor;
		private JButton botonpin;
		
		//Constructor
		public Huevos_View(){
			this.panel = new JPanel();
			
			this.label = new JLabel("Oviparos");
			this.label.setBounds(200, 25, 100, 50);
			this.panel.add(label);
			
			this.botonagui = new JButton ("Aguila");
			this.botonagui.setBounds(25, 100, 200, 100);
			this.botonagui.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Agui_View av = new Agui_View();
		        	IG.vista.setContentPane(av.getagui());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(botonagui);
			
			this.botonaves = new JButton ("Avestruz");
			this.botonaves.setBounds(250, 100, 200, 100);
			this.botonaves.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Aves_View avs = new Aves_View();
		        	IG.vista.setContentPane(avs.getaves());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(botonaves);
			
			this.botoncoco = new JButton ("Cocodrilo");
			this.botoncoco.setBounds(250, 225, 200, 100);
			this.botoncoco.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Coco_View cv = new Coco_View();
		        	IG.vista.setContentPane(cv.getcoco());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(botoncoco);
			
			this.botonlor = new JButton ("Loro");
			this.botonlor.setBounds(25, 225, 200, 100);
			this.botonlor.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Lor_View lv = new Lor_View();
		        	IG.vista.setContentPane(lv.getlor());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(botonlor);
			
			this.botonpin = new JButton ("Pinguino");
			this.botonpin.setBounds(137, 350, 200, 100);
			this.botonpin.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Pin_View pv = new Pin_View();
		        	IG.vista.setContentPane(pv.getpin());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(botonpin);
			
			this.panel.setSize(500, 500);
			this.panel.setLayout(null);
			this.panel.setVisible(true);
			
		}
		
		public JPanel gethuevos() {
			return this.panel;
		}
	}