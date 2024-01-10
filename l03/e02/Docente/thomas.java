package l03.e02.Docente;

import java.util.Scanner;

public class thomas {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String cognome;
        String nome;
        int eta;

        System.out.println("Inserisci il tuo nome: ");
        nome = sc.next();

        System.out.println("Inserisci il tuo cognome: ");
        cognome = sc.next();

        System.out.println("Buonasera " + nome + " " + cognome + ",cosa posso fare per te?");

        System.out.println("Quanti anni hai? ");
        eta = sc.nextInt();

        if(eta < 17){
            System.out.println("Ti ricordo che non puoi fare magie fuori da Hogwarts");
        }

        sc.close();
    }
}
