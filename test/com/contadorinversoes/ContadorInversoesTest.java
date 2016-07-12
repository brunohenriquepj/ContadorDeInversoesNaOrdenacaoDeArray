package com.contadorinversoes;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContadorInversoesTest {

	@Test
	public void deveContarDuasInversoesNaOrdenacaoDeUmArray() throws Exception{
		ContadorInversoes contador = new ContadorInversoes();
		
		int[] a = {3, 1, 2};
		long totalInversoes = contador.contarInversoes(a);
		
		assertEquals(2, totalInversoes);
	}
	
	@Test
	public void deveContarCincoInversoesNaOrdenacaoDeUmArray() throws Exception{
		ContadorInversoes contador = new ContadorInversoes();
		
		int[] a = {2, 3, 8, 6, 1};
		long totalInversoes = contador.contarInversoes(a);
		
		assertEquals(5, totalInversoes);
	}
	
	@Test
	public void deveContarOnzeInversoesNaOrdenacaoDeUmArray() throws Exception{
		ContadorInversoes contador = new ContadorInversoes();
		
		int[] a = {38, 27, 43, -5, 9, 82, 10};
		long totalInversoes = contador.contarInversoes(a);
		
		assertEquals(11, totalInversoes);
	}
}
