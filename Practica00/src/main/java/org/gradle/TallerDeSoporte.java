package org.gradle;

public class TallerDeSoporte {
	public static void main(String[] args) {
		Herramienta herramienta = new Desarmador();
		Ingeniero ingeniero = new Ingeniero();
		ingeniero.setHerramienta(herramienta);
		Computadora computadora = new Computadora();
		ingeniero.reparar(computadora);
	}

}
