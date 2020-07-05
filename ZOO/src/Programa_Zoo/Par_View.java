package Programa_Zoo;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;

import Programa_Zoo.Animales.Oso_Pardo;

public class Par_View extends JFrame {
	
	Oso_Pardo par = new Oso_Pardo ("Oso Pardo", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 2);
	
		private JPanel panel;
		private JLabel labeltipo;
		private JLabel labelrep;
		private JLabel labelalim;
		private JLabel labeltem;
		private JLabel labelhab;
		private JLabel labelcan;
		private JTextArea tatipo;
		private JTextArea tarep;
		private JTextArea taalim;
		private JTextArea tatem;
		private JTextArea tahab;
		private JTextArea tacan;
		private JTextArea taconsejo;
		private JTextArea talogo;
		
		public Par_View(){
			this.panel = new JPanel();
			
			this.labeltipo = new JLabel("Tipo:");
			labeltipo.setFont(new Font("Tahoma", Font.BOLD, 15));
			labeltipo.setBounds(41, 45, 153, 26);
			this.panel.add(labeltipo);
			
			this.labelrep = new JLabel("Reproduccion:");
			labelrep.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelrep.setBounds(41, 84, 153, 26);
			this.panel.add(labelrep);
			
			this.labelalim = new JLabel("Alimentacion:");
			labelalim.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelalim.setBounds(41, 123, 153, 26);
			this.panel.add(labelalim);
			
			this.labeltem = new JLabel("Temperamento:");
			labeltem.setFont(new Font("Tahoma", Font.BOLD, 15));
			labeltem.setBounds(41, 162, 153, 26);
			this.panel.add(labeltem);
			
			this.labelhab = new JLabel("Habitat:");
			labelhab.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelhab.setBounds(41, 201, 153, 26);
			this.panel.add(labelhab);
			
			this.labelcan = new JLabel("Cantidad en Zoo:");
			labelcan.setFont(new Font("Tahoma", Font.BOLD, 15));
			labelcan.setBounds(41, 240, 153, 26);
			this.panel.add(labelcan);
			
			this.tatipo = new JTextArea();
			tatipo.setText(par.getTipo());
			tatipo.setFont(new Font("Monospaced", Font.PLAIN, 15));
			tatipo.setEditable(false);
			tatipo.setBounds(206, 48, 243, 22);
			this.panel.add(tatipo);
			
			this.tarep = new JTextArea();
			tarep.setText(par.getReproduccion());
			tarep.setFont(new Font("Monospaced", Font.PLAIN, 7));
			tarep.setEditable(false);
			tarep.setBounds(206, 87, 243, 22);
			this.panel.add(tarep);
			
			this.taalim = new JTextArea();
			taalim.setText(par.getAlimentacion());
			taalim.setFont(new Font("Monospaced", Font.PLAIN, 15));
			taalim.setEditable(false);
			taalim.setBounds(206, 126, 243, 22);
			this.panel.add(taalim);
			
			this.tatem = new JTextArea();
			tatem.setText(par.getTemperamento());
			tatem.setFont(new Font("Monospaced", Font.PLAIN, 15));
			tatem.setEditable(false);
			tatem.setBounds(206, 165, 243, 22);
			this.panel.add(tatem);
			
			this.tahab = new JTextArea();
			tahab.setText(par.getHabitat());
			tahab.setFont(new Font("Monospaced", Font.PLAIN, 15));
			tahab.setEditable(false);
			tahab.setBounds(206, 204, 243, 22);
			this.panel.add(tahab);
			
			this.tacan = new JTextArea();
			tacan.setText(""+par.getCantidad());
			tacan.setFont(new Font("Monospaced", Font.PLAIN, 15));
			tacan.setEditable(false);
			tacan.setBounds(206, 243, 243, 22);
			this.panel.add(tacan);
			
			this.taconsejo = new JTextArea();
			taconsejo.setText(par.agresivo());
			taconsejo.setFont(new Font("Monospaced", Font.PLAIN, 12));
			taconsejo.setEditable(false);
			taconsejo.setForeground(Color.WHITE);
			taconsejo.setBackground(Color.DARK_GRAY);
			taconsejo.setBounds(12, 279, 476, 26);
			this.panel.add(taconsejo);
			
			this.talogo = new JTextArea();
			talogo.setEditable(false);
			talogo.setBackground(Color.BLACK);
			talogo.setForeground(Color.WHITE);
			talogo.setText("ZOO");
			talogo.setFont(new Font("Monospaced", Font.BOLD | Font.ITALIC, 99));
			talogo.setBounds(145, 318, 193, 169);
			this.panel.add(talogo);
			
			this.panel.setSize(500, 500);
			this.panel.setLayout(null);
			this.panel.setVisible(true);
			
		}
		
		public JPanel getpar() {
			return this.panel;
		}
	}