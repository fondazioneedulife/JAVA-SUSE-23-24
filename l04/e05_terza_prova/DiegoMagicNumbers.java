package l04.e05_terza_prova;

import java.util.Scanner; 
import java.lang.Math;

public class DiegoMagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Result = 0;

        System.out.println("Pensare ad un numero da 1 a 62 e scriverlo.");
            int NM = sc.nextInt();
            
            NumList(1);
        System.out.println("\nIl tuo numero compare tra questi?\n 1. Si\n 2. No");
            int Aw1 = sc.nextInt();
            if (Aw1 == 1) {
                Result += Math.pow(2, 0);
            }

            NumList(2);
        System.out.println("\nIl tuo numero compare tra questi?\n 1. Si\n 2. No");
            int Aw2 = sc.nextInt();
            if (Aw2 == 1) {
                Result += Math.pow(2, 1);
            }

            NumList(4);
        System.out.println("\nIl tuo numero compare tra questi?\n 1. Si\n 2. No");
            int Aw3 = sc.nextInt();
            if (Aw3 == 1) {
                Result += Math.pow(2, 2);
            }

            NumList(8);
        System.out.println("\nIl tuo numero compare tra questi?\n 1. Si\n 2. No"); 
            int Aw4 = sc.nextInt();   
            if (Aw4 == 1) {
                Result += Math.pow(2, 3);
            }            
            NumList(16);
        System.out.println("\nIl tuo numero compare tra questi?\n  1. Si\n 2. No"); 
            int Aw5 = sc.nextInt(); 
            if (Aw5 == 1) {
                Result += Math.pow(2, 4);
            }   

            NumList(32); 
        System.out.println("\nIl tuo numero compare tra questi?\n  1. Si\n 2. No");
            int Aw6 = sc.nextInt();
            if (Aw6 == 1) {
                Result += Math.pow(2, 5);
            }        
        sc.close();
    }

    static void NumList(int SkipNum) {
        int n = 0;
        boolean print = false;
        for(int i = 0; i < 63; i++){
            if(print)
                System.out.print(i + " ");
                n++;
            if(n % SkipNum == 0) {
                n = 0;
                print = !print;
            }
        }
    }
}

