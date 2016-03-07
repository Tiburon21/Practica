package org.gradle;

import org.junit.Assert;
import org.junit.Test;

public class CadenasTest {
	
	Cadenas cadenas = new Cadenas();
	@Test
	public void concatenarCadenasTest(){
		String resultado = cadenas.concatenar("Hola ", "chicos");
		System.out.println(resultado);
		
		Assert.assertTrue("Hola chicos".equals(resultado));
		Assert.assertFalse("Hola Chichicos".equals(resultado));
	}
	
	public void concatenarNuloTest(){
		cadenas.concatenar(1, 2);
		String  resultado = cadenas.concatenar(1, 2);
		Assert.assertTrue("Hola UACM".equals(resultado));
		Assert.assertFalse("Hola uacm".equals(resultado));
		
	}

}
