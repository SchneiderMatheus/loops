import java.util.Scanner;

public class MatrixesSoma {
    public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);


        int [][] matriz = new int [3][3];
        int [][] matrizB = new int [3][3];
        int [][] resultado = new int [3][3];

        System.out.println("matriz A");
        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Digite valor posicao "+(i+1)+(j+1));
                matriz [i][j]=sc.nextInt();
            }
        }
        System.out.println("Matriz B");
        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Digite valor posicao "+(i+1)+(j+1));
                matrizB [i][j]=sc.nextInt();
            }
        }

        //soma das matrizes

        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                resultado[i][j] = matriz [i][j]+matrizB[i][j];
            }
        }

        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(" "+resultado[i][j]);
                
            }
            System.out.println();
        }
        sc.close();
    }
}
    

