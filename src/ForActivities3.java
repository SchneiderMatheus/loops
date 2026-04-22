import java.util.Scanner;
public class ForActivities3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//Tabuada de um número:
// Crie um programa que solicite ao usuário um número (de 1 a 10) e exiba a tabuada desse número utilizando um laço de repetição.

        int numero;
        int resultado;

        System.out.println("VOCE QUER SOFRER COM A TABUADA DE QUAL NÚMERO: ");
        numero = sc.nextInt();

        for(int i=0; i<=10; i++){
            resultado = numero*i;
            System.out.println(+numero+"*"+i+"="+resultado);
        }
        sc.close();
    }
}
