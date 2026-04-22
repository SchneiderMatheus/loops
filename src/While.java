import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota=0;
        boolean invalido = true;


        while (invalido) { // while usado para loops que nao sabemos quantos vao ser
            System.out.println("Digite a nota");
            nota = sc.nextDouble();

            if (nota>=0 && nota <=10) {
                invalido = false;
            } else
                System.out.println("Nota invalída!");
        }

        sc.close();
    }
}
