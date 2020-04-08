package ord2;

import java.util.Arrays;

public class Ex5 {
	public static void selecao(int vet[]) {
		for (int i = 0; i < vet.length - 1; i++) {
			int indMenor = i;
			for (int j = i + 1; j < vet.length; j++) {
				if (vet[j] < vet[indMenor])
					indMenor = j;
			}
			int aux = vet[i];
			vet[i] = vet[indMenor];
			vet[indMenor] = aux;
		}
	}

	public static void bolha2(int vet[]) {
		for (int i = 1; i <= vet.length - 1; i++)
			for (int j = 0; j < vet.length - i; j++)
				if (vet[j] > vet[j + 1]) {
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
	}

	public static void main(String args[]) {
		int vet[] = { 10, 4, 8, 6, 8 };
		int vet12[] = { 10, 4, 8, 6, 8 };
		selecao(vet);
		// for(int i=0; vet.s=)
		System.out.print(Arrays.toString(vet12));
		System.out.print(Arrays.toString(vet));

		// Exercio 5
		String saida1 = "\nMetodo da Bolha\n";
		String saida2 = "\nMetodo da Seleção\n";

		for (int tam = 5000; tam <= 40000; tam = tam + 5000) {
			int vet1[] = new int[tam];
			int vet2[] = new int[tam];

			// Preenchendo os vetores com elementos aleatorios de 0 a 999
			for (int i = 0; i < tam; i++)
				vet1[i] = vet2[i] = (int) (Math.random() * 1000);

			long tempoAntes = System.currentTimeMillis();
			bolha2(vet1);
			long tempoDepois = System.currentTimeMillis();
			saida1 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";

			tempoAntes = System.currentTimeMillis();
			selecao(vet2);
			tempoDepois = System.currentTimeMillis();
			saida2 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";

		}

		System.out.println(saida1);
		System.out.println(saida2);

	}

}
