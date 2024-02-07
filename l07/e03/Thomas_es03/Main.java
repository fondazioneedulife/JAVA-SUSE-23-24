package l07.e03.Thomas_es03;

import java.util.Scanner;
import java.util.Random;

public class Main{

    public static void main(String[] args) {

        int indice = 0;
        int est1;
        int est2;
        Scanner s = new Scanner(System.in);


        //PUNTO 1
        int[] pari = new int[50];
        for(int i = 1; i <= 100; i++){
            if(i%2==0){
                System.out.print(i + " ");
                pari[indice] = i;
                indice++;
            }
        }

        System.out.println("\n");

        int[] dispari = new int[20];
        indice = 0;
        for(int i = 1; i <= 40; i++){
            if(!(i%2==0)){
                System.out.print(i + " ");
                pari[indice] = i;
                indice++;
            }
        }


        //PUNTO 2
        int[] rand = new int[20];
        Random r = new Random();

        System.out.println("Generazione numeri casuali");
        System.out.println("Inserisci estremo 1: ");
        est1 = s.nextInt();

        System.out.println("Inserisci estremo 2: ");
        est2 = s.nextInt();

        int num = (int)(Math.random() * est2 + est1);
        
        //array normale
        for(int i = 0; i < rand.length; i++){
            System.out.println(rand[i]);
        }

        //array capovolto
        for(int i = rand.length; i > 0; i--){
            System.out.println(rand[i]);
        }


        //PUNTO 3
        System.out.println("Generazione array di lunghezza n");
    }
}
