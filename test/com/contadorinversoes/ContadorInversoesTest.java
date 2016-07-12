package com.contadorinversoes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorInversoesTest {

	@Test
	public void deveContarInversoesNaOrdenacaoDeUmArray() throws Exception{
		ContadorInversoes contador = new ContadorInversoes();
		
		int[] a = {2,3,8,6,1};
		long totalInversoes = contador.contarInversoes(a);
		
		assertEquals(5, totalInversoes);
		
	}
}
