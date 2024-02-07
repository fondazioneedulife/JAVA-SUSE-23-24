package l07.e01.francesco_d;

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
        return super.lati() + ", Profondità = " + profondita;
    }
}