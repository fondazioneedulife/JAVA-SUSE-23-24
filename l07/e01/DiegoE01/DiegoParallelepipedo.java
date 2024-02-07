// Dalla stessa classe derivare una classe che descriva un oggetto parallelepipedo
// che utilizzi i metodi della classe per il calcolo dell'area per poter restituire
// il volume del solido. 

package l07.e01.DiegoE01;

public class DiegoParallelepipedo extends DiegoAreaRettangolo {
    private double depth;
    
    public DiegoParallelepipedo(double b, double h, double depth) {
        super(b, h);
        this.depth = depth;
    }

    public double volume() {
        return area() * depth;
    }

    @Override
    public String lati() {
        return "Lati parallelepipedo: " + super.lati() + ", " + depth;
    }
    
}
