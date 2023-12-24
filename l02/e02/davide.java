import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class davide {
    public static void main(String[] args) {
        System.out.println("Componi numero di telefono");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        System.out.println("E' in casa?\nsi\nno");
        funzioneif();
    }

    static String funzioneif() {
        Scanner sc = new Scanner(System.in);
        String scelta = "";
        scelta = sc.nextLine();
        if (scelta.equals("si")) {
            cenaInsieme();
        } else if (scelta.equals("no")) {
            noCasa();
        }
        return scelta;
    }

    static String noCasa() {
        Scanner sc = new Scanner(System.in);
        String scelta = "";
        System.out.println("Lascia un messaggio...");
        sc.nextLine();
        System.out.println("Aspetta una richiamata\nE' tornata a casa?");
        funzioneif();
        return scelta;
    }

    static String cenaInsieme() {
        Scanner sc = new Scanner(System.in);
        String scelta = "";
        System.out.println("Vorresti cenare assieme?");
        scelta = sc.nextLine();
        if (scelta.equals("si")) {
            System.out.println("Ceniamo!\nInizio dell'amicizia!");
        } else if (scelta.equals("no")) {
            bevandaCalda();
        }
        return scelta;
    }

    static String bevandaCalda() {
        Scanner sc = new Scanner(System.in);
        String scelta = "";
        System.out.println("Vorresti bere qualcosa di caldo?");
        scelta = sc.nextLine();
        if (scelta.equals("si")) {
            System.out.println("Scegli tra:\ntè\ncaffè\ncioccolata");
            scelta = sc.nextLine();
            switch (scelta) {
                case "tè":
                    System.out.println("Beviamo tè");
                    break;
                case "caffè":
                    System.out.println("Beviamo caffè");
                    break;
                case "cioccolata":
                    System.out.println("Beviamo cioccolata");
                    break;
            }
            System.out.println("Inizio dell'amicizia!");
        } else if (scelta.equals("no")) {
            System.out.println("E allora svaghiamoci un po'..");
            counter();
        }
        return scelta;
    }

    static String counter() {
        Scanner sc = new Scanner(System.in);
        String scelta = "";
        String risposte = "";
        List listascelte = new ArrayList();
        for (int i = 0; i < 6; i++) {
            if (scelta.equals("si")) {
                fine();
                break;
            }
            System.out.println(i);
            System.out.println("...Cos'altro di va di fare?");
            risposte = sc.nextLine();
            listascelte.add(risposte);
            System.out.println("E' una cosa che va di fare anche a me?");
            scelta = sc.nextLine();
            if (i == 5){
                possibilita(listascelte);
            }
        }
        return scelta;
    }
    static String possibilita(List listascelte){
        Scanner sc = new Scanner(System.in);
        String scelta = "";  
        System.out.println("Scegli fra tutte le opzioni quella che ti sembra essere la meno disumana");
        System.out.println(listascelte.toString());
        scelta = sc.nextLine();
        /*switch (scelta) {
            case listascelte[]: 
                
                break;
        
            default:
                break;
        } */
        System.out.println("Fattela piacere");
        System.out.println("Svagatevi un po' insieme");
        System.out.println("Inizio amicizia!");
        return scelta; 
    }
    static String fine(){
        String scelta = "";
        System.out.println("E facciamola insieme dai...");
        System.out.println("Svagatevi un po' insieme");
        System.out.println("Inizio amicizia!");

        return scelta;
    }
}
