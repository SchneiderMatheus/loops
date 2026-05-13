import java.util.Scanner;


public class Matrixes {
    public static void main(String[] args) {
        //Uma matriz em Java é uma coleção bidimensional de elementos do mesmo tipo,
        //organizados em linhas e colunas. Elas são declaradas da seguinte forma:
        //Forma 1:
        //tipo_do_elemento[linhas][colunas] nome_da_matriz;
                    // int [] [] = new int [5] [5];
        //Principais operações com matrizes:
        // Acesso aos elementos: Assim como nos vetores, os elementos das
        //matrizes também são acessados usando o operador de índice [][].
        // Inicialização: Podemos inicializar os elementos da matriz durante a
        //declaração ou atribuir valores individualmente.
        // Iteração: Utilizando loops aninhados para percorrer os elementos da
        //matriz.
        // Manipulação: Inclusão, exclusão e alteração de elementos.
        // Tamanho: O tamanho de uma matriz é definido pelas suas
        //dimensões, ou seja, o número de linhas e colunas.
        
        Scanner sc= new Scanner(System.in);


        int [][] matriz = new int [3][3];
        //int [][] matrizB = new int [3][3];

        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Digite valor posicao "+(i+1)+(j+1));
                matriz [i][j]=sc.nextInt();
            }
        }

        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(" "+matriz[i][j]);
                
            }
            System.out.println();
        }
        


        sc.close();
    }
}
