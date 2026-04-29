import java.util.Scanner;
public class TarefaFor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //padrao numerico crescente

        System.out.println("Informe o número desejado: ");
        int numero=sc.nextInt();
        String numeroLado= "";

        for(int i=1; i<=numero; i++){
            numeroLado = numeroLado +" "+i;
            System.out.println(numeroLado);

            }
        sc.close();
    }
}
