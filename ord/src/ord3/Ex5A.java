package ord3;

import java.util.Arrays;

public class Ex5A {
	public static void main(String[] args) {
		int vet[] = { 4, 7, 1, 3, 2, 5};
		System.out.println("Antes: " + Arrays.toString(vet));
		insercao(vet);
		System.out.println("Depois: " + Arrays.toString(vet));
	}

	public static void insercao(int vet[]) {
		int p = 1;
		for (int i = 1; i < vet.length; i++) {
			int aux = vet[i];
			int j = i - 1;
			while (j >= 0 && vet[j] > aux) {
				vet[j + 1] = vet[j];
				System.out.println("Contagem: "+ p + Arrays.toString(vet));
				p ++;
				j--;
			}
			vet[j + 1] = aux;
		}
	}
}
