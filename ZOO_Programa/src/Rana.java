
public class Rana extends Animal implements Alimentacion_Insectos {
	
	public Rana(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Rana iberica", "Campo dos ", "Amigable", "Anfibio", 2);

	}

	@Override
	public String Insectos() {
		return "A este animal hay que alimentarlo con insectos ";
	}


}

	
