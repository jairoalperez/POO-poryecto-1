package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Pacifismo;

public class Oso_Panda extends Animal implements Pacifismo{
	
	public Oso_Panda(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Oso Panda", "Las crias se desarrollan en el vientre de su madre", "Herbivoro", "Pacifico", "Terrestre", 3);
		
	}

	@Override
	public String pacifico() {
		return "Si eres amigable con los osos panda, ellos tambien lo seran contigo :)";
	}

}
