package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Avestruz extends Animal implements Agresividad{

	public Avestruz(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Avestruz", "Las crias nacen de huevos", "Omnivoro", "Agresivo", "Terrestre", 3);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con las avestruces, pueden ser peligrosas!!!"; }

}
