import java.util.Scanner;
public class AtividadeWhile1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador=0, soma=0, numero;
        double media;
        String numerosInformados = "";
        

        do {
            System.out.println("Informe um numéro inteiro: ");
            numero = sc.nextInt();
            soma += numero;
            numerosInformados = numerosInformados +" "+numero;
            contador++;
            media= soma/contador;


        } while (soma<100 && contador <10);

        System.out.println("A quantidade de números informados é "+contador);
        System.out.println("Esses numeros foram: "+numerosInformados);
        System.out.println("A soma total dos números: "+soma);
        System.out.println("A média dos valores é: "+media);
        sc.close();
    }
}
