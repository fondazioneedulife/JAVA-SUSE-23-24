package l03.e07;
/*
Se piove e fanno meno di 10 gradi sarà meglio
rimanere a letto a dormire.
Se piove o fa meno di 10 gradi e
contemporaneamente non accadono entrambe le
cose andare a piedi con l’ombrello.
Se non piove e se fanno più di dieci gradi suggerire di
prendere la scopa
 */
import java.util.Scanner;
public class e07_francesca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Piove?\nsi | no");
        String piove = sc.nextLine();
        System.out.println("Quanti gradi ci sono?");
        int gradi = sc.nextInt();
        if (piove.equals("si") && gradi < 10){
            System.out.println("meglio rimanere a letto a dormire");
        } else if (piove.equals("no") && gradi > 10) {
            System.out.println("meglio prendere la scopa");
        } else {
            System.out.println("andare a piedi con l'ombrello");
        }
        sc.close();
    }
}
