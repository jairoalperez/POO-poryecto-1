package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Tigres extends Animal implements Agresividad {

	public Tigres(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Tigre", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 3);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con los tigres, pueden ser peligrosos!!!";
	}

}
