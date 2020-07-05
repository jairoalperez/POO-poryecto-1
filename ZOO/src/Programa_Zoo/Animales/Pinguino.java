package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Pacifismo;

public class Pinguino extends Animal implements Pacifismo{
	
	public Pinguino(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Pinguino", "Las crias nacen de huevos", "Carnivoro", "Pacifico", "Semiacuatico", 4);
		
	}

	@Override
	public String pacifico() {
		return "Si eres amigable con los pinguinos, ellos tambien lo seran contigo :)";
	}

	
}
