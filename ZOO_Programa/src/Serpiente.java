
public class Serpiente   extends Animal implements Alimentacion_Insectos {
	
	public Serpiente(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {
		
		super("Serpiente Boa", "Jaula tres", "Agresivo", "Reptil", 13);

	}

	@Override
	public String Insectos() {
		return "A este animal hay que alimentarlo con insectos o roedores";
	}


}

	


	





