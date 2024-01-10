import java.util.Scanner;

public class gruppocinque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String scelta = "";
        do {
            System.out.println("Componi il numero di telefono della persona");
            scelta = sc.nextLine();
        } while (!(isNumeric(scelta)));

        sc = new Scanner(System.in);
        String casa = "";

        do {
            System.out.println("E' in casa?");
            casa = sc.nextLine();
        } while (!((casa.equals("si")) || (casa.equals("no"))));

        String mangiare = "";
        if (casa.equals("si")) {
            do {
                System.out.println("Ti va di mangiare qualcosa insieme?");
                mangiare = sc.nextLine();
            } while (!((mangiare.equals("si")) || (mangiare.equals("no"))));

            if (mangiare.equals("si")) {
                System.out.println("Mangiamo qualcosa insieme");
            }
            if (mangiare.equals("no")) {
                System.out.println("E di bere qualcosa di caldo?\n 0. No\n 1. Si");
                int n = sc.nextInt();

                if (n == 0) {
                    System.out.println("Allora svaghiamoci un po'..");
                } else if (n == 1) {
                    System.out.println("Che Bevanda vuoi?\n 1. Tè\n 2. Caffè\n 3. Cioccolata");
                    n = sc.nextInt();

                    if (n == 1) {
                        System.out.println("Andiamo a fare un Tè, dai.");
                    } else if (n == 2) {
                        System.out.println("Andiamo a bere un Caffè così ci tiriamo su.");
                    } else if (n == 3) {
                        System.out.println("Una cioccolata calda non fa mai male.");
                    }
                    sc.close();
                }
            }
        }

        Scanner f = new Scanner(System.in);
        if (casa.equals("no")) {
            System.out.println("Lascia un messaggio");
            String messaggio = f.nextLine();
            System.out.println("Aspetta di essere richiamato");
        }

    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
