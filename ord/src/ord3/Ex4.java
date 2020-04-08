package ord3;

import java.util.Arrays;

public class Ex4 {
		public static void selecao(int vet[]) {
			for (int i = 0; i < vet.length - 1; i++) {
				int indMaior = i;
				for (int j = i + 1; j < vet.length; j++) {
					if (vet[j] > vet[indMaior])
						indMaior = j;
				}
				int aux = vet[i];
				vet[i] = vet[indMaior];
				vet[indMaior] = aux;
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

		public static void insercao(int vet[]) {
			for (int i = 1; i < vet.length; i++) {
				int aux = vet[i];
				int j = i - 1;
				while (j >= 0 && vet[j] > aux) {
					vet[j + 1] = vet[j];
					j--;
				}
				vet[j + 1] = aux;
			}
		}

		public static void main(String args[]) {


			String saida1 = "\nMetodo da Bolha\n";
			String saida2 = "\nMetodo da Seleção\n";
			String saida3 = "\nMetodo da Inserção\n";

			for (int tam = 5000; tam <= 40000; tam = tam + 5000) {
				int vet1[] = new int[tam];
				int vet2[] = new int[tam];
				int vet3[] = new int[tam];

				// Preenchendo os vetores com elementos aleatorios de 0 a 999
				for (int i = 0; i < tam; i++)
					vet1[i] = vet2[i] = vet3[i] = (int) (Math.random() * 1000);

				long tempoAntes = System.currentTimeMillis();
				bolha2(vet1);
				long tempoDepois = System.currentTimeMillis();
				saida1 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";

				tempoAntes = System.currentTimeMillis();
				selecao(vet2);
				tempoDepois = System.currentTimeMillis();
				saida2 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";

				tempoAntes = System.currentTimeMillis();
				insercao(vet3);
				tempoDepois = System.currentTimeMillis();
				saida3 += "Tamanho = " + tam + "  => Tempo = " + (tempoDepois - tempoAntes) + " ms\n";

			}

			System.out.println(saida1);
			System.out.println(saida2);
			System.out.println(saida3);

		}

	}
