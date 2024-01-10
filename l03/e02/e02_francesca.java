

import java.util.Scanner;

public class e02_francesca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual è il tuo nome?");
        String nome = sc.nextLine();
        System.out.println("Qual è il tuo cognome?");
        String cognome = sc.nextLine();
        System.out.println("Buonasera "+nome+" "+cognome+", in che anno sei nato?");
        int anno_nascita = sc.nextInt();
        
        if (2024-anno_nascita<17){
            System.out.println("Hai meno di 17 anni, quindi ricordati che non puoi fare magie fuori da Hogwarts");
        } 
        sc.close();
    }
}