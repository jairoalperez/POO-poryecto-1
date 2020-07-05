package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Herbivoro_View {

	//Attributes
		private JPanel panel;
		private JLabel label;
	
		private JButton bjira;
		private JButton bpan;
		
		//Constructor
		public Herbivoro_View(){
			this.panel = new JPanel();
			
			this.label = new JLabel("Herbivoros");
			this.label.setBounds(200, 25, 100, 50);
			this.panel.add(label);
			
			this.bjira = new JButton ("Jirafa");
			this.bjira.setBounds(25, 175, 200, 100);
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
			this.bpan.setBounds(250, 175, 200, 100);
			this.bpan.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent d) {
		        	Pan_View pnv = new Pan_View();
		        	IG.vista.setContentPane (pnv.getpan());
		        	IG.vista.invalidate();
		        	IG.vista.validate();
		        }
		    });
			this.panel.add(bpan);
			
			this.panel.setSize(500, 500);
			this.panel.setLayout(null);
			this.panel.setVisible(true);
			
		}
		
		public JPanel gether() {
			return this.panel;
		}
	}