import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro (pode ser 0): ");
        int opc = scan.nextInt();

        isPrimo(opc);

        scan.close();
    }

    public static boolean isPrimo(int numero) {

        //Check if the number is 0 or 1
        if (numero == 0 || numero == 1) {
            System.out.println("Is Prime(" + numero + ") = FALSE");
        }

        //Check is the number is greater or equal to 2
        if (numero >= 2) {
            //Check if the number is divisible by 1, itself and 2
            if(numero % 1 == 0 && numero % numero == 0 && numero % 2 == 0){
                //Check if the number is equal to 2
                if(numero == 2){
                    System.out.println("Is Prime(" + numero + ") = TRUE");
                }else{
                    System.out.println("Is Prime(" + numero + ") = FALSE");
                }
            }else{
                System.out.println("Is Prime(" + numero + ") = TRUE");
            }
        }
        
        return false; 
    }
}
