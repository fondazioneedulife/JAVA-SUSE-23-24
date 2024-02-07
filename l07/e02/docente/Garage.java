package l07.e02.docente;

// Classe Garage che gestisce i veicoli
public class Garage {
    private VeicoloAMotore[] posti;

    public Garage() {
        posti = new VeicoloAMotore[15];
    }

    // Immissione di un nuovo veicolo
    public void immettiVeicolo(int posto, VeicoloAMotore veicolo) {
        if (posto >= 0 && posto < 15) {
            posti[posto] = veicolo;
            System.out.println("Veicolo inserito nel posto " + posto);
        } else {
            System.out.println("Posto non valido");
        }
    }

    // Estrazione dal garage del veicolo che occupa un determinato posto
    public VeicoloAMotore estraiVeicolo(int posto) {
        if (posto >= 0 && posto < 15) {
            VeicoloAMotore veicolo = posti[posto];
            posti[posto] = null;
            System.out.println("Veicolo estratto dal posto " + posto);
            return veicolo;
        } else {
            System.out.println("Posto non valido");
            return null;
        }
    }

    // Stampa della situazione corrente dei posti nel garage
    public void stampaSituazione() {
        for (int i = 0; i < 15; i++) {
            if (posti[i] != null) {
                System.out.println("Posto " + i + ": " + posti[i]);
            } else {
                System.out.println("Posto " + i + ": Vuoto");
            }
        }
    }
}