package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Oso_Pardo extends Animal implements Agresividad{

	public Oso_Pardo(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Oso Pardo", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Terrestre", 2);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con los osos pardos, pueden ser peligrosos!!!";
	}

}
