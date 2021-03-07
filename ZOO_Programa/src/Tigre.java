
public class Tigre extends Animal implements Alimentacion_Carne {
	
	public Tigre(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Tigre de bengala", "Jaula uno", "Agresivo",  "Mamifero", 220);

	}

	@Override
	public String Carne() {
		return "A este animal hay que alimentarlo con carne";
	}


}
