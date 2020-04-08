package ord;

public class Ex4 {
	public static boolean ordenado(int vet[]) {
		for (int i = 1; i <= vet.length - 1; i++)
			for (int j = 0; j < vet.length - i; j++)
				if (vet[j] > vet[j+1]) { 
					return false;
				}
		return true;
	}
	   public static void main(String args[]) {
	    	int vet[] = {0, 1, 2, 3};
		    System.out.println(ordenado(vet));
		    
		    int vet2[] = {0, 1, -1, 2, 3};
		    System.out.println(ordenado(vet2));

	    }
}
