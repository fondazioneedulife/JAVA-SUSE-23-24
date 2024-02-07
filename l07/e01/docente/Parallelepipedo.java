package l07.e01.docente;


// Implementazione della classe Parallelepipedo
class Parallelepipedo extends Rettangolo {
    private double profondita;

    public Parallelepipedo(double base, double altezza, double profondita) {
        super(base, altezza);
        this.profondita = profondita;
    }

    public double volume() {
        return area() * profondita;
    }

    @Override
    public String lati() {
        return "Lati del parallelepipedo: " + super.lati() + ", " + profondita;
    }
}
