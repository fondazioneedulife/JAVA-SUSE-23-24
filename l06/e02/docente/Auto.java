package l06.e02.docente;

// Classe Auto che estende VeicoloAMotore
public class Auto extends VeicoloAMotore {
    int porte;
    String alimentazione;

    public Auto(String marca, int anno, int cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    @Override
    public String toString() {
        return super.toString() + ", Auto: Porte=" + porte + ", Alimentazione=" + alimentazione;
    }
}