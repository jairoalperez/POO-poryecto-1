package Programa_Zoo;

import java.util.Scanner;

import Programa_Zoo.Animales.Aguila;
import Programa_Zoo.Animales.Avestruz;
import Programa_Zoo.Animales.Cocodrilo;
import Programa_Zoo.Animales.Foca;
import Programa_Zoo.Animales.Gorillas;
import Programa_Zoo.Animales.Jirafa;
import Programa_Zoo.Animales.Leon;
import Programa_Zoo.Animales.Leopardos;
import Programa_Zoo.Animales.Loro;
import Programa_Zoo.Animales.Oso_Panda;
import Programa_Zoo.Animales.Oso_Pardo;
import Programa_Zoo.Animales.Oso_Polar;
import Programa_Zoo.Animales.Pinguino;
import Programa_Zoo.Animales.Rinoceronte;
import Programa_Zoo.Animales.Tigres;

import Programa_Zoo.Buscar_View;
import Programa_Zoo.Ingresar_View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class IG {

	String tip = null, rep = null, alim = null, tem = null, hab = null;
	int cant = 0; 
	
	Aguila agui = new Aguila ("Aguila", "Las crias nacen de huevos", "Omnivoro", "Agresivo", "Aereo", 5);
	Avestruz aves = new Avestruz ("Avestruz", "Las crias nacen de huevos", "Omnivoro", "Agresivo", "Terrestre", 3);
	Cocodrilo coco = new Cocodrilo ("Cocodrilo", "Las crias nacen de huevos", "Carnivoro", "Agresivo", "Semiacuatico", 2);
	Foca foc = new Foca ("Foca", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Semiacuatico", 4);
	Gorillas gori = new Gorillas ("Gorilla", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 6);
	Jirafa jira = new Jirafa ("Jirafa", "Las crias se desarrollan en el vientre de su madre", "Herbivoros", "Pacifico", "Terrestre", 3);
	Leon leo = new Leon ("Leon", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 1);
	Leopardos leopar = new Leopardos ("Leopardo", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 4);
	Loro lor = new Loro ("Loro", "Las crias nacen de huevos", "Omnivoro", "Pacifico", "Aereo", 8);
	Oso_Panda pan = new Oso_Panda ("Oso Panda", "Las crias se desarrollan en el vientre de su madre", "Herbivoro", "Pacifico", "Terrestre", 3);
	Oso_Pardo par = new Oso_Pardo ("Oso Pardo", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 2);
	Oso_Polar pol = new Oso_Polar ("Oso Polar", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Semiacuatico", 2);
	Pinguino pin = new Pinguino ("Pinguino", "Las crias nacen de huevos", "Carnivoro", "Pacifico", "Semiacuatico", 4);
	Rinoceronte rino = new Rinoceronte ("Rinoceronte", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 3);
	Tigres tig = new Tigres ("Tigre", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 3);

	
Scanner scanner = new Scanner  (System.in);

public static JFrame vista;
protected JButton botonbuscar;
protected JButton botoningresar;
protected JLabel label; 

public IG() {

	this.vista = new JFrame("Main");
	
	this.label = new JLabel("Bienvenido");
	this.label.setBounds(200, 50, 100, 50);
	this.vista.add(label);
	
	
	this.botonbuscar = new JButton("Buscar un Animal");
	this.botonbuscar.setBounds(25, 200, 200, 50);
	this.botonbuscar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	Buscar_View bv = new Buscar_View();
        	vista.setContentPane(bv.getPanelbuscar());
        	vista.invalidate();
        	vista.validate();
        }
    });
	this.vista.add(botonbuscar);
	
	this.botoningresar = new JButton("Ingresar un animal");
	this.botoningresar.setBounds(250, 200, 200, 50);
	this.botoningresar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        	Ingresar_View iv = new Ingresar_View();
        	vista.setContentPane(iv.getJPanelingresar());
        	vista.invalidate();
        	vista.validate();
        }
    });
	this.vista.add(botoningresar);
	
	this.vista.setSize(500, 500);
	this.vista.setLayout(null);
	this.vista.setVisible(true);
}

//Methods
}









    
   
	
	
	
	
	
	
	
	
	

