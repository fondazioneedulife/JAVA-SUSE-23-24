package l06.e02.docente;

// Classe Furgone che estende VeicoloAMotore
public class Furgone extends VeicoloAMotore {
    int capacita;

    public Furgone(String marca, int anno, int cilindrata, int capacita) {
        super(marca, anno, cilindrata);
        this.capacita = capacita;
    }

    @Override
    public String toString() {
        return super.toString() + ", Furgone: Capacita=" + capacita;
    }
}