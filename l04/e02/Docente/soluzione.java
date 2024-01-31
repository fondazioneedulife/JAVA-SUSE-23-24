package l04.e02.Docente;

import java.util.ArrayList;
import java.util.Random;

public class soluzione {

    public static void main(String[] args) {
        // Definisci l'insieme di dati
        ArrayList<String> insiemeDiDati = new ArrayList<>();
       /*  DAVIDE GIANMARCO FRANCESCO GIACOMO THOMAS ANDREA GIACOMO 
FRANCESCO PIETRO PIETRO RENZO JUNIOR FRANCESCA ELIA MATTIA 
PIETRO LEONE ALESSANDRO DESTINY MATTEO ALESSANDRO MARIO SIMONE 
UBALDO PAOLO CHEIKH EMMANUELE DAVIDE DIEGO */
        insiemeDiDati.add("Davide ");
        insiemeDiDati.add("GianMarco");
        insiemeDiDati.add("Francesco");
        insiemeDiDati.add("Giacomo 1");
        insiemeDiDati.add("Thomas");
        insiemeDiDati.add("Andrea");
        insiemeDiDati.add("Giacomo 2");
        insiemeDiDati.add("Francesco");
        insiemeDiDati.add("Pietro 1");
        insiemeDiDati.add("Pietro 2");
        insiemeDiDati.add("RENZO JUNIOR ");
        insiemeDiDati.add("FRANCESCA ");
        insiemeDiDati.add("ELIA ");
        insiemeDiDati.add("MATTIA ");
        insiemeDiDati.add("PIETRO Leone");
        insiemeDiDati.add("ALESSANDRO 1");
        insiemeDiDati.add("DESTINY ");
        insiemeDiDati.add("MATTEO ");
        insiemeDiDati.add("ALESSANDRO 2" );
        insiemeDiDati.add("MARIO ");
        insiemeDiDati.add("SIMONE ");
        insiemeDiDati.add("PAOLO ");
        insiemeDiDati.add("CHEIKH ");
        insiemeDiDati.add("EMMANUELE" );
        insiemeDiDati.add("DAVIDE ");
        insiemeDiDati.add("DIEGO");
        // Aggiungi altri elementi all'insieme di dati se necessario

        // Numero di elementi casuali da estrarre
        int lunghezza = insiemeDiDati.size();
        System.out.println("La classe è composta da "+ lunghezza);

        // Estrai elementi casuali dall'insieme di dati
        estraiElementiCasuali(insiemeDiDati, 26);


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
            if(i==0)
                System.out.println("\nGrifondoro");
            else if(i==7)
                System.out.println("\nSerpeverde");
            else if(i==14)
                System.out.println("\nCorvonero");
            else if(i==20)
                System.out.println("\nTassorosso");
            
            int indiceCasuale = random.nextInt(cloneInsieme.size());

            System.out.println(cloneInsieme.get(indiceCasuale));
            cloneInsieme.remove(indiceCasuale);
        }

        return elementiCasuali;
    }
}