package Clases;

import java.util.Scanner;

public class Comida {
	private String nombre="";	
	private double cantidad=0;

Scanner tec = new Scanner(System.in);
	public Comida(String nombre, double cantidad){
		this.nombre=nombre;
		this.cantidad=cantidad;
	}

	public String getNombre() {
		return nombre="PAPAS FRITAS";
		
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCantidad() {
		return cantidad=23.8;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public static void main(String[] args) {
Comida b = new Comida(null, 0);
System.out.println("MENU DE COMIDA");
System.out.println();
		System.out.println("NOMBRE: "+b.getNombre());
		System.out.println("CANTIDAD: "+b.getCantidad());
	}
}

