package l04.e03_prima_prova;

import java.util.Scanner;

public class DiegoGUFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Che voto hai preso?\n Scegliere un voto da 0 a 10");
            int voto = sc.nextInt();

            if (voto == 10) {
                System.out.println("Eccezionale");
            }
            else if (voto >= 8 && voto <= 9) {
                System.out.println("Oltre ogni previsione");
            }
            else if (voto >= 6 && voto <= 7) {
                System.out.println("Accettabile");
            }
            else if (voto == 5) {
                System.out.println("Scadente");
            }
            else if (voto >= 3 && voto <= 4) {
                System.out.println("Desolante");
            }
            else if (voto >= 0 && voto <= 2) {
                System.out.println("Troll");
            }
            else {
                System.out.println("Non esistente");
            }
            sc.close();
    }
    
}
