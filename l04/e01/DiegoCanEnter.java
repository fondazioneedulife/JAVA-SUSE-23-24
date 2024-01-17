package l04.e01;

import java.util.Scanner;

public class DiegoCanEnter {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uniforme;
        boolean studente;
        boolean insegnante;
        boolean preside;
        boolean fantasma;
        boolean cane;

        System.out.println("Hai l'uniforme?\n 1.Si\n 2.No");
            String Urisposta = sc.nextLine();
        if (Urisposta.equals("1")) {
            uniforme = true;
        }
        else {
            uniforme = false;
        }

        System.out.println("Sei uno studente?\n 1.Si\n 2.No");
            String Srisposta = sc.nextLine();
        if (Srisposta.equals("1")) {
            studente = true;
        }
        else {
            studente = false;
        }

        System.out.println("Sei un insegnante o il preside?\n 1.Si\n 2.No");
            String IPrisposta = sc.nextLine();
        if (IPrisposta.equals("1")) {
            insegnante = true;
            preside = true;
        }
        else {
            insegnante = false;
            preside = false;
        }

        System.out.println("Sei un fantasma?\n 1.Si\n 2.No");
            String Frisposta = sc.nextLine();
        if (Frisposta.equals("1")) {
            fantasma = true;
        }
        else {
            fantasma = false;
        }

        System.out.println("Stai portando un cane?\n 1.Si\n 2.No");
            String Crisposta = sc.nextLine();
        if (Crisposta.equals("1")) {
            cane = true;
        }
        else {
            cane = false;
        }
        if (studente && uniforme && !cane) {
            System.out.println("Puoi entrare");
        }
        else if (studente && uniforme && cane) {
            System.out.println("Non puoi entrare");
        }
        else if (insegnante && preside && !cane) {
            System.out.println("Puoi entrare");
        }
        else if (insegnante && preside && cane) {
            System.out.println("Non puoi entrare, mi dispiace");
        }
        else if (fantasma && !cane) {
            System.out.println("Puoi entrare");
        }
        else if (fantasma && cane) {
            System.out.println("Non puoi entrare");
        }
        else if (cane) {
            System.out.println("Non puoi entrare");
        }
        else if (!studente && !uniforme && !insegnante && !preside && !fantasma && !cane) {
            System.out.println("Non dovresti essere qui.");
        }
        sc.close();
        }
    }

