package ord;

import java.util.Arrays;

public class Ex2 {
    public static void bolha1(int vet[])
    {
       for(int i=1; i<= vet.length-1; i++)
          for(int j=0; j<vet.length-1; j++)
             if(vet[j]>vet[j+1])
             {
                int aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
             }
    }


    public static void bolha2(int vet[])
    {
       for(int i=1; i<= vet.length-1; i++)
          for(int j=0; j<vet.length-i; j++)
             if(vet[j]>vet[j+1])
             {
                int aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
             }
    }




    public static void bolha3(int vet[])
    {
          int aux;
          boolean troca;
          int j=vet.length-1;

          do {
             troca=false;
             for (int i=0; i<j; i++)
                  if (vet[i]>vet[i+1]) {
                        aux=vet[i];
                        vet[i]=vet[i+1];
                        vet[i+1]=aux;
                        troca=true;
                  }
             j--;
          }while (troca);
    }
    public static void main(String args[]) {
    	int vet[] = {2,5,7,4,3,9,8};
    	int vet2[] = {2,5,7,4,3,9,8};
    	int vet3[] = {2,5,7,4,3,9,8};
    	bolha1(vet);
    	bolha2(vet2);
    	bolha3(vet3);
    	
	    System.out.println(Arrays.toString(vet));
	    System.out.println(Arrays.toString(vet2));
	    System.out.println(Arrays.toString(vet3));
    }
}
