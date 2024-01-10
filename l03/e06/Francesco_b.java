package l03.e06;

import java.util.Scanner;

public class Francesco_b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("quanti grivi");
        int a = sc.nextInt();
        
        System.out.println("quanti cani");
        int b = sc.nextInt();

        System.out.println("quanti gatti");
        int c = sc.nextInt();
        
        System.out.println("quanti alberi");
        int d = sc.nextInt();
        System.out.println("abbiamo" + formula(a,b,c,d));
    }
    
    static int formula(int a, int b, int c, int d){
        int somma = a*2 + b*4 + c*5 + d*8;
        return somma;
    }
}
