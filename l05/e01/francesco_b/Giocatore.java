package l05.e01.francesco_b;
// File: Giocatore.java


public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;

    // Costruttore di default
    public Giocatore() {
        // Inizializza gli attributi con valori di default
        this.nome = "";
        this.capitano = false;
        this.goal = 0;
        this.goalNazionale = 0;
    }

    // Costruttore personalizzato con tutti i parametri
    public Giocatore(String nome, boolean capitano, int goal, int goalNazionale) {
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }
    public String getNome() {
        return nome;
    }

}

