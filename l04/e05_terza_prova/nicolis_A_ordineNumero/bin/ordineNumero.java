package l04.e05_terza_prova.nicolis_A_ordineNumero.bin;

import java.util.Scanner;

class ordineNumero {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                int count = 0;
                int num = sc.nextInt();
                boolean scrit = false;

                for (int i = 0; i < 62; i++) {
                        count++;
                        if (scrit) {
                                System.out.println(i);
                        }
                        if (count == num) {
                                scrit = !scrit;
                                count = 0;
                        }
                }
                sc.close();
        }
}