package l06.e02.docente;

// Classe base VeicoloAMotore
class VeicoloAMotore {
    String marca;
    int anno;
    int cilindrata;

    public VeicoloAMotore(String marca, int anno, int cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Veicolo: Marca=" + marca + ", Anno=" + anno + ", Cilindrata=" + cilindrata;
    }
}