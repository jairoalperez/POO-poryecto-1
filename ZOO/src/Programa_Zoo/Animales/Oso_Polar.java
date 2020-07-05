package Programa_Zoo.Animales;

import Programa_Zoo.Animal;
import Programa_Zoo.Interfaaces.Agresividad;

public class Oso_Polar extends Animal implements Agresividad{

	public Oso_Polar(String tipo, String reproduccion, String alimentacion, String temperamento, String habitat, int cantidad) {
		super("Oso Polar", "Las crias se desarrollan en el vientre de su madre", "Carnivoro", "Agresivo", "Semiacuatico", 2);
		
	}

	@Override
	public String agresivo() {
		return "Ten cuidado con los osos polares, pueden ser peligrosos!!!";
	}

}
