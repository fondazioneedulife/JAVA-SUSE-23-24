package l06.e01.docente;

// Implementazione della classe Rettangolo
class Rettangolo extends Quadrilatero implements FiguraConLati {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public String lati() {
        return "Lati del rettangolo: " + base + ", " + altezza;
    }
}
