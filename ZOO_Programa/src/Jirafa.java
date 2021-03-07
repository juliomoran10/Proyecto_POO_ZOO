
public class Jirafa  extends Animal implements Alimentacion_Plantas {
	
	public Jirafa(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Jirafa del sur", "Campo 1", "Amigable", "Mamifero", 800);

	}

	@Override
	public String Plantas() {
		return "A este animal hay que alimentarlo con plantas";
	}


}



