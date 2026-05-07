import java.util.Random;

public class Array5 {
    public static void main(String[] args) {
        //Contagem de Elementos: Escreva um programa em Java que preencha um vetor com 15 números inteiros gerados aleatoriamente, com valores de 0 a 10. Em seguida, o programa
        //deve mostrar o vetor gerado, e contar e exibir quantos números pares e quantos números
        //ímpares estão presentes no vetor.

        Random valorR = new Random();

        int[] vetor= new int[15];
        int contadorImpar=0, contadorPar=0;

        String impar = "";
        String par = "";

        for(int i=0; i<15; i++){
            vetor[i] = valorR.nextInt(11);
            if (vetor[i]%2==0) {
                par =  par+" "+vetor[i];
                contadorPar++;
            } else {
                impar = impar+" " +vetor[i];
                contadorImpar++;
            }
        }

        for(int v: vetor){
            System.out.print(v+" "); 
        }
        System.out.println();
        System.out.println("Esses são os números pares: "+par+" foram "+contadorPar+ " números pares");
        System.out.println("Esses são os números impares: "+impar+" foram "+contadorImpar+ " números impares");

    }
}
