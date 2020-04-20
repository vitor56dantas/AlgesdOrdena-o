package ord2;

import java.util.Arrays;

public class Ex2 {
    public static void selecao(int vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] < vet[indMenor])
                indMenor = j;
          }
          int aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
    public static void main(String args[]) {
    	int vet[] = {2,5,7,4,3,9,8};

    	selecao(vet);
    	
	    System.out.println(Arrays.toString(vet));

    }

}
