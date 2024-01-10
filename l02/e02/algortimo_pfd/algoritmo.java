package l02.e02.algortimo_pfd;

import java.util.Scanner;

class algoritmo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Inserisci il numero di telefono della persona = ");
            String phone = sc.nextLine();

            System.out.print("La persona è in casa? (Inserisci: 1. se è in casa, 0. se non c'è) = ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 0) {
                System.out.print("Lascia un messaggio = ");
                String msg = sc.nextLine();
                System.out.println("Aspetta di essere richiamato");

            }

            System.out.println("Ti va di mangiare qualcosa insieme?");
            System.out.print("Ascolta la risposta (Inserisci: 1. se accetta, 0. se rifiuta) = ");
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 0) {
                System.out.println("...e di bere qualcosa di caldo?");
                System.out.print("Ascolta la risposta (Inserisci: 1. se accetta, 0. se rifiuta) = ");
                choice = Integer.parseInt(sc.nextLine());

                if (choice == 1) {
                    System.out.print("Scegli tra te' / caffe / cioccolata? (Inserisci: 0 se te', 1 se caffe e 2 se cioccolata) = ");
                    choice = Integer.parseInt(sc.nextLine());

                    switch (choice) {
                        case 0:
                            System.out.println("Fatevi sto te'");

                            break;

                        case 1:
                            System.out.println("Fatevi sto caffe");

                            break;

                        case 2:
                            System.out.println("Fatevi sta cioccolata");

                            break;

                    }

                } else {
                    System.out.println("Allora svaghiamoci un po'");

                    for (int i = 0; i < 6; i++) {
                        System.out.println("...cos'altro ti va di fare?");
                        System.out.print("Mi piace? (Inserisci: 0 per dire no, 1 per dire si) = ");
                        choice = Integer.parseInt(sc.nextLine());

                        if (choice == 1) {
                            break;
                        }

                    }

                    System.out.println("E facciamolo assieme, dai");
                    System.out.println("Svagatevi in sieme");

                }

            } else {
                System.out.println("Mangiate qualcosa insieme");

            }

            System.out.println("Siete diventati amici!");

        }
    }
}