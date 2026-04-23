import java.util.Scanner;
public class TarefaFor3 {
    public static void main(String[] args) {
        //Solicite um número inteiro positivo e calcule o seu fatorial.

        Scanner sc = new Scanner(System.in);

        int numero=0, fatorial=1;

        System.out.println("Informe o número a ser fatorado");
        numero = sc.nextInt();

        for(int i=numero; i>=1; i--){
            
            fatorial = fatorial*i;
            System.out.println(fatorial);
        }
        System.out.println("Fatorial é igual a: "+fatorial);
        sc.close();
    }
}
