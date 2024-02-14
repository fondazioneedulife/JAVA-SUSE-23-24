import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Carta {
    private final String seme;
    private final String valore;

    public Carta(String seme, String valore) {
        this.seme = seme;
        this.valore = valore;
    }

    public String toString() {
        return valore + " di " + seme;
    }

    public int getValore() {
        switch (valore) {
            case "2", "3", "4", "5", "6", "7", "8", "9", "10":
                return Integer.parseInt(valore);
            case "Jack", "Regina", "Re":
                return 10;
            case "Asso":
                return 11; // Gli assi possono valere 1 o 11, per semplicità impostiamo il valore di default a 11
            default:
                return 0;
        }
    }
}

class Mazzo {
    private final List<Carta> carte = new ArrayList<>();

    public Mazzo() {
        String[] semi = {"Cuori", "Quadri", "Fiori", "Picche"};
        String[] valori = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Regina", "Re", "Asso"};

        for (String seme : semi) {
            for (String valore : valori) {
                carte.add(new Carta(seme, valore));
            }
        }

        Collections.shuffle(carte);
    }

    public Carta pescaCarta() {
        return carte.remove(0);
    }
}

class Mano {
    private final List<Carta> carte = new ArrayList<>();

    public void aggiungiCarta(Carta carta) {
        carte.add(carta);
    }

    public int calcolaPunteggio() {
        int punteggio = carte.stream().mapToInt(Carta::getValore).sum();

        // Gestisce gli assi
        for (Carta carta : carte) {
            if (carta.getValore() == 11 && punteggio > 21) {
                punteggio -= 10; // Converti il valore dell'Asso da 11 a 1
            }
        }

        return punteggio;
    }

    public void visualizza() {
        for (Carta carta : carte) {
            System.out.println(carta);
        }
    }

    public List<Mano> suddividi() {
        if (carte.size() == 2 && carte.get(0).getValore() == carte.get(1).getValore()) {
            List<Mano> maniDivise = new ArrayList<>();
            Mano mano1 = new Mano();
            Mano mano2 = new Mano();

            mano1.aggiungiCarta(carte.get(0));
            mano2.aggiungiCarta(carte.get(1));

            maniDivise.add(mano1);
            maniDivise.add(mano2);

            return maniDivise;
        }
        return null;
    }
}

public class BlackjackGame {
    public static void main(String[] args) {
        Mazzo mazzo = new Mazzo();
        Mano manoGiocatore = new Mano();
        Mano manoDealer = new Mano();

        // Distribuzione iniziale
        manoGiocatore.aggiungiCarta(mazzo.pescaCarta());
        manoDealer.aggiungiCarta(mazzo.pescaCarta());
        manoGiocatore.aggiungiCarta(mazzo.pescaCarta());
        manoDealer.aggiungiCarta(mazzo.pescaCarta());

        gioca(mazzo, manoGiocatore, manoDealer);
    }

    private static void gioca(Mazzo mazzo, Mano manoGiocatore, Mano manoDealer) {
        // Turno del giocatore
        System.out.println("La tua mano:");
        manoGiocatore.visualizza();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Vuoi pescare, stare o dividere? (p/s/d): ");
            String scelta = scanner.nextLine().toLowerCase();

            if (scelta.equals("p")) {
                manoGiocatore.aggiungiCarta(mazzo.pescaCarta());
                System.out.println("La tua mano:");
                manoGiocatore.visualizza();
                if (manoGiocatore.calcolaPunteggio() > 21) {
                    System.out.println("Sballato! Hai superato 21.");
                    finePartita(manoGiocatore, manoDealer);
                    return;
                }
            } else if (scelta.equals("s")) {
                break;
            } else if (scelta.equals("d")) {
                List<Mano> maniDivise = manoGiocatore.suddividi();
                if (maniDivise != null) {
                    System.out.println("Carte divise!");
                    for (Mano manoDivisa : maniDivise) {
                        gioca(mazzo, manoDivisa, manoDealer);
                    }
                    return;
                } else {
                    System.out.println("Non puoi dividere la tua mano attuale.");
                }
            } else {
                System.out.println("Scelta non valida. Inserisci 'p', 's' o 'd'.");
            }
        }

        // Turno del dealer
        System.out.println("La mano del dealer:");
        manoDealer.visualizza();
        while (manoDealer.calcolaPunteggio() < 17) {
            manoDealer.aggiungiCarta(mazzo.pescaCarta());
            System.out.println("Il dealer pesca.");
        }

        // Visualizza le mani finali
        System.out.println("\nMani finali:");
        System.out.println("La tua mano:");
        manoGiocatore.visualizza();
        System.out.println("Punteggio giocatore: " + manoGiocatore.calcolaPunteggio());
        System.out.println("\nLa mano del dealer:");
        manoDealer.visualizza();
        System.out.println("Punteggio dealer: " + manoDealer.calcolaPunteggio());

        // Determina il vincitore
        if (manoGiocatore.calcolaPunteggio() > 21 || (manoDealer.calcolaPunteggio() <= 21 && manoDealer.calcolaPunteggio() >= manoGiocatore.calcolaPunteggio())) {
            System.out.println("\nIl dealer vince!");
        } else {
            System.out.println("\nHai vinto!");
        }
    }

    private static void finePartita(Mano manoGiocatore, Mano manoDealer) {
        // Visualizza le mani finali
        System.out.println("\nMani finali:");
        System.out.println("La tua mano:");
        manoGiocatore.visualizza();
        System.out.println("Punteggio giocatore: " + manoGiocatore.calcolaPunteggio());
        System.out.println("\nLa mano del dealer:");
        manoDealer.visualizza();
        System.out.println("Punteggio dealer: " + manoDealer.calcolaPunteggio());
        System.out.println("\nFine partita!");
    }
}