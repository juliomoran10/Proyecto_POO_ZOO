
public abstract class Animal {
	

		protected String tipo, habitat, comportamiento, clasificacion;
		protected int peso;

	    //Constructor
		public Animal(String tipo, String habitat, String comportamiento, String clasificacion,  int peso) {

			this.tipo = tipo;
			this.habitat = habitat;
			this.comportamiento = comportamiento;
			this.clasificacion = clasificacion;
			this.peso = peso; }
		
		//Getters

		public String getTipo() {
			return tipo;
		}

		public String getHabitat() {
			return habitat;
		}

		public String getComportamiento() {
			return comportamiento;
		}

		public String getClasificacion() {
			return clasificacion;
		}

		public int getPeso() {
			return peso;
		}

		
		
	}

