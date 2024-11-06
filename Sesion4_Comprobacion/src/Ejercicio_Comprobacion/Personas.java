package Ejercicio_Comprobacion;



public class Personas {

	private Personas[] personas;
	private int contador;
	
	public Personas(int capacidad) {
		
		personas= new Personas[capacidad];
		contador = 0;
		
	}
	
	public void AgregarPersona(Persona persona) {
		
		if(contador < personas.length) {
			
			System.out.println();
			System.out.println("\n"+persona.getNombre()+" : ");
			System.out.println("\nCalculando IMC....");
			double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
			System.out.println("\nSu indice de masa corporal es : "+imc);
			if(imc < 18.5) {
				System.out.println("Usted se encuentra Bajo peso");
			}
			else if(imc > 18.5 && imc < 24.9) {
				
				System.out.println("Usted se encuentra con Peso normal");
			}
			else if(imc >24.9 && imc <29.9) {
				
				System.out.println("Usted se encuentra con Sobrepeso");
			}
			else {
				System.out.println("Usted se encuentra con Obesidad");
			}
			System.out.println("\nSu edad es: "+persona.getEdad());
			if(persona.getEdad()< 18) {
				System.out.println("Usted es menor de edad");
			}
			else {
				System.out.println("Usted es mayor de edad");
			}
			System.out.println("\nPersona : [nombre = "+ persona.getNombre() +", edad = "+persona.getEdad() +", peso = "+persona.getPeso()+", altura = "+persona.getAltura()+"]");
		}
		else {
			
			System.err.println("Ha sobrepasado el limite de personas para agregar");
		}
		
	}
	
	public static void main(String[] args) {
		
		Personas persona = new Personas(5);
		persona.AgregarPersona(new Persona ("Felipe Villegas", 35, 90, 1.80));
		persona.AgregarPersona(new Persona ("Cristian Valenzuela", 32, 70, 1.60));
		persona.AgregarPersona(new Persona ("Dario Fernandez", 25, 100, 1.90));
		persona.AgregarPersona(new Persona ("Reynaldo Gallardo", 44, 50, 1.70));
		persona.AgregarPersona(new Persona ("Lorena Muñoz", 33, 60, 1.60));
		
		
		
	}
}


