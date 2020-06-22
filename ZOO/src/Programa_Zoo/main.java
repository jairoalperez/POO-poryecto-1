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

public class main {

	public static void main(String[] args) {
		
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
	
		
	Scanner scanner = new Scanner (System.in);

		System.out.print("Hola, Sr. Gerente. Este programa le ayudara a tener informacion especifica acerca de los animales del zoo.\n\nEl sistema es sencillo, solo tiene que introducir el numero correspondiente a la opcion que desea seleccionar.\n\n(1.Deseo buscar un animal)\n(2.Deseo introducir un animal nuevo al sistema)\nSu opcion es: ");
        int x = scanner.nextInt();
        
        switch (x) {
        
            case 1: 
            	System.out.print("\nSeleccione segun que caracteristicas desea buscar al animal:\n\n(1.Tipo de reproduccion)\n(2.Tipo de alimentacion)\n(3.Tipo de temperamento)\n(4.Tipo de Habitat)\nSu opcion es: ");
            	int y = scanner.nextInt();
            	
                switch (y) {
                
                    case 1:
                    	System.out.print("\nSeleccione el tipo de reproduccion que tiene el animal que desea buscar:\n\n(1.Nacimiento mediante huevos)\n(2.Nacimiento desde el vientre de la madre)\nSu opcion es: ");
                    	int a = scanner.nextInt();
                    	
                    	switch (a) {
                    	
                    	    case 1:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Aguila)\n(2.Avestruz)\n(3.Cocodrilo)\n(4.Loro)\n(5.Pinguino)\nSu opcion es: ");
                    	    	int aa = scanner.nextInt();
                    	    	
                    	    	switch (aa) {
                    	    	
                    	    	    case 1: System.out.print("\nTipo de Animal: "+agui.getTipo()+"\nReproduccion: "+agui.getReproduccion()+"\nAlimentacion: "+agui.getAlimentacion()+"\nTemperamento: "+agui.getTemperamento()+"\nTipo de Habitat: "+agui.getHabitat()+"\nCantidad en el Zoo: "+agui.getCantidad()+"\n\nCONSEJO: "+agui.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 2: System.out.print("\nTipo de Animal: "+aves.getTipo()+"\nReproduccion: "+aves.getReproduccion()+"\nAlimentacion: "+aves.getAlimentacion()+"\nTemperamento: "+aves.getTemperamento()+"\nTipo de Habitat: "+aves.getHabitat()+"\nCantidad en el Zoo: "+aves.getCantidad()+"\n\nCONSEJO: "+aves.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 3: System.out.print("\nTipo de Animal: "+coco.getTipo()+"\nReproduccion: "+coco.getReproduccion()+"\nAlimentacion: "+coco.getAlimentacion()+"\nTemperamento: "+coco.getTemperamento()+"\nTipo de Habitat: "+coco.getHabitat()+"\nCantidad en el Zoo: "+coco.getCantidad()+"\n\nCONSEJO: "+coco.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 4: System.out.print("\nTipo de Animal: "+lor.getTipo()+"\nReproduccion: "+lor.getReproduccion()+"\nAlimentacion: "+lor.getAlimentacion()+"\nTemperamento: "+lor.getTemperamento()+"\nTipo de Habitat: "+lor.getHabitat()+"\nCantidad en el Zoo: "+lor.getCantidad()+"\n\nCONSEJO: "+lor.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 5: System.out.print("\nTipo de Animal: "+pin.getTipo()+"\nReproduccion: "+pin.getReproduccion()+"\nAlimentacion: "+pin.getAlimentacion()+"\nTemperamento: "+pin.getTemperamento()+"\nTipo de Habitat: "+pin.getHabitat()+"\nCantidad en el Zoo: "+pin.getCantidad()+"\n\nCONSEJO: "+pin.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                    	    	    break;
                    	    	
                    	    	} break;
                    	    	
                    	    case 2:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Foca)\n(2.Gorilla)\n(3.Jirafa)\n(4.Leon)\n(5.Leopardo)\n(6.Oso Panda)\n(7.Oso Pardo)\n(8.Oso Polar)\n(9.Rinoceronte)\n(10.Tigre)\nSu opcion es: ");
                    	    	int ab = scanner.nextInt();
                    	    	
                    	    	switch (ab) {
                    	    	
                    	    	    case 1: System.out.print("\nTipo de Animal: "+foc.getTipo()+"\nReproduccion: "+foc.getReproduccion()+"\nAlimentacion: "+foc.getAlimentacion()+"\nTemperamento: "+foc.getTemperamento()+"\nTipo de Habitat: "+foc.getHabitat()+"\nCantidad en el Zoo: "+foc.getCantidad()+"\n\nCONSEJO: "+foc.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 2: System.out.print("\nTipo de Animal: "+gori.getTipo()+"\nReproduccion: "+gori.getReproduccion()+"\nAlimentacion: "+gori.getAlimentacion()+"\nTemperamento: "+gori.getTemperamento()+"\nTipo de Habitat: "+gori.getHabitat()+"\nCantidad en el Zoo: "+gori.getCantidad()+"\n\nCONSEJO: "+gori.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 3: System.out.print("\nTipo de Animal: "+jira.getTipo()+"\nReproduccion: "+jira.getReproduccion()+"\nAlimentacion: "+jira.getAlimentacion()+"\nTemperamento: "+jira.getTemperamento()+"\nTipo de Habitat: "+jira.getHabitat()+"\nCantidad en el Zoo: "+jira.getCantidad()+"\n\nCONSEJO: "+jira.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 4: System.out.print("\nTipo de Animal: "+leo.getTipo()+"\nReproduccion: "+leo.getReproduccion()+"\nAlimentacion: "+leo.getAlimentacion()+"\nTemperamento: "+leo.getTemperamento()+"\nTipo de Habitat: "+leo.getHabitat()+"\nCantidad en el Zoo: "+leo.getCantidad()+"\n\nCONSEJO: "+leo.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 5: System.out.print("\nTipo de Animal: "+leopar.getTipo()+"\nReproduccion: "+leopar.getReproduccion()+"\nAlimentacion: "+leopar.getAlimentacion()+"\nTemperamento: "+leopar.getTemperamento()+"\nTipo de Habitat: "+leopar.getHabitat()+"\nCantidad en el Zoo: "+leopar.getCantidad()+"\n\nCONSEJO: "+leopar.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 6: System.out.print("\nTipo de Animal: "+pan.getTipo()+"\nReproduccion: "+pan.getReproduccion()+"\nAlimentacion: "+pan.getAlimentacion()+"\nTemperamento: "+pan.getTemperamento()+"\nTipo de Habitat: "+pan.getHabitat()+"\nCantidad en el Zoo: "+pan.getCantidad()+"\n\nCONSEJO: "+pan.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 7: System.out.print("\nTipo de Animal: "+par.getTipo()+"\nReproduccion: "+par.getReproduccion()+"\nAlimentacion: "+par.getAlimentacion()+"\nTemperamento: "+par.getTemperamento()+"\nTipo de Habitat: "+par.getHabitat()+"\nCantidad en el Zoo: "+par.getCantidad()+"\n\nCONSEJO: "+par.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 8: System.out.print("\nTipo de Animal: "+pol.getTipo()+"\nReproduccion: "+pol.getReproduccion()+"\nAlimentacion: "+pol.getAlimentacion()+"\nTemperamento: "+pol.getTemperamento()+"\nTipo de Habitat: "+pol.getHabitat()+"\nCantidad en el Zoo: "+pol.getCantidad()+"\n\nCONSEJO: "+pol.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	
                    	    	    case 9: System.out.print("\nTipo de Animal: "+rino.getTipo()+"\nReproduccion: "+rino.getReproduccion()+"\nAlimentacion: "+rino.getAlimentacion()+"\nTemperamento: "+rino.getTemperamento()+"\nTipo de Habitat: "+rino.getHabitat()+"\nCantidad en el Zoo: "+rino.getCantidad()+"\n\nCONSEJO: "+rino.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 10: System.out.print("\nTipo de Animal: "+tig.getTipo()+"\nReproduccion: "+tig.getReproduccion()+"\nAlimentacion: "+tig.getAlimentacion()+"\nTemperamento: "+tig.getTemperamento()+"\nTipo de Habitat: "+tig.getHabitat()+"\nCantidad en el Zoo: "+tig.getCantidad()+"\n\nCONSEJO: "+tig.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                    	    	    break;
                    	    	    
                    	    	} break;
                    	    		    	
                    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
            	    	    break;  
                    	            
                    	} break;              
                                                              
                    case 2:                                    
                    	System.out.print("Por favor seleccione el tipo de alimentacion que tiene el animal:\n\n(1.Carnivoro)\n(2.Herbivoro)\n(3.Omnivoro)\nSu opcion es: ");
                    	int b = scanner.nextInt();
                    	                                  
                    	switch (b) {                          
                    	                                                
                    	    case 1:                                           
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Cocodrilo)\n(2.Foca)\n(3.Gorilla)\n(4.Leon)\n(5.Leopardo)\n(6.Oso Pardo)\n(7.Oso Polar)\n(8.Rinoceronte)\n(9.Tigre)\n(10.Pinguino)\nSu opcion es: ");
                    	    	int ba = scanner.nextInt();
                    	    	                                        
                    	    	switch (ba) {                                        
                    	    	                                                           
                    	    	    case 1: System.out.print("\nTipo de Animal: "+coco.getTipo()+"\nReproduccion: "+coco.getReproduccion()+"\nAlimentacion: "+coco.getAlimentacion()+"\nTemperamento: "+coco.getTemperamento()+"\nTipo de Habitat: "+coco.getHabitat()+"\nCantidad en el Zoo: "+coco.getCantidad()+"\n\nCONSEJO: "+coco.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 2: System.out.print("\nTipo de Animal: "+foc.getTipo()+"\nReproduccion: "+foc.getReproduccion()+"\nAlimentacion: "+foc.getAlimentacion()+"\nTemperamento: "+foc.getTemperamento()+"\nTipo de Habitat: "+foc.getHabitat()+"\nCantidad en el Zoo: "+foc.getCantidad()+"\n\nCONSEJO: "+foc.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 3: System.out.print("\nTipo de Animal: "+gori.getTipo()+"\nReproduccion: "+gori.getReproduccion()+"\nAlimentacion: "+gori.getAlimentacion()+"\nTemperamento: "+gori.getTemperamento()+"\nTipo de Habitat: "+gori.getHabitat()+"\nCantidad en el Zoo: "+gori.getCantidad()+"\n\nCONSEJO: "+gori.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 4: System.out.print("\nTipo de Animal: "+leo.getTipo()+"\nReproduccion: "+leo.getReproduccion()+"\nAlimentacion: "+leo.getAlimentacion()+"\nTemperamento: "+leo.getTemperamento()+"\nTipo de Habitat: "+leo.getHabitat()+"\nCantidad en el Zoo: "+leo.getCantidad()+"\n\nCONSEJO: "+leo.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 5: System.out.print("\nTipo de Animal: "+leopar.getTipo()+"\nReproduccion: "+leopar.getReproduccion()+"\nAlimentacion: "+leopar.getAlimentacion()+"\nTemperamento: "+leopar.getTemperamento()+"\nTipo de Habitat: "+leopar.getHabitat()+"\nCantidad en el Zoo: "+leopar.getCantidad()+"\n\nCONSEJO: "+leopar.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 6: System.out.print("\nTipo de Animal: "+par.getTipo()+"\nReproduccion: "+par.getReproduccion()+"\nAlimentacion: "+par.getAlimentacion()+"\nTemperamento: "+par.getTemperamento()+"\nTipo de Habitat: "+par.getHabitat()+"\nCantidad en el Zoo: "+par.getCantidad()+"\n\nCONSEJO: "+par.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 7: System.out.print("\nTipo de Animal: "+pol.getTipo()+"\nReproduccion: "+pol.getReproduccion()+"\nAlimentacion: "+pol.getAlimentacion()+"\nTemperamento: "+pol.getTemperamento()+"\nTipo de Habitat: "+pol.getHabitat()+"\nCantidad en el Zoo: "+pol.getCantidad()+"\n\nCONSEJO: "+pol.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 8: System.out.print("\nTipo de Animal: "+rino.getTipo()+"\nReproduccion: "+rino.getReproduccion()+"\nAlimentacion: "+rino.getAlimentacion()+"\nTemperamento: "+rino.getTemperamento()+"\nTipo de Habitat: "+rino.getHabitat()+"\nCantidad en el Zoo: "+rino.getCantidad()+"\n\nCONSEJO: "+rino.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 9: System.out.print("\nTipo de Animal: "+tig.getTipo()+"\nReproduccion: "+tig.getReproduccion()+"\nAlimentacion: "+tig.getAlimentacion()+"\nTemperamento: "+tig.getTemperamento()+"\nTipo de Habitat: "+tig.getHabitat()+"\nCantidad en el Zoo: "+tig.getCantidad()+"\n\nCONSEJO: "+tig.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 10: System.out.print("\nTipo de Animal: "+pin.getTipo()+"\nReproduccion: "+pin.getReproduccion()+"\nAlimentacion: "+pin.getAlimentacion()+"\nTemperamento: "+pin.getTemperamento()+"\nTipo de Habitat: "+pin.getHabitat()+"\nCantidad en el Zoo: "+pin.getCantidad()+"\n\nCONSEJO: "+pin.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	
                    	    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                    	    	    break;  
                    	    	
                    	    	} break;
                    	    	
                    	    case 2:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Jirafa)\n(2.Oso Panda)\nSu opcion es: ");
                    	    	int bb = scanner.nextInt();
                    	    	
                    	    	switch (bb) {
                    	    	
                    	    	    case 1: System.out.print("\nTipo de Animal: "+jira.getTipo()+"\nReproduccion: "+jira.getReproduccion()+"\nAlimentacion: "+jira.getAlimentacion()+"\nTemperamento: "+jira.getTemperamento()+"\nTipo de Habitat: "+jira.getHabitat()+"\nCantidad en el Zoo: "+jira.getCantidad()+"\n\nCONSEJO: "+jira.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                	    	        break;
                	    	    
                    	    	    case 2: System.out.print("\nTipo de Animal: "+pan.getTipo()+"\nReproduccion: "+pan.getReproduccion()+"\nAlimentacion: "+pan.getAlimentacion()+"\nTemperamento: "+pan.getTemperamento()+"\nTipo de Habitat: "+pan.getHabitat()+"\nCantidad en el Zoo: "+pan.getCantidad()+"\n\nCONSEJO: "+pan.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                    	    	    break;  
                    	    	
                    	    	} break;
                    	    	
                    	    case 3:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Avestruz)\n(2.Aguila)\n(3.Loro)\nSu opcion es: ");
                    	    	int bc = scanner.nextInt();
                    	        
                    	    	switch (bc) {
                    	    	
                    	    	    case 1: System.out.print("\nTipo de Animal: "+aves.getTipo()+"\nReproduccion: "+aves.getReproduccion()+"\nAlimentacion: "+aves.getAlimentacion()+"\nTemperamento: "+aves.getTemperamento()+"\nTipo de Habitat: "+aves.getHabitat()+"\nCantidad en el Zoo: "+aves.getCantidad()+"\n\nCONSEJO: "+aves.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 2: System.out.print("\nTipo de Animal: "+agui.getTipo()+"\nReproduccion: "+agui.getReproduccion()+"\nAlimentacion: "+agui.getAlimentacion()+"\nTemperamento: "+agui.getTemperamento()+"\nTipo de Habitat: "+agui.getHabitat()+"\nCantidad en el Zoo: "+agui.getCantidad()+"\n\nCONSEJO: "+agui.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    case 3: System.out.print("\nTipo de Animal: "+lor.getTipo()+"\nReproduccion: "+lor.getReproduccion()+"\nAlimentacion: "+lor.getAlimentacion()+"\nTemperamento: "+lor.getTemperamento()+"\nTipo de Habitat: "+lor.getHabitat()+"\nCantidad en el Zoo: "+lor.getCantidad()+"\n\nCONSEJO: "+lor.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                    	    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                    	    	    break;
                    	    	
                    	    	} break;
                    	    
                    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
            	    	    break;
                    	    	
                    	} break;
                    	
                    case 3:
                    	System.out.print("Por favor seleccione el temperamento que tiene el animal:\n\n(1.Agresivo)\n(2.Pacifico)\nSu opcion es: ");
                    	int c = scanner.nextInt();
                    	
                    	switch (c) {
                    	
                    	    case 1: 
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Cocodrilo)\n(2.Foca)\n(3.Gorilla)\n(4.Leon)\n(5.Leopardo)\n(6.Oso Pardo)\n(7.Oso Polar)\n(8.Rinoceronte)\n(9.Tigre)\n(10.Aguila)\n(11.Avestruz)\nSu opcion es: ");
                	    	    int ca = scanner.nextInt();
                    	    
                	    	    switch (ca) {
                	    	
                	    	        case 1: System.out.print("\nTipo de Animal: "+coco.getTipo()+"\nReproduccion: "+coco.getReproduccion()+"\nAlimentacion: "+coco.getAlimentacion()+"\nTemperamento: "+coco.getTemperamento()+"\nTipo de Habitat: "+coco.getHabitat()+"\nCantidad en el Zoo: "+coco.getCantidad()+"\n\nCONSEJO: "+coco.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 2: System.out.print("\nTipo de Animal: "+foc.getTipo()+"\nReproduccion: "+foc.getReproduccion()+"\nAlimentacion: "+foc.getAlimentacion()+"\nTemperamento: "+foc.getTemperamento()+"\nTipo de Habitat: "+foc.getHabitat()+"\nCantidad en el Zoo: "+foc.getCantidad()+"\n\nCONSEJO: "+foc.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 3: System.out.print("\nTipo de Animal: "+gori.getTipo()+"\nReproduccion: "+gori.getReproduccion()+"\nAlimentacion: "+gori.getAlimentacion()+"\nTemperamento: "+gori.getTemperamento()+"\nTipo de Habitat: "+gori.getHabitat()+"\nCantidad en el Zoo: "+gori.getCantidad()+"\n\nCONSEJO: "+gori.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 4: System.out.print("\nTipo de Animal: "+leo.getTipo()+"\nReproduccion: "+leo.getReproduccion()+"\nAlimentacion: "+leo.getAlimentacion()+"\nTemperamento: "+leo.getTemperamento()+"\nTipo de Habitat: "+leo.getHabitat()+"\nCantidad en el Zoo: "+leo.getCantidad()+"\n\nCONSEJO: "+leo.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 5: System.out.print("\nTipo de Animal: "+leopar.getTipo()+"\nReproduccion: "+leopar.getReproduccion()+"\nAlimentacion: "+leopar.getAlimentacion()+"\nTemperamento: "+leopar.getTemperamento()+"\nTipo de Habitat: "+leopar.getHabitat()+"\nCantidad en el Zoo: "+leopar.getCantidad()+"\n\nCONSEJO: "+leopar.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 6: System.out.print("\nTipo de Animal: "+par.getTipo()+"\nReproduccion: "+par.getReproduccion()+"\nAlimentacion: "+par.getAlimentacion()+"\nTemperamento: "+par.getTemperamento()+"\nTipo de Habitat: "+par.getHabitat()+"\nCantidad en el Zoo: "+par.getCantidad()+"\n\nCONSEJO: "+par.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 7: System.out.print("\nTipo de Animal: "+pol.getTipo()+"\nReproduccion: "+pol.getReproduccion()+"\nAlimentacion: "+pol.getAlimentacion()+"\nTemperamento: "+pol.getTemperamento()+"\nTipo de Habitat: "+pol.getHabitat()+"\nCantidad en el Zoo: "+pol.getCantidad()+"\n\nCONSEJO: "+pol.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 8: System.out.print("\nTipo de Animal: "+rino.getTipo()+"\nReproduccion: "+rino.getReproduccion()+"\nAlimentacion: "+rino.getAlimentacion()+"\nTemperamento: "+rino.getTemperamento()+"\nTipo de Habitat: "+rino.getHabitat()+"\nCantidad en el Zoo: "+rino.getCantidad()+"\n\nCONSEJO: "+rino.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	    
            	    	            case 9: System.out.print("\nTipo de Animal: "+tig.getTipo()+"\nReproduccion: "+tig.getReproduccion()+"\nAlimentacion: "+tig.getAlimentacion()+"\nTemperamento: "+tig.getTemperamento()+"\nTipo de Habitat: "+tig.getHabitat()+"\nCantidad en el Zoo: "+tig.getCantidad()+"\n\nCONSEJO: "+tig.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
                	    	
            	    	            case 10: System.out.print("\nTipo de Animal: "+agui.getTipo()+"\nReproduccion: "+agui.getReproduccion()+"\nAlimentacion: "+agui.getAlimentacion()+"\nTemperamento: "+agui.getTemperamento()+"\nTipo de Habitat: "+agui.getHabitat()+"\nCantidad en el Zoo: "+agui.getCantidad()+"\n\nCONSEJO: "+agui.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                	    	        break;
                	    	    
            	    	            case 11: System.out.print("\nTipo de Animal: "+aves.getTipo()+"\nReproduccion: "+aves.getReproduccion()+"\nAlimentacion: "+aves.getAlimentacion()+"\nTemperamento: "+aves.getTemperamento()+"\nTipo de Habitat: "+aves.getHabitat()+"\nCantidad en el Zoo: "+aves.getCantidad()+"\n\nCONSEJO: "+aves.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                	    	        break;
                	    	    
            	    	            default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                	    	        break;
                	    	
                	    	    } break;
                	    	
                    	    case 2:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Jirafa)\n(2.Loro)\n(3.Oso Panda)\n(4.Pinguino)\nSu opcion es: ");
                	    	    int cb = scanner.nextInt();
                	    	    
                	    	    switch (cb) {
                	    	    
                	    	        case 1: System.out.print("\nTipo de Animal: "+jira.getTipo()+"\nReproduccion: "+jira.getReproduccion()+"\nAlimentacion: "+jira.getAlimentacion()+"\nTemperamento: "+jira.getTemperamento()+"\nTipo de Habitat: "+jira.getHabitat()+"\nCantidad en el Zoo: "+jira.getCantidad()+"\n\nCONSEJO: "+jira.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                	    	        break;
                	    	        
                	    	        case 2: System.out.print("\nTipo de Animal: "+lor.getTipo()+"\nReproduccion: "+lor.getReproduccion()+"\nAlimentacion: "+lor.getAlimentacion()+"\nTemperamento: "+lor.getTemperamento()+"\nTipo de Habitat: "+lor.getHabitat()+"\nCantidad en el Zoo: "+lor.getCantidad()+"\n\nCONSEJO: "+lor.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                	    	        case 3: System.out.print("\nTipo de Animal: "+pan.getTipo()+"\nReproduccion: "+pan.getReproduccion()+"\nAlimentacion: "+pan.getAlimentacion()+"\nTemperamento: "+pan.getTemperamento()+"\nTipo de Habitat: "+pan.getHabitat()+"\nCantidad en el Zoo: "+pan.getCantidad()+"\n\nCONSEJO: "+pan.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                	    	        case 4: System.out.print("\nTipo de Animal: "+pin.getTipo()+"\nReproduccion: "+pin.getReproduccion()+"\nAlimentacion: "+pin.getAlimentacion()+"\nTemperamento: "+pin.getTemperamento()+"\nTipo de Habitat: "+pin.getHabitat()+"\nCantidad en el Zoo: "+pin.getCantidad()+"\n\nCONSEJO: "+pin.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                	    	        default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                	    	        break;
                	    	    
                	    	    } break;
                	    	
                    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
        	    	        break;
                    	
                    	} break;
                    	
                    case 4:
                    	System.out.print("Por favor seleccione el tipo de habitat en el que vive el animal:\n\n(1.Terrestre)\n(2.Semiacuatico)\n(3.Aereo)\nSu opcion es: ");
                    	int d = scanner.nextInt();
                    	
                    	switch (d) {
                    	
                    	    case 1:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Avestruz)\n(2.Gorilla)\n(3.Jirafa)\n(4.Leon)\n(5.Leopardo)\n(6.Oso Pardo)\n(7.Rinoceronte)\n(8.Tigre)\n(9.Oso Panda)\nSu opcion es: ");
                	    	    int da = scanner.nextInt();
                	    	    
                	    	    switch (da) {
                	    	    
                	    	        case 1: System.out.print("\nTipo de Animal: "+aves.getTipo()+"\nReproduccion: "+aves.getReproduccion()+"\nAlimentacion: "+aves.getAlimentacion()+"\nTemperamento: "+aves.getTemperamento()+"\nTipo de Habitat: "+aves.getHabitat()+"\nCantidad en el Zoo: "+aves.getCantidad()+"\n\nCONSEJO: "+aves.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	        
                	    	        case 2: System.out.print("\nTipo de Animal: "+gori.getTipo()+"\nReproduccion: "+gori.getReproduccion()+"\nAlimentacion: "+gori.getAlimentacion()+"\nTemperamento: "+gori.getTemperamento()+"\nTipo de Habitat: "+gori.getHabitat()+"\nCantidad en el Zoo: "+gori.getCantidad()+"\n\nCONSEJO: "+gori.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
        	    	                break;
        	    	            
                	    	        case 3: System.out.print("\nTipo de Animal: "+jira.getTipo()+"\nReproduccion: "+jira.getReproduccion()+"\nAlimentacion: "+jira.getAlimentacion()+"\nTemperamento: "+jira.getTemperamento()+"\nTipo de Habitat: "+jira.getHabitat()+"\nCantidad en el Zoo: "+jira.getCantidad()+"\n\nCONSEJO: "+jira.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	        
                	    	        case 4: System.out.print("\nTipo de Animal: "+leo.getTipo()+"\nReproduccion: "+leo.getReproduccion()+"\nAlimentacion: "+leo.getAlimentacion()+"\nTemperamento: "+leo.getTemperamento()+"\nTipo de Habitat: "+leo.getHabitat()+"\nCantidad en el Zoo: "+leo.getCantidad()+"\n\nCONSEJO: "+leo.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
        	    	                break;
        	    	            
                	    	        case 5: System.out.print("\nTipo de Animal: "+leopar.getTipo()+"\nReproduccion: "+leopar.getReproduccion()+"\nAlimentacion: "+leopar.getAlimentacion()+"\nTemperamento: "+leopar.getTemperamento()+"\nTipo de Habitat: "+leopar.getHabitat()+"\nCantidad en el Zoo: "+leopar.getCantidad()+"\n\nCONSEJO: "+leopar.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
        	    	                break;
        	    	            
                	    	        case 6: System.out.print("\nTipo de Animal: "+par.getTipo()+"\nReproduccion: "+par.getReproduccion()+"\nAlimentacion: "+par.getAlimentacion()+"\nTemperamento: "+par.getTemperamento()+"\nTipo de Habitat: "+par.getHabitat()+"\nCantidad en el Zoo: "+par.getCantidad()+"\n\nCONSEJO: "+par.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
        	    	                break;
        	    	            
                	    	        case 7: System.out.print("\nTipo de Animal: "+rino.getTipo()+"\nReproduccion: "+rino.getReproduccion()+"\nAlimentacion: "+rino.getAlimentacion()+"\nTemperamento: "+rino.getTemperamento()+"\nTipo de Habitat: "+rino.getHabitat()+"\nCantidad en el Zoo: "+rino.getCantidad()+"\n\nCONSEJO: "+rino.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
        	    	                break;
        	    	            
                	    	        case 8: System.out.print("\nTipo de Animal: "+tig.getTipo()+"\nReproduccion: "+tig.getReproduccion()+"\nAlimentacion: "+tig.getAlimentacion()+"\nTemperamento: "+tig.getTemperamento()+"\nTipo de Habitat: "+tig.getHabitat()+"\nCantidad en el Zoo: "+tig.getCantidad()+"\n\nCONSEJO: "+tig.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
        	    	                break;
        	    	            
                	    	        case 9: System.out.print("\nTipo de Animal: "+pan.getTipo()+"\nReproduccion: "+pan.getReproduccion()+"\nAlimentacion: "+pan.getAlimentacion()+"\nTemperamento: "+pan.getTemperamento()+"\nTipo de Habitat: "+pan.getHabitat()+"\nCantidad en el Zoo: "+pan.getCantidad()+"\n\nCONSEJO: "+pan.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                	    	        break;
                	    	        
                	    	        default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                	    	        break;
                	    	    
                	    	    } break;
                	    	    
                    	    case 2:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Cocodrilo)\n(2.Foca)\n(3.Oso Polar)\n(4.Pinguino)\nSu opcion es: ");
                	    	    int db = scanner.nextInt();
                	    	    
                	    	    switch (db) {
                	    	    
                	    	        case 1: System.out.print("\nTipo de Animal: "+coco.getTipo()+"\nReproduccion: "+coco.getReproduccion()+"\nAlimentacion: "+coco.getAlimentacion()+"\nTemperamento: "+coco.getTemperamento()+"\nTipo de Habitat: "+coco.getHabitat()+"\nCantidad en el Zoo: "+coco.getCantidad()+"\n\nCONSEJO: "+coco.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	            
                	    	        case 2: System.out.print("\nTipo de Animal: "+foc.getTipo()+"\nReproduccion: "+foc.getReproduccion()+"\nAlimentacion: "+foc.getAlimentacion()+"\nTemperamento: "+foc.getTemperamento()+"\nTipo de Habitat: "+foc.getHabitat()+"\nCantidad en el Zoo: "+foc.getCantidad()+"\n\nCONSEJO: "+foc.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	            
                	    	        case 3: System.out.print("\nTipo de Animal: "+pol.getTipo()+"\nReproduccion: "+pol.getReproduccion()+"\nAlimentacion: "+pol.getAlimentacion()+"\nTemperamento: "+pol.getTemperamento()+"\nTipo de Habitat: "+pol.getHabitat()+"\nCantidad en el Zoo: "+pol.getCantidad()+"\n\nCONSEJO: "+pol.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
            	    	            break;
            	    	            
                	    	        case 4: System.out.print("\nTipo de Animal: "+pin.getTipo()+"\nReproduccion: "+pin.getReproduccion()+"\nAlimentacion: "+pin.getAlimentacion()+"\nTemperamento: "+pin.getTemperamento()+"\nTipo de Habitat: "+pin.getHabitat()+"\nCantidad en el Zoo: "+pin.getCantidad()+"\n\nCONSEJO: "+pin.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                	    	        default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                	    	        break;
                	    	    
                	    	    } break;
                	    	    
                    	    case 3:
                    	    	System.out.print("\nEn esta categoria estan disponibles los siguientes animales:\n\n(1.Aguila)\n(2.Loro)\nSu opcion es: ");
                	    	    int dc = scanner.nextInt();
                    	    	
                	    	    switch (dc) {
                	    	    
                	    	        case 1: System.out.print("\nTipo de Animal: "+agui.getTipo()+"\nReproduccion: "+agui.getReproduccion()+"\nAlimentacion: "+agui.getAlimentacion()+"\nTemperamento: "+agui.getTemperamento()+"\nTipo de Habitat: "+agui.getHabitat()+"\nCantidad en el Zoo: "+agui.getCantidad()+"\n\nCONSEJO: "+agui.agresivo()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                	    	        break;
                	    	        
                	    	        case 2: System.out.print("\nTipo de Animal: "+lor.getTipo()+"\nReproduccion: "+lor.getReproduccion()+"\nAlimentacion: "+lor.getAlimentacion()+"\nTemperamento: "+lor.getTemperamento()+"\nTipo de Habitat: "+lor.getHabitat()+"\nCantidad en el Zoo: "+lor.getCantidad()+"\n\nCONSEJO: "+lor.pacifico()+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                    	    	    break;
                    	    	    
                	    	        default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
                	    	        break;
                	    	    
                	    	    } break;
                	    	    
                    	    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
        	    	        break;
                	    	    
                    	} break;
                    	
                    default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo.");
	    	        break;
                
                } break;
                
            case 2:
            	System.out.print("\nSeleccione a continuacion las caracteristicas del animal:\n\nTipo: ");
            	tip = scanner.next();
            	
            	System.out.print("\nReproduccion: (1.Nacimiento mediante huevos) (2.Nacimiento desde el vientre de la madre)\nSu opcion es: ");
            	int repn = scanner.nextInt();
            	
            	System.out.print("\nAlimentacion: (1.Carnivoro) (2.Herbivoro) (3.Omnivoro)\nSu opcion es: ");
            	int alimn = scanner.nextInt();
            	
            	System.out.print("\nTemperamento: (1.Agresivo) (2.Pacifico)\nSu opcion es: ");
            	int temn = scanner.nextInt();
            	
            	System.out.print("\nHabitat: (1.Terrestre) (2.Semiacuatico) (3.Aereo)\nSu opcion es: ");
            	int habn = scanner.nextInt();
            	
            	System.out.print("\nCantidad de este animal que llegara al Zoo: ");
                cant = scanner.nextInt();
                
                System.out.print("\nEscribe un consejo para tratar con el animal: ");
                String consejo = scanner.next();
                
                switch (repn) {
                case 1: rep = "Las crias nacen de huevos"; break;
                case 2: rep = "Las crias se desarrollan en el vientre de su madre"; break;
                default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo."); break; }
                
                switch (alimn) {
                case 1: alim = "Carnivoro"; break;
                case 2: alim = "Herbivoro"; break;
                case 3: alim = "Omnivoro"; break;
                default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo."); break; }
                
                switch (temn) {
                case 1: tem = "Agresivo"; break;
                case 2: tem = "Pacifico"; break;
                default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo."); break; }
                
                switch (habn) {
                case 1: hab = "Terrestre"; break;
                case 2: hab = "Semiacuatico"; break;
                case 3: hab = "Aereo"; break;
                default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo."); break; }
                
                System.out.print("\n\nHA LLEGADO UN NUEVO ANIMAL AL ZOO!!!\n\nSus caracteristicas son las siguientes:\n\nTipo de Animal: "+tip+"\nReproduccion: "+rep+"\nAlimentacion: "+alim+"\nTemperamento: "+tem+"\nTipo de Habitat: "+hab+"\nCantidad en el Zoo: "+cant+"\n\nCONSEJO: "+consejo+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");
                
        break;
        
        default: System.out.println("EL NUMERO QUE INGRESASTE ES INCORRECTO.\n\nPor favor, inicia el programa de nuevo."); 
        break; }
        
} 		
}
