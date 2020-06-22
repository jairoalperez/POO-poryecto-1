package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Foca extends Animal implements Agresividad{

	public Foca(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Foca", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Semiacuatico", 4);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con las focas, pueden ser peligrosas!!!";
	}


}
