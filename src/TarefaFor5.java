import java.util.Scanner;

public class TarefaFor5 {
    public static void main(String[] args) {
        //Criar um programa que solicite um valor positivo, e apresente todos os números primos até este valor

        Scanner sc = new Scanner(System.in);

        System.out.println("Até que número você gostaria de saber quais números são primos? ");
        int limite=sc.nextInt();

    

        for(int numero =2; numero <= limite; numero++){
        boolean primo = true;

        if(numero==2){
            primo = true;
        }
        if (numero % 2 ==0) {
            primo =false;
        }else{
            for(int divisor = 3; divisor * divisor <= numero; divisor +=2){
            
                if (numero%divisor ==0) {
                   primo = false;
                    break;
                    }

                }
                    
            }

             if (primo) {
                System.out.println(numero + " ");
            }
           
        }
        
        sc.close();
    }
}
