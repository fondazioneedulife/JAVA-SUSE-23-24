package l05.e02.Docente;
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

    // Metodi get e set per tutti gli attributi
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isCapitano() {
        return capitano;
    }

    public void setCapitano(boolean capitano) {
        this.capitano = capitano;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getGoalNazionale() {
        return goalNazionale;
    }

    public void setGoalNazionale(int goalNazionale) {
        this.goalNazionale = goalNazionale;
    }

    // Metodo per calcolare la somma dei goal totali
    public int calcolaGoalTotali() {
        return goal + goalNazionale;
    }

    // Metodo toString per rappresentare l'oggetto sotto forma di stringa
    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", capitano=" + capitano +
                ", goal=" + goal +
                ", goalNazionale=" + goalNazionale +
                '}';
    }
}

