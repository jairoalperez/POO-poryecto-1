package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Pacifismo;

public class Loro extends Animal implements Pacifismo {
	
	public Loro(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Loro", "Las crias nacen de huevos", "Omnivoro", "Pacifico", "Aereo", 8);
		
	}

	@Override
	public String pacifico() {
		return "Si eres amigable con los loros, ellos tambien lo seran contigo :)";
	}

}
