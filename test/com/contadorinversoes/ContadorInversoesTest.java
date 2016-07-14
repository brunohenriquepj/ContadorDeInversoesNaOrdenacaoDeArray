package com.contadorinversoes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.contadorinversoes.excecoes.ArrayVazioException;

public class ContadorInversoesTest {
	
	private ContadorInversoes contador;
	
	@Before
	public void inicializaObjeto(){
		contador = new ContadorInversoes();
	}
	
	@Test
	public void deveContarZeroInversoesNaOrdenacaoDeUmArray() throws Exception{
		int[] a = {5, 7, 9, 20, 36};
		assertEquals(0, contador.contaInversoes(a));
	}

	@Test
	public void deveContarDuasInversoesNaOrdenacaoDeUmArray() throws Exception{
		int[] a = {3, 1, 2};
		assertEquals(2, contador.contaInversoes(a));
	}
	
	@Test
	public void deveContarCincoInversoesNaOrdenacaoDeUmArray() throws Exception{
		int[] a = {2, 3, 8, 6, 1};
		assertEquals(5, contador.contaInversoes(a));
	}
	
	@Test
	public void deveContarOnzeInversoesNaOrdenacaoDeUmArray() throws Exception{
		int[] a = {38, 27, 43, -5, 9, 82, 10};
		assertEquals(11, contador.contaInversoes(a));
	}
	
	@Test(expected=ArrayVazioException.class)
	public void deveTratarUmArrayVazio() throws Exception {
			int[] a = {};
			assertEquals(0, contador.contaInversoes(a));
	}
	
}
