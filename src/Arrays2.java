import java.util.Random;
public class Arrays2 {
    public static void main(String[] args) {
        
        Random valorR = new Random();

        int[] vetor = new int[10];

        for (int i=0; i<10; i++){
            vetor[i]= valorR.nextInt(100);
        }

        int menor, maior;
        menor = vetor[0];
        maior = vetor[0];
        for (int i=0; i<10; i++){
            vetor[i]= valorR.nextInt(100);
            if (vetor[i]<menor) {
                menor = vetor[i];
            } 
            if (vetor[i]>maior) {
                maior = vetor[i];
            }
        }

        for(int v: vetor){
            System.out.print(v+" "); // system.out.print = printar na mesma linha
        }

        System.out.println("\nMaior: "+maior); // \n quebra linha
        System.out.println("Menor: "+menor);
        

    }
}
