package l04.e04_seconda_prova;

import java.util.Scanner;

public class DiegoTrollUnderground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Un Troll nei sotterranei!(Io ve l'ho detto ...uh!)\nChe fai? \n 1. Vingardium Leviosa!\n 2. Aspetta");
        int Aw1 = sc.nextInt();
            if (Aw1 == 1) {
                System.out.println("Sei salvo!");
            }
            else if (Aw1 == 2){
                System.out.println("Non succede nulla, il troll ti guarda incuriosito.\nChe fai? \n 1. Vingardium Leviosa!\n 2. Aspetta ancora");
                int Aw2 = sc.nextInt();
                if (Aw2 == 1) {
                    System.out.println("Sei salvo!");
                }
                else if (Aw2 == 2){
                    System.out.println("Non succede nulla, il Troll emette un verso tremendo!\nChe fai? \n 1. Vingardium Leviosa!\n 2. Aspetta di nuovo");
                    int Aw3 = sc.nextInt();
                    if (Aw3 == 1) {
                        System.out.println("Sei salvo!");
                    }
                    else if (Aw3 == 2){
                        System.out.println("Splat! Il Troll ti ha spalmato sulla parete");
                }
                sc.close();
            }
        }
    }
}