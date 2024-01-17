package l04.e05_terza_prova;

import java.util.Scanner; 

public class DiegoMagicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pensare ad un numero da 1 a 62.\n Premere 0 quando pronti a continuare");
            int a = sc.nextInt();

            NumList(1);
        System.out.println("\nIl tuo numero compare tra questi?\n Premere 0 quando pronti a continuare");
            int b = sc.nextInt();

            NumList(2);
        System.out.println("\nIl tuo numero compare tra questi?\n Premere 0 quando pronti a continuare");
            int c = sc.nextInt();

            NumList(4);
        System.out.println("\nIl tuo numero compare tra questi?\n Premere 0 quando pronti a continuare");
            int d = sc.nextInt();

            NumList(8);
        System.out.println("\nIl tuo numero compare tra questi?\n Premere 0 quando pronti a continuare"); 
            int e = sc.nextInt();   
            
            NumList(16);
        System.out.println("\nIl tuo numero compare tra questi?\n Premere 0 quando pronti a continuare"); 
            int f = sc.nextInt(); 

            NumList(32); 
        System.out.println("\nIl tuo numero compare tra questi?\n Premere 0 per terminare");
            int g = sc.nextInt();

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

