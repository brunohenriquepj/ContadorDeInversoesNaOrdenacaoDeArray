/* Algoritmo baseado na estrutura de dados MergeSort, 
 * para contagem de quantidade de inversões na ordernação crescente de inteiros de um array
 * */

package com.contadorinversoes;

public class ContadorInversoes {

	public long contarInversoes(int[] a) {
		return mergeSort(a, 0, a.length - 1);
	}

	long mergeSort(int a[], int esquerda, int direita) { //Função que divide o array
		int metade;
		long cont = 0; //Variável 'cont' responsável por contar as inversões 

		if (esquerda < direita) {
			metade = (esquerda + direita) / 2;
			cont = mergeSort(a, esquerda, metade);
			cont += mergeSort(a, metade + 1, direita);
			cont += merge(a, esquerda, metade + 1, direita);
		}

		return cont;
	}

	static long merge(int a[], int esquerda, int metade, int direita) { //Função que ordena o array, intercalando as posições
		int tamanho = direita - esquerda + 1;
		int[] temp = new int[tamanho];
		int i = 0, j = esquerda, k = metade;
		long cont = 0;

		while (j <= metade - 1 && k <= direita) {
			if (a[j] <= a[k]) {
				temp[i] = a[j];
				i++;
				j++;
			} else {
				temp[i] = a[k];
				cont += metade - j; // Conta quantas posições foram deslocadas, soma com 'cont' e retorna para o mesmo
				i++;
				k++;
			}
		}
		while (j <= metade - 1) {
			temp[i] = a[j];
			i++;
			j++;
		}
		while (k <= direita) {
			temp[i] = a[k];
			i++;
			k++;
		}
		i = 0;
		while (esquerda <= direita) {
			a[esquerda] = temp[i];
			esquerda++;
			i++;
		}

		return cont;
	}
}
