package l03.e07;

import java.util.Scanner;

public class Francesco_b {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ci sono meno di 10 gradi?");
        boolean gradi = sc.nextBoolean();
        
        System.out.println("Piove?");
        boolean piove = sc.nextBoolean();

        if(piove && gradi){
            System.out.println("Stiamo a casa");
        } else if ((piove || gradi) && !(piove || gradi)){
            System.out.println("vado");
        }
    }
}
