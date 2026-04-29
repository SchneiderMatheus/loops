import java.util.Scanner;
public class TarefaFor6 {
    public static void main(String[] args) {
        //crie um programa que solicite um número inteiro positivo e verifique se ele é um número perfeito.
        
        Scanner sc = new Scanner(System.in);

        int numero; 
        int somaDivisores=0;

        System.out.println("Informe um número inteiro e positivo: ");
        numero=sc.nextInt();

        for(int i=1; i<numero;i++){
            if(numero%i==0){
                somaDivisores = somaDivisores + i;
            }
        }
        if (somaDivisores == numero) {
            System.out.println(numero +" é um número perfeito");
        } else {
            System.out.println(numero+" Não é um número perfeito.");
            System.out.println("Soma dos divisores é :"+somaDivisores);
        }

        sc.close();
    }
}
