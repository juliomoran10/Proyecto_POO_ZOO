
public class Aguila  extends Animal implements Alimentacion_Carne {
	
	public Aguila(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Aguila Real", "Jaula dos", "Agresivo", "Ave", 4);

	}

	@Override
	public String Carne() {
		return "A este animal hay que alimentarlo con carne";
	}


}

	

