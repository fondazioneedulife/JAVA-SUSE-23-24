package l07.e01.Thomas_e01;

public class Parallelepipedo extends Rettangolo implements BaseFigura{
    
    private float lato;

    public Parallelepipedo(){}

    public Parallelepipedo(float b, float a, float l){
        super(b, a);
        this.lato = l;
    }

    public float Volume(){
        return super.Area()*lato; 
    }

    @Override
    public String lati() {
        return "Lati del parallelepipedo: " + super.lati() + ", " + lato;
    }
}
