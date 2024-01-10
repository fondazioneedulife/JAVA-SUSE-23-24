import java.util.Scanner;

public class davide_antinori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int risposta = 0;
        System.out.println("Come ti chiami?");
        sc.nextLine();
        System.out.println("Se hai meno di 17 anni, ti ricordo che non puoi fare magie fuori Hogwarts\nQuanti anni hai?");
        risposta = sc.nextInt();
        if (risposta < 17) {
            System.out.println("Hai meno di 17 anni");
        
        } else {
            System.out.println("Hai 17 o più anni");
        }
        
    }

}