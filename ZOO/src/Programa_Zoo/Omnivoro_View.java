package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Omnivoro_View {

	//Attributes
		private JPanel panel;
		private JLabel label;
		
		private JButton bagui;
		private JButton baves;
		private JButton blor;
		
		//Constructor
		public Omnivoro_View(){
			this.panel = new JPanel();
			
			this.label = new JLabel("Omnivoro");
			this.label.setBounds(200, 25, 100, 50);
			this.panel.add(label);
			
			this.bagui = new JButton ("Aguila");
			this.bagui.setBounds(25, 100, 200, 100);
			this.bagui.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Agui_View av = new Agui_View();
		        	IG.vista.setContentPane(av.getagui());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bagui);
			
			this.baves = new JButton ("Avestruz");
			this.baves.setBounds(250, 100, 200, 100);
			this.baves.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Aves_View avs = new Aves_View();
		        	IG.vista.setContentPane(avs.getaves());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(baves);
			
			this.blor = new JButton ("Loro");
			this.blor.setBounds(137, 225, 200, 100);
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
		
		public JPanel getom() {
			return this.panel;
		}
	}