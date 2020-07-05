package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Gorillas extends Animal implements Agresividad{

		public Gorillas(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
			super("Gorilla", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 6);
			
		}

		@Override
		public String agresivo() {
			return "Ten cuidado con los gorillas, pueden ser peligrosos!!!";
		}
	
	
}
