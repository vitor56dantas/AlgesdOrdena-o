package ord3;

import java.util.Arrays;

public class Ex3 {
	public static void insercao(int vet[]) {
		for (int i = 1; i < vet.length; i++) {
			int aux = vet[i];
			int j = i - 1;
			while (j >= 0 && vet[j] < aux) {
				vet[j + 1] = vet[j];
				j--;
			}
			vet[j + 1] = aux;
		}
	}

	public static void main(String args[]) {
		int vet2[] = { 2, 5, 7, 4, 3, 9, 8 };
		insercao(vet2);

		System.out.println(Arrays.toString(vet2));
	}
}
