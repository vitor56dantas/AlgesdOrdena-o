package ord4;

import java.util.Arrays;

public class Ex4 {
    public static void mergeSort(int vet[])
    {
       int vetaux[] = new int[vet.length];
       mergeSort(vet, 0, vet.length-1, vetaux);  
    }
    
    public  static void mergeSort(int vet[], int inicio, int fim, int vetaux[])
    {
       if(fim-inicio >= 1) 
       {
          int meio = (inicio + fim)/2;
          mergeSort(vet, inicio, meio, vetaux);
          mergeSort(vet, meio+1, fim, vetaux);
          mescla(vet, inicio, meio, fim, vetaux);
       }
     }
  
    public  static void mescla(int vet[], int inicio, int meio, int fim, int vetaux[])
    {
       int i=inicio;
       int j=meio+1;
       int k=inicio;
  
       while(k <= fim)
       {
          if(i <= meio && j <= fim)
          {
             if(vet[i] < vet[j])
             {
                vetaux[k] = vet[i];
                i++; k++;
             }
             else
             {
                vetaux[k] = vet[j];
                j++; k++;
             }
          }
          else if(i > meio)
          {
             vetaux[k] = vet[j];
             j++; k++;
          }
          else
          {
             vetaux[k] = vet[i];
             i++; k++;
          }
       }
     
       for(i=inicio; i <= fim; i++)
          vet[i] = vetaux[i];
    }
	   public static void main(String args[]) {
	    	int vet[] = {2,5,11,7,4,15,3,22,34,6,27,10,9,8,1,20};
	    	//De acordo com o os comentarios do blogs StackOverflow e Algesd, a eficiencia do metodo MergeSort é melhor quando  
	    	//o tamanho de um vetor é maior que 7, então a melhor forma de otimizar ele é pondo um vetor de tamanho maior que 7. 

	    	mergeSort(vet);
	    	
		    System.out.println(Arrays.toString(vet));

	    }

}
