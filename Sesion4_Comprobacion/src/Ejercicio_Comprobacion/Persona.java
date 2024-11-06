package Ejercicio_Comprobacion;

public class Persona {

	private String nombre;
	private int edad;
	private int peso;
	private double altura;

	public Persona(String nombre, int edad, int peso, double altura) {
		
			this.nombre = nombre;
			this.edad = edad;
			this.peso = peso;
			this.altura = altura;
	}
	
	public void SetNombre(String nombre) {
		
		this.nombre = nombre;
	}
	public void SetEdad(int edad) {
		
		this.edad = edad;
	}
	public void SetPeso(int peso) {
		
		this.peso = peso;
	}
	public void SetAltura(double altura) {
		
		this.altura = altura;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	public int getEdad() {
		
		return this.edad;
	}
	public int getPeso() {
		
		return this.peso;
	}
	public double getAltura() {
		
		return this.altura;
	}
	
	
}

