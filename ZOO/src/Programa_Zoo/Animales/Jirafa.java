package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Pacifismo;

public class Jirafa extends Animal implements Pacifismo{
	
	public Jirafa(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Jirafa", "Las crias se desarrollan en el vientre de su madre", "Herbivoros", "Pacifico", "Terrestre", 3);
		
	}

	@Override
	public String pacifico() {
		return "Si eres amigable con las jirafas, ellas tambien lo seran contigo :)";
	}
	
	
}
