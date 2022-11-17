package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;


public class Consola {

	public static void MostrarMenu() {
		System.out.println("1- Crear reina por defecto");
		System.out.println("2- Crear reina eligiendo el color");
		System.out.println("3- Mover");
		System.out.println("4- Salir");
	}
	
	public static int elegirOpcionMenu() {
		int eleccion = 0;
		while (eleccion > 4 || eleccion < 1) {
			System.out.println("Pon una opcion");
			eleccion = Entrada.entero();
		}
		return eleccion;
	}
	
	public static Color elegirOpcion() {
		System.out.println("Elije el color:");
		System.out.println("1 - Negro");
		System.out.println("2 - Blanco");
		int colorOpcion = Entrada.entero();
		while (colorOpcion<1 || colorOpcion>2) {
			System.out.println("Elije el color:");
			System.out.println("1 - Negro");
			System.out.println("2 - Blanco");
			colorOpcion = Entrada.entero();
		}
		Color color = null;
		switch (colorOpcion) {
		case 1: 
			color = Color.NEGRO;
			break;
		case 2:
			color = Color.BLANCO;
			break;
		}
		return color;
	}
	
	public static void mostrarMenuDirecciones() {
		System.out.println("1 - Norte");
		System.out.println("2 - Sur");
		System.out.println("3 - Este");
		System.out.println("4 - Oeste");
		System.out.println("5 - Noreste");
		System.out.println("6 - Noroeste");
		System.out.println("7 - Sureste");
		System.out.println("8 - Suroeste");
	}
	
	public static Direccion elegirDireccion() {
		int direccionOpcion;
		System.out.println("Porfavor elige una direccion: ");
		direccionOpcion = Entrada.entero();
		while (direccionOpcion<1 && direccionOpcion>8) {
			System.out.println("Porfavor elige una direccion: ");
			direccionOpcion = Entrada.entero();	
		}
		Direccion direccion = null;
		switch (direccionOpcion) {
		case 1: 
			direccion  = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.SUR;
			break;
		case 3: 
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.OESTE;
			break;
		case 5: 
			direccion = Direccion.NORESTE;
			break;
		case 6:
			direccion = Direccion.NOROESTE;
			break;
		case 7: 
			direccion = Direccion.SURESTE;
			break;
		case 8:
			direccion = Direccion.SUROESTE;
			break;
		}
		return direccion;
	}
	
	public static int elegirPasos() {
		int pasos = 0;
		while (pasos<1 || pasos > 7) {
			System.out.println("Escribe el numero de pasos a realizar: ");
			pasos = Entrada.entero();
		}
		return pasos;
	}
	
	public static void Despedirse() {
		System.out.println("Adios");
	}
}
