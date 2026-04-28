import java.util.Scanner;
public class TarefaFor2 {
    public static void main(String[] args) {
        
        //Solicite dois números inteiros (início e fim) e calcule a soma de todos os números dentro desse intervalo.
        Scanner sc = new Scanner(System.in);

        int numero1,numero2, soma=0;

        System.out.println("Informe o número inicial: ");
        numero1 = sc.nextInt();
        System.out.println("Informe o número final: ");
        numero2 = sc.nextInt();

        for(int i = numero1; i<numero2; i++){
            soma = soma + i;
            
        } 
        System.out.println(soma);

        sc.close();
    }
}
