package l03.e02;

import java.util.Scanner;

public class e02{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nome = sc.nextLine();
        System.out.println( "Buonasera "+nome+",cosa posso fare per te? In che anno sei nato?");
        int nascita = sc.nextInt();
        System.out.println("Hai "+(2024-nascita)+" anni");
        sc.close();
    }
}
