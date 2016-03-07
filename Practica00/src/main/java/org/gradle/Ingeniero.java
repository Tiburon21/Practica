package org.gradle;

public class Ingeniero{
	private Herramienta herramienta;
	/* (non-Javadoc)
	 * @see org.gradle.Herramienta#reparar(org.gradle.Computadora)
	 */
	public void reparar(Computadora computadora){
		herramienta.reparar(computadora);
	}

}
