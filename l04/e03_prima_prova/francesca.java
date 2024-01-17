package l04.e03_prima_prova;

import java.util.Scanner;

public class francesca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Voto: ");
        int voto = sc.nextInt();
        if (voto <= 2){
            System.out.println("Troll");
        } else if (voto <= 4) {
            System.out.println("Desolante");
        } else if (voto == 5) {
            System.out.println("Scadente");
        } else if (voto <= 7) {
            System.out.println("Accettabile");
        } else if (voto <= 9) {
            System.out.println("Oltre ogni previsione");
        } else {
            System.out.println("Eccezionale");
        }
        sc.close();
    }
}
