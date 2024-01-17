
package l04.e01;

import java.util.*;

public class thomas{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean unif;
        boolean cane;
        boolean stud;
        boolean inspred = true;
        boolean fanta;
        boolean entr;
        String scelta;

        System.out.println("Indossi l'uniforme scolastica? (si/no) ");
        scelta = sc.next();

        if(scelta.equals("si")){
            unif = true;
        }
        else{
            unif = false;
        }

        System.out.println("Hai un cane? (si/no) ");
        scelta = sc.next();

        if(scelta.equals("si")){
            cane = true;
        }
        else{
            cane = false;
        }

        System.out.println("Sei uno studente? (si/no) ");
        scelta = sc.next();

        if(scelta.equals("si")){
            stud = true;
        }
        else{
            stud = false;
            System.out.println("Sei un insegnante/preside? (si/no) ");
            scelta = sc.next();
            if(scelta.equals("si")){
                inspred = true;
            }
            else{
                inspred = false;
            }
        }

        System.out.println("Sei un fantasma? (si/no) ");
        scelta = sc.next();

        if(scelta.equals("si")){
            fanta = true;
        }
        else{
            fanta = false;
        }

        System.out.println("Vediamo se puoi entrare...");
        if(stud && unif && !cane){
            entr = true;
        }
        else if(inspred || fanta && !cane){
            entr = true;
        }
        else if(cane){
            entr = false;
        }
        else{
            entr = false;
        }

        if(entr = true){
            System.out.println("Puoi entrare");
        }
        else{
            System.out.println("Non può entrare qui");
        }
    }
}