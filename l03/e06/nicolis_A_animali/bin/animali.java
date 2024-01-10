package nicolis_A_animali.bin;

import java.util.Scanner;

class animali {

        static int sommaAnimali(int a, int b, int c, int d){
                return a*2+b*4+c*4+d*8;
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int nGalline = sc.nextInt();
                int nIppogriffo = sc.nextInt();
                int nSnano = sc.nextInt();
                int nSchioppo_coda = sc.nextInt();
                int som = sommaAnimali(nGalline, nSnano, nIppogriffo, nSchioppo_coda);
                System.out.println("la somma è " + som);
        }
}