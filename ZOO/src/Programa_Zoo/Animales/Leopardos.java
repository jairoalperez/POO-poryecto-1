package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Leopardos extends Animal implements Agresividad{

	public Leopardos(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Leopardo", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 4);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con los leopardos, pueden ser peligrosos!!!";
		
	}
	
}
