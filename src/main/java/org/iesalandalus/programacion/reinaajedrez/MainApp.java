package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;


public class MainApp {
	private static Reina reina;
	
	public static void main(String[] args) throws OperationNotSupportedException {
		Consola.MostrarMenu();
		int operacion = Consola.elegirOpcionMenu();
		ejecutarOpcion(operacion);
		
		while(operacion < 4) {
			Consola.MostrarMenu();
			operacion = Consola.elegirOpcionMenu();
			ejecutarOpcion(operacion);
		}
		Consola.Despedirse();
	}
	
	public static void crearReinaDefecto() {
		reina = new Reina();
	}
	
	public static void crearReinaColor(Color color) {
		reina = new Reina(color);
	}
	
	public static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
		switch (opcion) {
		case 1: 
			crearReinaDefecto();
			mostrarReina();
			break;
		case 2:
			Color color = Consola.elegirOpcion();
			crearReinaColor(color);
			mostrarReina();
			break;
		case 3:
			mover();
			mostrarReina();
			break;
		case 4:
			Consola.Despedirse();
			break;
		}
	}
	
	private static void mover() throws OperationNotSupportedException {
		if(reina==null) {
			System.out.println("Primero tienes que crear la reina");
		}
		else {
			Consola.mostrarMenuDirecciones();
			Direccion direccion = Consola.elegirDireccion();
			int pasos = Consola.elegirPasos();
			reina.mover(direccion, pasos);
		}
		
	}

	public static void mostrarReina() {
		System.out.println(reina.toString());
	}
}
