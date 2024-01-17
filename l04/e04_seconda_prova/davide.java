package l04.e04_seconda_prova;
import java.util.Scanner;
public class davide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Il Troll chiede una parola");
        System.out.println("Dimmi una parola");
        if (sc.next().equals("troll")) {
            System.out.println("Troll");
        } else {
            System.out.println("Non succede nulla");
            System.out.println("Dimmi una parola");
            if (sc.next().equals("troll")) {
                System.out.println("Non succede nulla, il Troll emette un verso tremendo!");
                System.out.println("Dimmi una parola");
            }
            else {
                System.out.println("Splat! Il Troll ti ha spalmato sulla parete");
            }
            System.out.println("Dimmi una parola");
                if (sc.next().equals("troll")) {
                System.out.println("Troll");
                } else {
                System.out.println("Sei salvo!");
            }
            }

                
            }
                

            

            }
        


        
    

