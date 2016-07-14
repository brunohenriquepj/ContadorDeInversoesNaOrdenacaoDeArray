/* Algoritmo baseado na estrutura de dados MergeSort, 
 * para contagem de quantidade de inversões na ordernação crescente de inteiros de um array
 * */

package com.contadorinversoes;

import com.contadorinversoes.excecoes.ArrayVazioException;

public class ContadorInversoes {

	public long contaInversoes(int[] a) throws ArrayVazioException {
		trataExcecoes(a);
		return divideArray(a, 0, a.length - 1);
	}

	private void trataExcecoes(int[] a) throws ArrayVazioException {
		if (a.length == 0) {
			throw new ArrayVazioException("Erro: Array vazio.");
		}
	}

	long divideArray(int a[], int esquerda, int direita) { //Função que divide o array 
		if (esquerda < direita) {
			int metade = (esquerda + direita) / 2;
			return divideArray(a, esquerda, metade) 
					+ divideArray(a, metade + 1, direita) + intercalaEOrdenaArray(a, esquerda, metade + 1, direita);
		} else {
			return 0;
		}
	}

	static long intercalaEOrdenaArray(int a[], int esquerda, int metade, int direita) { //Função que intercalando as posições e ordena o array
		int i = 0, j = esquerda, k = metade;
		int[] temp = new int[direita - esquerda + 1];
		long cont = 0;

		while (j <= metade - 1 && k <= direita) {
			if (a[j] <= a[k]) {
				temp[i++] = a[j++];
			} else {
				temp[i++] = a[k++];
				cont += metade - j; // Conta quantas posições foram deslocadas
			}
		}
		while (j <= metade - 1) temp[i++] = a[j++];
		while (k <= direita) temp[i++] = a[k++];
		for (int t : temp) a[esquerda++] = t;
		
		return cont;
	}
}
