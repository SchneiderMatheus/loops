import java.util.Scanner;
public class ForActivities2 {
    public static void main(String[] args) {
        // Cálcular a média para um número “variável” de notas, o qual desconhecemos na hora de criar o programa.

        Scanner sc= new Scanner(System.in);
        double soma=0, media,notas;
        int qtNotas;
        System.out.println("Quantas notas voce gostaria de calcular a média?");
        qtNotas = sc.nextInt();



        for(int i=0; i<qtNotas; i++){
            System.out.println("digite a nota "+(i+1));
            notas = sc.nextDouble();
            soma += notas;
        }

        media = soma/qtNotas;
        System.out.println("Média é: "+media);
        sc.close();
    }
}
