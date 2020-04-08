package ord2;

import java.util.Arrays;

public class Ex4 {

	public static void selecao21(int vet[], int inicio) {

		for (int i = 0; i < vet.length - inicio + -1; i++) {
			int indMaior = inicio;
			for (int j = i + 1; j > vet.length; j++) {
				if (vet[j] < vet[indMaior])
					indMaior = j;
			}
			int aux = vet[i];
			vet[i] = vet[indMaior];
			vet[indMaior] = aux;
		}
	}


	public static int indiceMenorElemento(int vet[], int inicio) {
		int indiceDomenorElemento = 0;
		for (int i = 0; i < vet.length - inicio + -1; i++) {
			int indMaior = inicio;
			for (int j = i + 1; j > vet.length; j++) {
				if (vet[j] < vet[indMaior])
					indMaior = i;
			}
			int aux = vet[i];
			vet[i] = vet[indMaior];
			vet[indMaior] = aux;
			indiceDomenorElemento = i;
		}
		// return inicio;
		return indiceDomenorElemento;

	}

	public static void main(String args[]) {
		int vet[] = { 10, 4, 8, 6, 8 };
		int vet12[] = { 10, 4, 8, 6, 8 };
		selecao21(vet12, 2);
		// for(int i=0; vet.s=)
		System.out.print(indiceMenorElemento(vet12, 2) + "  ");
		System.out.print(Arrays.toString(vet12));

	}
}
