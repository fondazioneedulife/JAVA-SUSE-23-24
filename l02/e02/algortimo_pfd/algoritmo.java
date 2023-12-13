package l02.e02.algortimo_pfd;

import java.util.Scanner;

class algoritmo {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Inserisci il numero di telefono della persona: ");
            String phone = sc.nextLine();

            System.out.print("La persona è in casa? (Inserisci: 1. se è in casa, 0. se non c'è) = ");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.print("Lascia un messaggio = ");
                String msg = sc.nextLine();
                System.out.println("Aspetta di essere richiamato");

            }

            System.out.println("Ti va di mangiare qualcosa insieme?");
            System.out.print("Ascolta la risposta (Inserisci: 1. se accetta, 0. se rifiuta) = ");
            choice = sc.nextInt();

        }
    }
}