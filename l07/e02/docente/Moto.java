package l06.e02.docente;

// Classe Moto che estende VeicoloAMotore
public class Moto extends VeicoloAMotore {
    String tempi;

    public Moto(String marca, int anno, int cilindrata, String tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Moto: Tempi=" + tempi;
    }
}