package Programa_Zoo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Terrestre_View {
	
	//Attributes
	private JLabel label;
	private JPanel panel;
	
	private JButton baves;
	private JButton brino;
	private JButton btig;
	private JButton bgori;
	private JButton bleo;
	private JButton bleopar;
	private JButton bpan;
	private JButton bpar;
	private JButton bjira;
	
	//Constructor
	public Terrestre_View(){
		this.panel = new JPanel();
		
		this.label = new JLabel("Terrestre");
		this.label.setBounds(200, 25, 100, 50);
		this.panel.add(label);
		
		this.bgori = new JButton ("Gorila");
		this.bgori.setBounds(25, 100, 200, 50);
		this.bgori.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Gori_View gv = new Gori_View();
	        	IG.vista.setContentPane(gv.getgori());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bgori);
		
		this.bjira = new JButton ("Jirafa");
		this.bjira.setBounds(250, 100, 200, 50);
		this.bjira.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Jira_View jv = new Jira_View();
	        	IG.vista.setContentPane(jv.getjira());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bjira);
		
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
		
		this.bpan = new JButton ("Oso Panda");
		this.bpan.setBounds(25, 220, 200, 50);
		this.bpan.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Pan_View pnv = new Pan_View();
	        	IG.vista.setContentPane (pnv.getpan());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bpan);
		
		this.bpar = new JButton ("Oso Pardo");
		this.bpar.setBounds(250, 220, 200, 50);
		this.bpar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Par_View prv = new Par_View();
	        	IG.vista.setContentPane(prv.getpar());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(bpar);
		
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
		
		this.baves = new JButton ("Avestruz");
		this.baves.setBounds(137, 340, 200, 50);
		this.baves.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent d) {
	        	Aves_View avs = new Aves_View();
	        	IG.vista.setContentPane(avs.getaves());
	        	IG.vista.invalidate();
	        	IG.vista.validate();
	        }
	    });
		this.panel.add(baves);
	
	this.panel.setSize(500, 500);
	this.panel.setLayout(null);
	this.panel.setVisible(true);
}
	
	public JPanel getterr() {
		return this.panel;
	}
}