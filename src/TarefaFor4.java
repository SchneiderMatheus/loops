import java.util.Scanner;
public class TarefaFor4 {
    public static void main(String[] args) {
        //Solicite um número N e exiba os N primeiros termos da sequência de Fibonacci.

        Scanner sc = new Scanner(System.in);

        System.out.println("informe a quantidade de numeros da sequência de Fibonacci você gostaria de conhecer:");
        int numero = sc.nextInt();

        String fibonacci = "";
        
        int a= 0; 
        int b =1;
        for(int i=0;i<numero;i++){
            fibonacci = fibonacci +a+ " ";
            int proximo = a+b;
            a= b;
            b =proximo;

        }
        System.out.println(fibonacci);
    }

}
