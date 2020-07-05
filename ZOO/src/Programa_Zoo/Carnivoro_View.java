package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Carnivoro_View {

	//Attributes
		private JPanel panel;
		private JLabel label;
		
		private JButton bcoco;
		private JButton bfoc;
		private JButton bgori;
		private JButton bleo;
		private JButton bleopar;
		private JButton bpar;
		private JButton bpol;
		private JButton brino;
		private JButton btig;
		private JButton bpin;
		
		//Constructor
		public Carnivoro_View(){
			this.panel = new JPanel();
			
			this.label = new JLabel("Carnivoros");
			this.label.setBounds(200, 25, 100, 50);
			this.panel.add(label);
			
			this.bfoc = new JButton ("Foca");
			this.bfoc.setBounds(25, 100, 200, 50);
			this.bfoc.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Foc_View fv = new Foc_View();
		        	IG.vista.setContentPane(fv.getfoc());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bfoc);
			
			this.bgori = new JButton ("Gorila");
			this.bgori.setBounds(250, 100, 200, 50);
			this.bgori.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Gori_View gv = new Gori_View();
		        	IG.vista.setContentPane(gv.getgori());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bgori);
			
			this.bleo = new JButton ("Leon");
			this.bleo.setBounds(25, 160, 200, 50);
			this.bleo.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Leo_View lv = new Leo_View();
		        	IG.vista.setContentPane(lv.getleo());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bleo);
			
			this.bleopar = new JButton ("Leopardo");
			this.bleopar.setBounds(250, 160, 200, 50);
			this.bleopar.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Leopar_View lpv = new Leopar_View();
		        	IG.vista.setContentPane(lpv.getleopar());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bleopar);
			
			this.bpar = new JButton ("Oso Pardo");
			this.bpar.setBounds(25, 220, 200, 50);
			this.bpar.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Par_View prv = new Par_View();
		        	IG.vista.setContentPane(prv.getpar());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bpar);
			
			this.bpol = new JButton ("Oso Polar");
			this.bpol.setBounds(250, 220, 200, 50);
			this.bpol.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Pol_View plv = new Pol_View();
		        	IG.vista.setContentPane(plv.getpol());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bpol);
			
			this.brino = new JButton ("Rinoceronte");
			this.brino.setBounds(25, 280, 200, 50);
			this.brino.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Rino_View rnv = new Rino_View();
		        	IG.vista.setContentPane(rnv.getrino());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(brino);
			
			this.btig = new JButton ("Tigre");
			this.btig.setBounds(250, 280, 200, 50);
			this.btig.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Tigre_View tgv = new Tigre_View();
		        	IG.vista.setContentPane(tgv.gettig());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(btig);
			
			this.bcoco = new JButton ("Cocodrilo");
			this.bcoco.setBounds(25, 340, 200, 50);
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
			this.bpin.setBounds(250, 340, 200, 50);
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
		
		public JPanel getcar() {
			return this.panel;
		}
	}