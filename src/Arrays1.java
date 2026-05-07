import java.util.Scanner;
public class Arrays1 {
    public static void main(String[] args) {
        //soma dos elementos

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[5];
        int tamanho = vetor.length;
        int soma = 0;

        for (int i=0; i<tamanho; i++){
            System.out.println("Digite o valor "+(i+1));
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        for (int i=0; i<tamanho; i++){
            System.out.println("Valor "+(i+1)+": "+vetor[i]);
            
        }

        System.out.println("Soma dos valores: "+soma);






        sc.close();
    }
}
