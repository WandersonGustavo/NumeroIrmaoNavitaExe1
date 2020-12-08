package br.com.Navita;

import org.junit.Test;

import junit.framework.TestCase;

public class NumerosIrmaosTest extends TestCase {

	@Test
	public void testar() {
		String n2="321";
		String retorna=NumerosIrmaos.retornarReusltado("123");
		assertEquals(n2, retorna);
	}
	
}
