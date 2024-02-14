package nicolis_A_e01.bin;

public class Parallepipedo extends Rettangolo {
    private double profondita;

    public Parallepipedo() {
        super();
        this.profondita = 1;
    }

    public Parallepipedo(double alt, double base, double profondita) {
        super(alt, base);
        this.profondita = profondita;
    }

    public double Volume(){
        return super.Area() * profondita;
    }
    
}
