package l04.e02.Docente;

import java.util.ArrayList;
import java.util.Random;

public class soluzione {

    public static void main(String[] args) {
        // Definisci l'insieme di dati
        ArrayList<String> insiemeDiDati = new ArrayList<>();
        insiemeDiDati.add("Paolo");
        insiemeDiDati.add("Piero");
        insiemeDiDati.add("Gianni");
        insiemeDiDati.add("Carlo");
        insiemeDiDati.add("Fabrizio");
        insiemeDiDati.add("Paola");
        insiemeDiDati.add("Piera");
        insiemeDiDati.add("Gianna");
        insiemeDiDati.add("Carla");
        insiemeDiDati.add("Fabrizia");
        // Aggiungi altri elementi all'insieme di dati se necessario

        // Numero di elementi casuali da estrarre
        int numeroElementiCasuali = 4;

        // Estrai elementi casuali dall'insieme di dati
        ArrayList<String> elementiCasuali = estraiElementiCasuali(insiemeDiDati, numeroElementiCasuali);

        // Stampare gli elementi estratti
        System.out.println("Elementi casuali estratti:");
        for (String elemento : elementiCasuali) {
            System.out.println(elemento);
        }
    }

    // Metodo per estrarre casualmente un numero specificato di elementi da un ArrayList
    private static ArrayList<String> estraiElementiCasuali(ArrayList<String> insieme, int numeroElementi) {
        if (insieme == null || insieme.isEmpty() || numeroElementi <= 0 || numeroElementi > insieme.size()) {
            throw new IllegalArgumentException("Input non valido");
        }

        // Clona l'insieme per evitare di modificare l'insieme originale
        ArrayList<String> cloneInsieme = new ArrayList<>(insieme);

        // Inizializza il generatore di numeri casuali
        Random random = new Random();

        // ArrayList per gli elementi estratti casualmente
        ArrayList<String> elementiCasuali = new ArrayList<>();

        // Estrai elementi casuali
        for (int i = 0; i < numeroElementi; i++) {
            int indiceCasuale = random.nextInt(cloneInsieme.size());
            elementiCasuali.add(cloneInsieme.remove(indiceCasuale));
        }

        return elementiCasuali;
    }
}