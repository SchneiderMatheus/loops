import java.util.Random;

public class Arrays4 {
    public static void main(String[] args) {
        // vetor invertido

         Random valorR = new Random();

         int tamanho = valorR.nextInt(5)+5;

         int[] vetorA = new int[tamanho];
         int[] vetorB = new int[tamanho];

         for(int i=0; i<tamanho; i++){
            vetorA[i]= valorR.nextInt(100);
            vetorB[tamanho -i -1]=vetorA[i];
         }

         for(int a: vetorA) {
            
            System.out.print( a+ " ");
         }
         System.out.println();

         for(int b: vetorB){
            
            System.out.print( b+ " ");
         }

    }
}
