//MANUEL_CORREDERA_SALDAÑA
package org.iesalandalus.programacion.reinaajedrez;

public enum Color {
	BLANCO("Blanco"),
	NEGRO("Negro");
	
	private String cadenaAMostrar;

	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	}
	
	public String toString() {
		return cadenaAMostrar;
	}
}
