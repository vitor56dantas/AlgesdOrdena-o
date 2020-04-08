package ord2;

public class Ex3 {
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

	}
