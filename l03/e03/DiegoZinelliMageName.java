package l03.e03;

import java.util.Scanner;

public class DiegoZinelliMageName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Come ti chiami?");
        String name = sc.nextLine();

        System.out.println("E il tuo cognome?");
        String surname = sc.nextLine();

        System.out.println("Sei maschio (0) o femmina (1)?");
        int gender = sc.nextInt();

        char initname = name.toUpperCase().trim().charAt(0);
        if (gender == 0) {

            switch (initname) {
                case 'A':
                    System.out.println("Aberforth");
                    break;
                case 'B':
                    System.out.println("Bill");
                    break;
                case 'C':
                    System.out.println("Charlie");
                    break;
                case 'D':
                    System.out.println("Draco");
                    break;
                case 'E':
                    System.out.println("Elphias");
                    break;
            }
        }
        else {

            switch(initname){
                case 'A':
                    System.out.println("Astoria");
                    break;
                case 'B':
                    System.out.println("Bellatrix");
                    break;
                case 'C':
                    System.out.println("Cho");
                    break;
                case 'D':
                    System.out.println("Dolores");
                    break;
                case 'E':
                    System.out.println("Eileen");
                    break;
            }
        }
        char initsurname = surname.toUpperCase().trim().charAt(0); 
        switch(initsurname){
            case 'A':
                System.out.println("Abbott");
                break;
            case 'B':
                System.out.println("Baston");
                break;
            case 'C':
                System.out.println("Crouch");
                break;
            case 'D':
                System.out.println("Dursley");
                break;
            case 'E':
                System.out.println("Evans");
            break;
            }
        sc.close();
        }
    }

