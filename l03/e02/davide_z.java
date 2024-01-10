package l03.e02;

import java.util.Scanner;

public class davide_z{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nome = sc.nextLine();
        System.out.println( "Ciao "+nome+", In che anno sei nato?");
        int nascita = sc.nextInt();
        System.out.println("Hai "+(2024-nascita)+" anni");
        sc.close();
    }
}