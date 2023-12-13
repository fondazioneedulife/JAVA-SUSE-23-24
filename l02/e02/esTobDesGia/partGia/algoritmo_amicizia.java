package algoritmo;

import java.util.Scanner;

public class algoritmo_amicizia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String messaggio = "E di bere qualcosa di caldo?\nDigita S per si o digita N per no?";
        System.out.println(messaggio);

        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("S")) {
            System.out.println("Scegli una delle seguenti opzioni:");

            int opzioneScelta = 0;
            while (opzioneScelta != 3) {
                System.out.println("1. Te");
                System.out.println("2. Caffe");
                System.out.println("3. Cioccolata");

                System.out.print("Inserisci il numero dell'opzione desiderata: ");
                opzioneScelta = scanner.nextInt();

                switch (opzioneScelta) {
                    case 1:
                        System.out.println("Uscite insieme per un Te\nSiete diventati amici");
                        break;
                    case 2:
                        System.out.println("Uscite insieme per un Caffe\nSiete diventati amici");
                        break;
                    case 3:
                        System.out.println("Uscite insieme per una Cioccolata\nSiete diventati amici");
                        break;
                    default:
                        System.out.println("Opzione non valida, riprova");
                }
            }
        } else {
            System.out.println("Allora svaghiamoci un po");
        }

        scanner.close();
    }
}