package org.gradle;

public class Cadenas {

	public String concatenar(String string, String string2) {
		return string.concat(string2);
		
	}

	public String concatenar(int i, int j) {
		String cadena = "Hola";
		String cadena2 = "UACM";
		String resultado = null;
		
		if(i==1 && j==2)
			resultado =cadena.concat(cadena2);		
			return resultado;
	}

}
