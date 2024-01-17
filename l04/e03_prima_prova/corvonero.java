package l04.e03_prima_prova;

import java.util.Scanner;

public class corvonero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int voto;

        System.out.println("Inserire il voto dello studente: ");
        voto = sc.nextInt();

        switch(voto){
            case 10:
                System.out.println("Eccezionale");
            break;
            case 9: case 8:
                System.out.println("Oltre ogni previsione");
            break;
            case 7: case 6:
                System.out.println("Accettabile");
            break;
            case 5:
                System.out.println("Scadente");
            break;
            case 4: case 3:
                System.out.println("Desolante");
            break;
            case 2: case 1: case 0:
                System.out.println("Troll");
            break;
        }
    }
}
