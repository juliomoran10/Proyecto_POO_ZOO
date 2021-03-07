import com.sun.java_cup.internal.runtime.Scanner;

public class Main {

	public static void main(String[] args) {
		String tip = null, hab = null, comp = null, clasif = null;
		int peso = 0; 

	Aguila agui= new Aguila ("Aguila Real", "Jaula dos", "Agresivo", "Ave", 4);
	Cocodrilo coco = new Cocodrilo ("Cocodrilo Australiano", "Piscina dos", "Agresivo", "Reptil", 1000);
	Jirafa jira = new Jirafa ("Jirafa del sur", "Campo 1", "Amigable", "Mamifero", 800);
	Leon leo = new Leon ("Leon del congo", "Jaula cuatro", "Agresivo",  "Mamifero", 180);
	Pinguino Ping = new Pinguino ("Pinguino Emperador", "Piscina uno", "Amigable", "Ave", 60);
	Rana rana = new Rana ("Rana iberica", "Campo dos ", "Amigable", "Anfibio", 2);
	Serpiente ser = new Serpiente ("Serpiente Boa", "Jaula tres", "Agresivo", "Reptil", 13);
	Tigre tig = new Tigre ("Tigre de bengala", "Jaula uno", "Agresivo",  "Mamifero", 220);

	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Bienvenido al programa del ZOO central del Zulia");
	
	System.out.println("________________________________________________________");
	
	switch (opcion) {
	
	case 1: 
		System.out.println("1.Lista de Animales registrados");
		int x = scanner.nextInt();

        switch (x) {
        System.out.print("\nEstos son los animales registrados:\n\n(1.Aguila)\n(2.Cocodrilo)\n(3.Jirafa)\n(4.Leon)\n(5.Pinguino)\n(6.Rana)\n(7.Serpiente)\n(Tigre)\n Este es el animal seleccionado: ");
        System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	

    	    case 1: System.out.print("\nTipo de Animal: "+agui.getTipo()+"\nTipo: "+agui.gethabitat()+"\nHabitat: "+agui.getComportamiento()+"\nComportamiento: "+agui.getComportamiento()+"\nClasificacion: "+agui.Clasificacion()+"\nPeso: "+agui.Peso()+"\n\nAlimentacion: "+agui.Carne()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;

    	    case 2: System.out.print("\nTipo de Animal: "+coco.getTipo()+"\nTipo: "+.coco.getHabitat"\nHabitat: "+coco.getComportamiento()+"\nComportamiento: "+coco.getComportamiento()+"\nClasificacion: "+coco.Clasificacion()+"\nPeso: "+coco.Peso()+"\n\nAlimentacion: "+coco.Pescado()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;

    	    case 3: System.out.print("\nTipo de Animal: "+jira.getTipo()+"\nTipo: "+.jira.getHabitat"\nHabitat: "+jira.getComportamiento()+"\nComportamiento: "+jira.getComportamiento()+"\nClasificacion: "+jira.Clasificacion()+"\nPeso: "+jira.Peso()+"\n\nAlimentacion: "+jira.Plantas()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;

    	    case 4: System.out.print("\nTipo de Animal: "+coco.getTipo()+"\nTipo: "+.leo.getHabitat"\nHabitat: "+leo.getComportamiento()+"\nComportamiento: "+leo.getComportamiento()+"\nClasificacion: "+leo.Clasificacion()+"\nPeso: "+leo.Peso()+"\n\nAlimentacion: "+leo.Carne()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;

    	    case 5: System.out.print("\nTipo de Animal: "+ping.getTipo()+"\nTipo: "+.ping.getHabitat"\nHabitat: "+ping.getComportamiento()+"\nComportamiento: "+ping.getComportamiento()+"\nClasificacion: "+ping.Clasificacion()+"\nPeso: "+ping.Peso()+"\n\nAlimentacion: "+ping.Pescado()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;
    	    
    	    case 6: System.out.print("\nTipo de Animal: "+rana.getTipo()+"\nTipo: "+.rana.getHabitat"\nHabitat: "+rana.getComportamiento()+"\nComportamiento: "+rana.getComportamiento()+"\nClasificacion: "+rana.Clasificacion()+"\nPeso: "+rana.Peso()+"\n\nAlimentacion: "+rana.Insectos()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;
    	    
    	    case 7: System.out.print("\nTipo de Animal: "+ser.getTipo()+"\nTipo: "+.ser.getHabitat"\nHabitat: "+ser.getComportamiento()+"\nComportamiento: "+ser.getComportamiento()+"\nClasificacion: "+ser.Clasificacion()+"\nPeso: "+ser.Peso()+"\n\nAlimentacion: "+ser.Insectos()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;
    	    
    	    case 8: System.out.print("\nTipo de Animal: "+tig.getTipo()+"\nTipo: "+.tig.getHabitat"\nHabitat: "+tig.getComportamiento()+"\nComportamiento: "+tig.getComportamiento()+"\nClasificacion: "+tig.Clasificacion()+"\nPeso: "+tig.Peso()+"\n\nAlimentacion: "+tig.Carne()+"\n\n\n\nSi desea usar otra de sus funciones solo vuelve a iniciarlo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;

    	    default: System.out.println("Numero incorrecto, introducir entre 1 y 8 .\n\nPor favor, inicia el programa de nuevo.");
    	    System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
    	    break;
    	    
       
            }
              
	case 2 : System.out.println("2.Agregar nuevos animales");
	 System.out.println("_____________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
	 
	System.out.print("\nSeleccione a continuacion las caracteristicas del animal:\n\nTipo: ");
 	tip = scanner.next();

 	System.out.print("\nHabitat: (1.Jaula) (2.Campo) (3.Piscina)\nSu opcion es: ");
 	int alimn = scanner.nextInt();

 	System.out.print("\nComportamiento: (1.Amigable) (2.Agresivo)\nSu opcion es: ");
 	int temn = scanner.nextInt();

 	System.out.print("\nClasificacion: (1.Mamifero) (2.Ave) (3.Anfibio) (4.Reptil)\nSu opcion es: ");
 	int habn = scanner.nextInt();

     System.out.print("\nTipo de alimentacion: ");
     String alimentacion = scanner.next();
     String tipo = scanner.next();
     String nombre = scanner.next();

  

     switch (habitat) {
     case 1: habitat = "Jaula"; break;
     case 2: Habitat = "Campo"; break;
     case 3: Habitat = "Piscina"; break;
     default: System.out.println("Solo ingresar numeros de 1 a 3.\n\nPor favor, inicia el programa de nuevo."); break; }

     switch (Comportamiento) {
     case 1: Comportamiento = "Amigable"; break;
     case 2: tem = "Agresivo"; break;
     default: System.out.println("Solo ingresar numero de 1 a 2.\n\nPor favor, inicia el programa de nuevo."); break; }

     switch (clasificaciom) {
     case 1: clasificacion = "Mamifero"; break;
     case 2: clasificacion = "Ave"; break;
     case 3: Clasificacion = "Anfibio"; break;
     case 4: clasificacion = "Reptil"; break;
     default: System.out.println("Solo ingresar numero del 1 a 4.\n\nPor favor, inicia el programa de nuevo."); break; }

     System.out.print("\n\nAnimal Anadido\n\nSus caracteristicas son las siguientes:\n\\nnombre:"+nombre+"\ntipo:"+tipo+"\nHabitat: "+habitat+"\nComportamiento: "+comportamiento+"\nClasificacion: "+clasificacion+\nAlimentacion: "+alimentacion+"\n\n\n\nGracias por usar el programa. Si desea usar otra de sus funciones solo vuelve a iniciarlo.");

break;

default: System.out.println("solo introducir numeros de 1 a 2 .\n\nPor favor, inicia el programa de nuevo."); 
break; }


    	
	   } break;

	}
}