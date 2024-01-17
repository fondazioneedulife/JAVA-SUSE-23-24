//package l03.e07;

import java.util.Scanner;

public class DiegoZinelliRainBed() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Sta piovendo?\nSi \nNo \n-----");
        String piove = sc.nextLine();
    System.out.println("C'é freddo? Quanti gradi ci sono?");
        int gradi = sc.nextInt();

        if(piove.toUpperCase().equals("SI") && gradi<10) {
            System.out.println("Fa troppo freddo, restiamo a letto");
        }
        else if(piove.toUpperCase().equals("SI") && gradi>10) {
            System.out.println("C'é freddo, puliamo un po'");
        }
        else {
            System.out.println("Andiamo fuori a fare un giro");
        }
    }



