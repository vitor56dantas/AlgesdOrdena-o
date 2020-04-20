package ord5;

import java.util.Arrays;

public class Ex3 {
	public static void quickSort(int vet[]) {
		quickSort(vet, 0, vet.length - 1);
	}

	private static void quickSort(int vet[], int esquerda, int direita) {
		int indice = particao(vet, esquerda, direita);
		if (esquerda < indice - 1)
			quickSort(vet, esquerda, indice - 1);
		if (indice < direita - 1)
			quickSort(vet, indice + 1, direita);
	}

	private static int particao(int vet[], int esquerda, int direita) {
		int i = esquerda, j = direita, aux;
		int pivo = vet[esquerda];
		while (i < j) {
			while (vet[j] < pivo) {
				j--;
			}
			if (i >= j) {
				return i;
			}
			aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
			i++;
			while (vet[i] > pivo) {
				i++;
			}
			aux = vet[i];
			vet[i] = vet[j];
			vet[j] = aux;
			j--;
		}
		return i;
	}

	public static void main(String args[]) {
		int vet[] = { 2, 5, 7, 4, 3, 9, 8 };

		quickSort(vet);

		System.out.println(Arrays.toString(vet));

	}

}
