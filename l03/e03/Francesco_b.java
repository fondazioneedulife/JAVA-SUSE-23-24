package l03.e02;
import java.util.Scanner;


public class Francesco_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String nome = sc.nextLine();

        System.out.println("ciao " + nome + ", quanti anni hai?");
        int age = sc.nextInt();
        
        if(age < 17){
            System.out.println("Ti ricordo che verrai severamente \npunito dal singnor silente se utilizzerai \nse utilizzerai la magia fuori da Hogwarts");
        }

    }
}
