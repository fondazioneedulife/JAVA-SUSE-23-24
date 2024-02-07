package l05.e01.Docente;
import java.util.Scanner;
// File: TestGiocatore.java

public class soluzione {
    public static void main(String[] args) {
        // Creazione dell'oggetto totti con il costruttore di default
        Giocatore totti = new Giocatore();
        totti.setNome("Francesco Totti");
        totti.setCapitano(true);
        totti.setGoal(250);
        totti.setGoalNazionale(30);

        // Creazione dell'oggetto zanetti con il costruttore personalizzato
        Giocatore zanetti = new Giocatore("Javier Zanetti", false, 40, 10);

        // Creazione dell'oggetto Del_Piero con il costruttore di default e input da tastiera
        Giocatore Del_Piero = new Giocatore();
        // Utilizza la classe Scanner per leggere input da tastiera
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il nome del giocatore Del_Piero  : ");
        Del_Piero  .setNome(scanner.nextLine());

        System.out.println("Il giocatore Del_Piero  è capitano? (true/false): ");
        Del_Piero  .setCapitano(scanner.nextBoolean());

        System.out.println("Inserisci il numero di goal del giocatore Del_Piero: ");
        Del_Piero  .setGoal(scanner.nextInt());

        System.out.println("Inserisci il numero di goal della nazionale del giocatore Del_Piero: ");
        Del_Piero  .setGoalNazionale(scanner.nextInt());

        // Chiudi lo scanner
        scanner.close();

        // Stampare i dettagli dei giocatori
        System.out.println("Dettagli di Totti: " + totti);
        System.out.println("Dettagli di Zanetti: " + zanetti);
        System.out.println("Dettagli di Del_Piero  : " + Del_Piero   );

        // Calcolare e stampare la somma dei goal totali per ogni giocatore
        System.out.println("Goal totali di Totti: " + totti.calcolaGoalTotali());
        System.out.println("Goal totali di Zanetti: " + zanetti.calcolaGoalTotali());
        System.out.println("Goal totali di Del_Piero   : " + Del_Piero.calcolaGoalTotali());
    }
}
