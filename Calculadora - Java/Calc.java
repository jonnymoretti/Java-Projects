import java.util.Scanner;

public class Calc{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Operacao cal = new Operacao();
        double n1,n2;
            

        while(true){

            System.out.println(" Bem-vindo a calculadora!!! ");
            System.out.println(" Digite uma opção: ");
            System.out.println(" 1 - Adição ");
            System.out.println(" 2 - Subtração ");
            System.out.println(" 3 - Multiplicação ");
            System.out.println(" 4 - Divisão ");
            System.out.println(" 5 - Sair ");

            int opc = scan.nextInt();

            if(opc == 5){
                System.out.println("Adeus");
                scan.close();
            }
    
            else if(opc == 1){
                System.out.println("\nDigite o primeiro valor: ");
                n1 = scan.nextDouble();
                System.out.println("\nDigite o segundo valor: ");
                n2 = scan.nextDouble();
                cal.setValores(n1,n2);
                System.out.println("\nO resultado da soma é " + cal.getAdicao());
            
            }

            else if(opc == 2){
                System.out.println("\nDigite o primeiro valor: ");
                n1 = scan.nextDouble();
                System.out.println("\nDigite o segundo valor: ");
                n2 = scan.nextDouble();
                cal.setValores(n1,n2);
                System.out.println("\nO resultado da soma é " + cal.getSubtracao());
            }

            else if(opc == 3){
                System.out.println("\nDigite o primeiro valor: ");
                n1 = scan.nextDouble();
                System.out.println("\nDigite o segundo valor: ");
                n2 = scan.nextDouble();
                cal.setValores(n1,n2);
                System.out.println("\nO resultado da soma é " + cal.getMultiplicacao());
            }
            
            else if(opc == 4){
                System.out.println("\nDigite o primeiro valor: ");
                n1 = scan.nextDouble();
                System.out.println("\nDigite o segundo valor: ");
                n2 = scan.nextDouble();
                cal.setValores(n1,n2);
                System.out.println("\nO resultado da soma é " + cal.getDivisao());
            }
            

        }

        

    }
}