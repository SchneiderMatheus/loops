public class ActiMatriz4 {
    public static void main(String[] args) {
        /*Verificação de Simetria: Escreva um programa em Java que preencha uma matriz 3x3 com
números inteiros fornecidos pelo usuário. O programa deve verificar se a matriz é simétrica
em relação à diagonal principal e exibir o resultado. */
        boolean simetrica = true;
        int [][] matriz = {{1,3,3},
                           {2,1,5},
                           {3,5,1}};

    for (int i =0; i<3; i++){
        for (int j=0; j<3; j++){
            if (matriz[i][j]!=matriz[j][i]){
                simetrica = false;
            }
        }
     }
     System.out.println();
    if (simetrica == true) {
            System.out.println("Sua Matriz é simétrica, você é íncrivel");
        }else
            System.out.println("Po mano, não é simétrica");  
    }
}
