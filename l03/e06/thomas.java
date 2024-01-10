package l03.e06;

import java.util.Scanner;

public class thomas {
    /*
     * Funzione tipo
     * 
     * package myPackage;
     * public class Main{
     *      public static void main(String[] args){
     *          int a = function01(2,4);
     *      }
     *      static int function01(int b, int c){
     *          int d = b + c;
     *          return d
     *      }
     * }
     * 
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indica quante galline ci sono");
        int gallina = sc.nextInt();

        System.out.println("Indica quanti ippogrifi ci sono");
        int ippogrifo = sc.nextInt();

        System.out.println("Indica quanti snasi ci sono");
        int snaso = sc.nextInt();

        System.out.println("Indica quante schiopodi sparacoda ci sono");
        int sc_sp = sc.nextInt();

        int zampe = contaZampe(gallina, ippogrifo, snaso, sc_sp);
        System.out.println("Contate: " + zampe + " zampe");
    }

    static int contaZampe(int zg, int zip, int zsn, int zss){
        
        int somma = (zg*2) + (zip*4) + (zsn*4) + (zss*8);
        return somma;
    }

    
}
