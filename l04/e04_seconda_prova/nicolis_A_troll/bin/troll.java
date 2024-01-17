package l04.e04_seconda_prova.nicolis_A_troll.bin;

import java.util.Scanner;

import esercizie06_funzioni.sol;

class troll {

        public static void main(String[] args) {

                System.out.println("Incontri un troll");
                System.out.println("inserisci la parola");
                Scanner sc = new Scanner(System.in);
                String par = sc.nextLine();
                int count = 0;

                for (int i = 0; i < 3; i++) {
                        if (par.equals("Vingardium Leviosa")) {
                                System.out.println("Sei salvo");
                                i = 3;
                        }
                        count++;
                        par = sc.nextLine();
                        if (count == 1) {
                                System.out.println("Non succede nulla, il Troll ti fissa incuriosito");
                        }else if(count == 2){
                                System.out.println("Non succede nulla, il Troll emette un verso tremendo!");
                        }else{
                                System.out.println("Splat! Il Troll ti ha spalmato sulla parete");
                        }
                }
        }
}