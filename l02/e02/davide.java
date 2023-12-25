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
        List<String> listascelte = new ArrayList();
        for (int i = 0; i < 6; i++) {
            if (scelta.equals("si")) {
                fine();
                break;
            }
            System.out.println("...Cos'altro di va di fare?");
            risposte = sc.nextLine();
            listascelte.add(risposte);
            System.out.println("E' una cosa che va di fare anche a me?");
            scelta = sc.nextLine();
            if (i == 5) {
                String scelta1 = "";
                System.out.println("Scegli tra una di queste opzioni e fattela piacere");
                do {
                    for (String elemento : listascelte) {
                        System.out.println("Vorresti " + elemento + "?");
                        Scanner sxc = new Scanner(System.in);
                        scelta1 = sxc.nextLine();
                        if (scelta1.equals("si")) {
                            fine();
                            break;
                        }

                    }
                } while (!(scelta1.equals("si")));
            }

        }
        return risposte;
    }

    static String fine() {
        String scelta = "";
        System.out.println("E facciamola insieme dai...");
        System.out.println("Svagatevi un po' insieme");
        System.out.println("Inizio amicizia!");

        return scelta;
    }
}
