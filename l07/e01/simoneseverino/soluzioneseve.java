package l07.e01.simoneseverino;

/*Scrivere un programma in grado di istanziare un oggetto rappresentante l'area di un rettangolo, assegnate base ed altezza dello stesso. Dalla stessa classe derivare una classe che descriva un oggetto parallelepipedo che utilizzi i metodi della classe per il calcolo dell'area per poter restituire il volume del solido. 
Fare in modo che Rettangolo e Parallelepipedo implementino un’interfaccia con un metodo lati(). Questo metodo restituisce una stringa con i lati della figura.
Fare in modo che Rettangolo estenda a sua volta una classe abstract quadrilatero che abbia in comune con la sua sottoclasse il metodo Area().
La classe astratta Quadrilatero non implementa Area(), che è un metodo astratto.
 */

// Definizione dell'interfaccia Figura con il metodo lati()
interface Figura {
    String lati();
}

// Classe astratta Quadrilatero che contiene il metodo astratto Area()
abstract class Quadrilatero {
    abstract double Area();
}

// Classe Rettangolo che estende Quadrilatero e implementa Figura
class Rettangolo extends Quadrilatero implements Figura {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo Area() per calcolare l'area del rettangolo
    @Override
    double Area() {
        return base * altezza;
    }

    // Implementazione del metodo lati() per restituire una stringa con i lati del rettangolo
    @Override
    public String lati() {
        return "Lati del rettangolo: " + base + ", " + altezza + ", " + base + ", " + altezza;
    }
}

// Classe Parallelepipedo che estende Rettangolo
class Parallelepipedo extends Rettangolo {
    private double altezza;

    public Parallelepipedo(double base, double altezza, double altezzaParallelepipedo) {
        super(base, altezza);
        this.altezza = altezzaParallelepipedo;
    }

    // Metodo per calcolare il volume del parallelepipedo
    double Volume() {
        return super.Area() * altezza;
    }

    // Override del metodo lati() per includere anche l'altezza del parallelepipedo
    @Override
    public String lati() {
        return super.lati() + ", " + altezza;
    }
}

public class soluzioneseve {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        System.out.println("Area del rettangolo: " + rettangolo.Area());
        System.out.println(rettangolo.lati());

        Parallelepipedo parallelepipedo = new Parallelepipedo(5, 10, 20);
        System.out.println("Volume del parallelepipedo: " + parallelepipedo.Volume());
        System.out.println(parallelepipedo.lati());
    }
}

