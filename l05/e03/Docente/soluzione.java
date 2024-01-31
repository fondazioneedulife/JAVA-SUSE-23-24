package l05.e03.Docente;
// File: TestSmartphone.java

import java.util.Scanner;

public class soluzione {
    public static void main(String[] args) {
        // Creazione dell'oggetto smartphone1 con il costruttore di default e input da tastiera
        Smartphone smartphone1 = new Smartphone();
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Inserisci la marca dello smartphone1: ");
        smartphone1.setMarca(scanner1.nextLine());

        System.out.println("Inserisci il modello dello smartphone1: ");
        smartphone1.setModello(scanner1.nextLine());

        System.out.println("Inserisci il prezzo di lancio dello smartphone1: ");
        smartphone1.setPrezzoDiLancio(scanner1.nextDouble());

        System.out.println("Inserisci il numero di pollici dello smartphone1: ");
        smartphone1.setNumPollici(scanner1.nextDouble());

        System.out.println("Inserisci la quantità di RAM dello smartphone1: ");
        smartphone1.setRam(scanner1.nextInt());

        System.out.println("Lo smartphone1 è touchscreen? (true/false): ");
        smartphone1.setTouchScreen(scanner1.nextBoolean());

        scanner1.close();

        // Creazione dell'oggetto smartphone2 con il costruttore personalizzato e input da tastiera
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Inserisci la marca dello smartphone2: ");
        String marca2 = scanner2.nextLine();

        System.out.println("Inserisci il modello dello smartphone2: ");
        String modello2 = scanner2.nextLine();

        System.out.println("Inserisci il prezzo di lancio dello smartphone2: ");
        double prezzoDiLancio2 = scanner2.nextDouble();

        System.out.println("Inserisci il numero di pollici dello smartphone2: ");
        double numPollici2 = scanner2.nextDouble();

        System.out.println("Inserisci la quantità di RAM dello smartphone2: ");
        int ram2 = scanner2.nextInt();

        System.out.println("Lo smartphone2 è touchscreen? (true/false): ");
        boolean touchScreen2 = scanner2.nextBoolean();

        scanner2.close();

        Smartphone smartphone2 = new Smartphone(marca2, modello2, prezzoDiLancio2, numPollici2, ram2, touchScreen2);

        // Stampare i dettagli degli smartphone
        System.out.println("Dettagli di smartphone1: " + smartphone1);
        System.out.println("Dettagli di smartphone2: " + smartphone2);
    }
}
