package l04.e01;
/*
Sei andato a far serata in via 20 Settembre, una rinomata e sicura via di Hogsmeade
Al tuo ritorno trovi Gazza all’ingresso del castello, ti fa entrare se:
Indossi l’uniforme scolastica e sei uno studente
Inoltre devi essere o uno studente o un insegnante o un preside
Oppure devi essere un fantasma
Ma non è ammesso chi ha un cane
 */
import java.util.Scanner;
public class e01_francesca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indossi l'uniforme?\nsi (True) | no (False)\n");
        boolean uniforme = sc.nextBoolean();
        System.out.println("Cosa sei?\nStudente (0) | Insegnante (1) | Preside (2)\n");
        int occupazione = sc.nextInt();
        System.out.println("Sei un fantasma?\nsi (True) | no (False)\n");
        boolean fantasma = sc.nextBoolean();
        System.out.println("Hai un cane?\nsi (True) | no (False)\n");
        boolean cane = sc.nextBoolean();

        if ((uniforme && (occupazione == 0) || occupazione == 1 || occupazione == 2 || fantasma) && !cane) {
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }
        sc.close();
    }
}
