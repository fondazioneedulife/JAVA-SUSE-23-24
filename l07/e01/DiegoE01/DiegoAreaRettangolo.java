// Scrivere un programma in grado di istanziare un oggetto rappresentante 
// l'area di un rettangolo, assegnate base ed altezza dello stesso

package l07.e01.DiegoE01;

class DiegoAreaRettangolo extends DiegoQuadrilatero implements DiegoInterfacciaLati{
    private double b;
    private double h;

    public DiegoAreaRettangolo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    @Override
    public double area() {
        return b * h;
    }

    @Override
    public String lati() {
        return "Lati del rettangolo: " + b + ", " + h;
    }
}

