package l05.e04.Docente;
// File: MainCanzone.java

import java.util.Scanner;

public class soluzione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente quanti brani contiene la playlist
        System.out.println("Inserisci il numero di canzoni nella tua playlist: ");
        int numeroCanzoni = scanner.nextInt();

        // Dichiarare e inizializzare un vettore per contenere le canzoni
        Canzone[] playlist = new Canzone[numeroCanzoni];

        // Ciclo per creare le canzoni e memorizzarle nel vettore
        for (int i = 0; i < numeroCanzoni; i++) {
            System.out.println("Inserisci i dettagli della canzone " + (i + 1) + ":");
            
            scanner.nextLine(); // Consuma il newline dopo il nextInt()

            System.out.println("Nome della canzone: ");
            String nome = scanner.nextLine();

            System.out.println("Cantante della canzone: ");
            String cantante = scanner.nextLine();

            System.out.println("Durata della canzone (in secondi): ");
            int durata = scanner.nextInt();

            // Creare la canzone e memorizzarla nel vettore
            playlist[i] = new Canzone(nome, cantante, durata);
        }

        // Stampare a schermo la playlist
        System.out.println("\nLa tua playlist preferita:");

        for (Canzone canzone : playlist) {
            System.out.println(canzone);
        }

        // Trovare la canzone più lunga e calcolare la media della durata
        Canzone canzonePiuLunga = trovaCanzonePiuLunga(playlist);
        double durataMedia = calcolaDurataMedia(playlist);

        // Stampare risultati
        System.out.println("\nCanzone più lunga: " + canzonePiuLunga.getNome());
        System.out.println("Durata media delle canzoni: " + durataMedia + " secondi");

        scanner.close();
    }

    // Metodo per trovare la canzone più lunga nella playlist
    private static Canzone trovaCanzonePiuLunga(Canzone[] playlist) {
        Canzone canzonePiuLunga = playlist[0];

        for (Canzone canzone : playlist) {
            if (canzone.getDurata() > canzonePiuLunga.getDurata()) {
                canzonePiuLunga = canzone;
            }
        }

        return canzonePiuLunga;
    }

    // Metodo per calcolare la durata media delle canzoni nella playlist
    private static double calcolaDurataMedia(Canzone[] playlist) {
        int totaleDurata = 0;

        for (Canzone canzone : playlist) {
            totaleDurata += canzone.getDurata();
        }

        return (double) totaleDurata / playlist.length;
    }
}
