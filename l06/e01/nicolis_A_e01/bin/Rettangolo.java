package nicolis_A_e01.bin;

public class Rettangolo {
    private double alt;
    private double base;

    
    public Rettangolo() {
        this.alt = 5;
        this.base = 10;
    }


    public Rettangolo(double alt, double base) {
        this.alt = alt;
        this.base = base;
    }


    public double getAlt() {
        return alt;
    }


    public void setAlt(double alt) {
        this.alt = alt;
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    @Override
    public String toString() {
        return "Rettangolo [alt=" + alt + ", base=" + base + "]";
    }

    public double Area(){
        return alt * base;
    }
}
