
public class Cocodrilo  extends Animal implements Alimentacion_Pescado {
	
	public Cocodrilo(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Cocodrilo Australiano", "Piscina dos", "Agresivo", "Reptil", 1000);

	}

	@Override
	public String Pescado() {
		return "A este animal hay que alimentarlo con pescado";
	}


}

	


	


