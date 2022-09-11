package com.init;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Persona persona1 = new Persona();
		
		persona1.setEdad(5);
		persona1.setNombre("Pepe");
		persona1.setTelefono(32200000);
		
		System.out.println("La edad de " + persona1.getNombre() + " es " 
		+ persona1.getEdad() + " y su telefono es " + persona1.getTelefono());
		
	}
	
	

	
	
}

class Persona {
	
	private int edad;
	private String nombre;
	private int telefono;
	
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}


