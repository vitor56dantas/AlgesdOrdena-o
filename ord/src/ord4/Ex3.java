package ord4;

import java.util.Arrays;

public class Ex3 {
	public static void mergeSort(int vet[]) {
		int vetaux[] = new int[vet.length];
		mergeSort(vet, 0, vet.length - 1, vetaux);
	}

	public static void mergeSort(int vet[], int inicio, int fim, int vetaux[]) {
		if (fim - inicio >= 1) // 2 ou mais elementos
		{
			int meio = (inicio + fim) / 2;
			mergeSort(vet, inicio, meio, vetaux);
			mergeSort(vet, meio + 1, fim, vetaux);
			mescla(vet, inicio, meio, fim, vetaux);
		}

		// n�o h� nada que fazer com menos de 2 elementos
	}

	public static void mescla(int vet[], int inicio, int meio, int fim, int vetaux[]) {
		int i = inicio;
		int j = meio + 1;
		int k = inicio;

		while (k <= fim) // organizando em vetaux
		{
			if (i <= meio && j <= fim) {
				if (vet[i] < vet[j]) {
					vetaux[k] = vet[i];
					i++;
					k++;
				} else {
					vetaux[k] = vet[j];
					j++;
					k++;
				}
			} else if (i > meio) {
				vetaux[k] = vet[j];
				j++;
				k++;
			} else {
				vetaux[k] = vet[i];
				i++;
				k++;
			}
		}

		for (i = inicio; i <= fim; i++) // copiando de volta de vetaux para vet
			vet[i] = vetaux[i];
	}

	public static void main(String args[]) {

		String saida1 = "\nMerge sort\n";
		String saida2 = "\nArrays.sort\n";

		for (int tam = 100000; tam <= 1000000; tam = tam + 100000) {
			int vet1[] = new int[tam];
			int vet2[] = new int[tam];

			for (int i = 0; i < tam; i++)
				vet1[i] = vet2[i] = (int) (Math.random() * 1000);

			long tempoAntes = System.currentTimeMillis();
			mergeSort(vet1);
			long tempoDepois = System.currentTimeMillis();
			saida1 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";

			tempoAntes = System.currentTimeMillis();
			Arrays.sort(vet2);
			tempoDepois = System.currentTimeMillis();
			saida2 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";
			
			

		}

		System.out.println(saida1);
		System.out.println(saida2);

	}

}
