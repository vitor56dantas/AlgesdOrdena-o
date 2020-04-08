package ord;

import java.util.Arrays;

public class Ex3 {
	   public static void bolha2(int vet[])
	    {
	       for(int i=1; i<= vet.length-1; i++)
	          for(int j=0; j<vet.length-i; j++)
	             if(vet[j]<vet[j+1])
	             {
	                int aux = vet[j];
	                vet[j] = vet[j+1];
	                vet[j+1] = aux;
	             }
	    }
	    public static void main(String args[]) {
	    	int vet2[] = {2,5,7,4,3,9,8};
	    	bolha2(vet2);

		    System.out.println(Arrays.toString(vet2));

	    }
	}


