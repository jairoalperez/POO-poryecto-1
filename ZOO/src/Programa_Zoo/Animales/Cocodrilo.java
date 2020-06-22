package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Cocodrilo extends Animal implements Agresividad{

	public Cocodrilo(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Cocodrilo", "Las crias nacen de huevos", "Carnivoro", "Agresivo", "Semiacuatico", 2);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con los cocodrilos, pueden ser peligrosos!!!";
	}

}
