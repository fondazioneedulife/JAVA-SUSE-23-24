package l07.e01.Thomas_e01;

public class Rettangolo extends Quadrilatero implements BaseFigura {

    private float base;
    private float altezza;

    public Rettangolo(){}
    
    public Rettangolo(float b, float a){
        this.base = b;
        this.altezza = a;
    }

    @Override
    public float Area(){
        float area = base * altezza;
        return area;
    }

    @Override
    public String lati() {
        return "Lati: " + base + ", " + altezza;
    }

}