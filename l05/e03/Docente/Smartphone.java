package l05.e03.Docente;
// File: Smartphone.java


public class Smartphone {
    private String marca;
    private String modello;
    private double prezzoDiLancio;
    private double numPollici;
    private int ram;
    private boolean touchScreen;

    // Costruttore di default
    public Smartphone() {
        // Inizializza gli attributi con valori di default
        this.marca = "";
        this.modello = "";
        this.prezzoDiLancio = 0.0;
        this.numPollici = 0.0;
        this.ram = 0;
        this.touchScreen = false;
    }

    // Costruttore personalizzato con tutti i parametri
    public Smartphone(String marca, String modello, double prezzoDiLancio, double numPollici, int ram, boolean touchScreen) {
        this.marca = marca;
        this.modello = modello;
        this.prezzoDiLancio = prezzoDiLancio;
        this.numPollici = numPollici;
        this.ram = ram;
        this.touchScreen = touchScreen;
    }

    // Metodi getter e setter per tutti gli attributi
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public double getPrezzoDiLancio() {
        return prezzoDiLancio;
    }

    public void setPrezzoDiLancio(double prezzoDiLancio) {
        this.prezzoDiLancio = prezzoDiLancio;
    }

    public double getNumPollici() {
        return numPollici;
    }

    public void setNumPollici(double numPollici) {
        this.numPollici = numPollici;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    // Metodo per ottenere la fascia di prezzo
    public String ottieniFasciaDiPrezzo() {
        if (prezzoDiLancio > 500) {
            return "fascia ALTA";
        } else if (prezzoDiLancio >= 200 && prezzoDiLancio <= 500) {
            return "fascia MEDIA";
        } else {
            return "fascia BASSA";
        }
    }

    // Metodo per ottenere la tipologia di smartphone
    public String ottieniTipologiaSmartphone() {
        if (numPollici < 5) {
            return "Mini";
        } else if (numPollici >= 5 && numPollici <= 7) {
            return "Normal";
        } else {
            return "Maxi";
        }
    }

    // Metodo toString per rappresentare l'oggetto sotto forma di stringa
    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", prezzoDiLancio=" + prezzoDiLancio +
                ", numPollici=" + numPollici +
                ", ram=" + ram +
                ", touchScreen=" + touchScreen +
                ", fasciaDiPrezzo='" + ottieniFasciaDiPrezzo() + '\'' +
                ", tipologia='" + ottieniTipologiaSmartphone() + '\'' +
                '}';
    }
}
