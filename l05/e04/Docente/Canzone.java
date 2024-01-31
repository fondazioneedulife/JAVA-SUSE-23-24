package l05.e04.Docente;
// File: Canzone.java

public class Canzone {
    private String nome;
    private String cantante;
    private int durata; // Durata della canzone in secondi

    // Costruttore di default
    public Canzone() {
        this.nome = "";
        this.cantante = "";
        this.durata = 0;
    }

    // Costruttore parametrizzato
    public Canzone(String nome, String cantante, int durata) {
        this.nome = nome;
        this.cantante = cantante;
        this.durata = durata;
    }

    // Metodi getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    // Metodo toString per rappresentare la canzone sotto forma di stringa
    @Override
    public String toString() {
        return "Canzone{" +
                "nome='" + nome + '\'' +
                ", cantante='" + cantante + '\'' +
                ", durata=" + durata +
                '}';
    }
}

