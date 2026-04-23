import java.util.Scanner;
public class ForActivities4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// Escreva um programa que imprima na tela a tabuada de 1 a 10


        int resultado;

        //System.out.println("VOCE QUER SOFRER COM A TABUADA DE QUAL NÚMERO: ");
        //numero = sc.nextInt();

        for(int i=1; i<=10; i++){
            
            
            for(int j=1; j<=10; j++){
                resultado = j*i;
                System.out.println(+i+"*"+j+"="+resultado);
            }
            System.out.println();
            
        }
        sc.close();
    }
}
