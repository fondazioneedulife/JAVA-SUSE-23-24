package l05.e05.Docente;

    // File: MainPlaylist.java

import java.util.Scanner;

public class soluzione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chiedere all'utente quanti brani contiene la playlist
        System.out.println("Inserisci il numero di canzoni nella tua playlist: ");
        int numeroCanzoni = scanner.nextInt();

        // Dichiarare e inizializzare un vettore per contenere le canzoni
        Canzone[] playlistArray = new Canzone[numeroCanzoni];

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
            playlistArray[i] = new Canzone(nome, cantante, durata);
        }

        // Creare la playlist con il vettore di canzoni
        Playlist playlist = new Playlist(playlistArray);

        // Menu iterativo
        int scelta;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Modifica titolo di una canzone");
            System.out.println("2. Modifica cantante di una canzone");
            System.out.println("3. Modifica durata di una canzone");
            System.out.println("4. Visualizza la playlist");
            System.out.println("5. Esci");

            System.out.println("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    // Modifica titolo di una canzone
                    System.out.println("Inserisci la posizione della canzone da modificare: ");
                    int posTitolo = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline dopo il nextInt()
                    System.out.println("Inserisci il nuovo titolo: ");
                    String nuovoTitolo = scanner.nextLine();
                    playlist.modificaTitolo(posTitolo - 1, nuovoTitolo);
                    break;

                case 2:
                    // Modifica cantante di una canzone
                    System.out.println("Inserisci la posizione della canzone da modificare: ");
                    int posCantante = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline dopo il nextInt()
                    System.out.println("Inserisci il nuovo cantante: ");
                    String nuovoCantante = scanner.nextLine();
                    playlist.modificaCantante(posCantante - 1, nuovoCantante);
                    break;

                case 3:
                    // Modifica durata di una canzone
                    System.out.println("Inserisci la posizione della canzone da modificare: ");
                    int posDurata = scanner.nextInt();
                    System.out.println("Inserisci la nuova durata (in secondi): ");
                    int nuovaDurata = scanner.nextInt();
                    playlist.modificaDurata(posDurata - 1, nuovaDurata);
                    break;

                case 4:
                    // Visualizza la playlist
                    System.out.println(playlist);
                    break;

                case 5:
                    // Esci dal menu
                    System.out.println("Uscita dal menu.");
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
            }

        } while (scelta != 5);

        scanner.close();
    }
}
