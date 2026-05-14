import java.util.Random;
import java.util.Scanner;

public class ActMatriz5 {
    public static void main(String[] args) {
        /*Matriz transposta: faça um programa que preencha uma matriz com o tamanho definido pelo
usuário (NxM) com valores aleatórios e exiba a matriz transposta correspondente. */

        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho das linhas para sua matriz");
        int linhas= sc.nextInt();
        System.out.println("Digite o tamanho das colunas para sua matriz");
        int colunas = sc.nextInt();

        int  [][] matriz1 = new int [linhas] [colunas];
        int [][] matriz2 = new int [colunas] [linhas];
        
        for (int i =0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                matriz1 [i][j]= (int)aleatorio.nextInt(100);
            }
        }
        for (int i =0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                System.out.print(" "+matriz1[i][j]);;
            }
            System.out.println();
        }

        for (int i =0; i<linhas; i++){
            for (int j=0; j<colunas; j++){
                matriz2 [j][i]= matriz1[i][j];
            }
        }
        System.out.println();
        for (int i =0; i<colunas; i++){
            for (int j=0; j<linhas; j++){
                System.out.print(" "+matriz2[i][j]);;
            }
            System.out.println();
    }
}
}
