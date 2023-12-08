package Clases;
import java.util.Scanner;
public class Bebida {
	private String nombre="";
	private String marca="";
	private double capacidad=0.0; 

	Scanner tec = new Scanner(System.in);
	public Bebida(String nombre, String marca, double capacidad){
		this.nombre=nombre;
		this.marca=marca;
		this.capacidad=capacidad;
	}

	public String getNombre() {
		return nombre="VINO BLANCO";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca="SUMMIA";
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidad() {
		return capacidad=10.6;
		
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}
	
	public static void main(String[] args) {
	Bebida a = new Bebida("SIDRA SIN ALCOHOL", "SAMSUNG",9.3);
        System.out.println("PRIMERA FORMA DESDE LA INSTANCIA DE LA CLASE");
		System.out.println();
	    System.out.println("NOMBRE: " + a.nombre);
		System.out.println("MARCA: " + a.marca);
		System.out.println("CAPACIDAD: " + a.capacidad);
		System.out.println();
		System.out.println("SEGUNDA FORMA DESDE LOS METODOS GET DE LA CLASE");
		System.out.println();
		System.out.println("CAPACIDAD: " + a.getCapacidad());
		System.out.println("MARCA: "+a.getMarca());
		System.out.println("NOMBRE: " + a.getNombre());
    }
}
