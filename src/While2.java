import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor=0, somatorio = 0;
        String valores = "";

        do {
            System.out.println("Digite a nota");
            valor = sc.nextInt();
            somatorio += valor;
            valores = valores +" "+valor;// adiciona cada valor adicionado

        } while (valor !=0); 
            System.out.println("Valores: "+valores+"\nSomatorio= "+somatorio);
        
        sc.close();
    }
}
