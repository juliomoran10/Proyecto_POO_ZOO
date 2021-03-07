
public class Pinguino   extends Animal implements Alimentacion_Pescado {
	
	public Pinguino(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Pinguino Emperador", "Piscina uno", "Amigable", "Ave", 60);

	}

	@Override
	public String Pescado() {
		return "A este animal hay que alimentarlo con pescado y plankton";
	}


}

	

