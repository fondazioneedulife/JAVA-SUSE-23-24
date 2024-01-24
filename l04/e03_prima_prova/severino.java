package l04.e03_prima_prova;

import java.util.Scanner;

public class severino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il voto (da 1 a 10): ");
        int voto = scanner.nextInt();

        scanner.close();

        String gufoCorrispondente = determinaGUFO(voto);

        System.out.println("Il G.U.F.O. corrispondente al voto " + voto + " è: " + gufoCorrispondente);
    }

    private static String determinaGUFO(int voto) {
        if (voto == 10) {
            return "Eccezionale";
        } else if (voto >= 8 && voto <= 9) {
            return "Oltre ogni previsione";
        } else if (voto >= 6 && voto <= 7) {
            return "Accettabile";
        } else if (voto == 5) {
            return "Scadente";
        } else if (voto >= 3 && voto <= 4) {
            return "Desolante";
        } else if (voto >= 0 && voto <= 2) {
            return "Troll";
        } else {
            return "Voto non valido";
        }
    }
}
