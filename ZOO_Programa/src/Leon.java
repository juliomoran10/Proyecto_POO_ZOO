
public class Leon  extends Animal implements Alimentacion_Carne {
	
	public Leon(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Leon del congo", "Jaula cuatro", "Agresivo",  "Mamifero", 180);

	}

	@Override
	public String Carne() {
		return "A este animal hay que alimentarlo con carne";
	}


}



