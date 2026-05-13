import java.util.Scanner;

public class ActMatriz1 {
    public static void main(String[] args) {
        // Matriz Identidade: Crie um matriz identidade com o tamanho definido pelo usuário (NxN –
        //matriz quadrada). Matriz identidade é preenchida com zeros, tendo a diagonal principal com
        //os seus valores iguais a um. Exiba a matriz resultante na tela.

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o numero de linhas da sua matriz: ");
        int linhas = sc.nextInt();
        System.out.println("Digite o numero de colunas da sua matriz:");
        int colunas = sc.nextInt();

        int [][] matriz = new int [linhas][colunas];

        for (int i =0; i<3; i++){
            for (int j=0; j<3; j++){
                if (i==j){
                    matriz[i][j] =1;
                }else
                matriz [i][j]=0;
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
