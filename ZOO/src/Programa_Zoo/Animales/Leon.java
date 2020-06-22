package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Leon extends Animal implements Agresividad{

	public Leon(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Leon", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 1);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con los leones, pueden ser peligrosos!!!";
	}

}
