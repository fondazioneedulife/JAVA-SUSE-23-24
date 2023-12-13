package l02.e02.piripi;

import java.util.Scanner;


public class Blue {
    public static void main(String[] args){
        System.out.println("Vuoi andare a bere qualcosa?");
        Scanner sc = new Scanner(System.in);
        System.out.println("qual è la risposta? [1= sì e 2= no] ");
        int risposta = sc.nextInt();
        if (risposta == 1){
            Scanner cc = new Scanner(System.in);
            System.out.println("scegli tra: 1=te, 2=caffè, 3=cioccolata");
            int bevanda = cc.nextInt();
                if (bevanda == 1){
                    System.out.println("Fatevi sto te");
                    System.out.println("SIETE DIVENTATI AMICI");
                }
                else if (bevanda == 2){
                    System.out.println("Fatevi sto caffè");
                    System.out.println("SIETE DIVENTATI AMICI");
                }
                else if (bevanda == 3){
                    System.out.println("Fatevi sto cioccolato");
                    System.out.println("SIETE DIVENTATI AMICI");
                }
            cc.close();
        }
        else if (risposta == 2){
            System.out.println("funzione verde");
        }
        sc.close();
    }
}
