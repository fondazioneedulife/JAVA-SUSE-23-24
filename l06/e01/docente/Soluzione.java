package l06.e01.docente;


// Esempio di utilizzo
public class Soluzione {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        System.out.println("Area del rettangolo: " + rettangolo.area());
        System.out.println(rettangolo.lati());

        Parallelepipedo parallelepipedo = new Parallelepipedo(5, 10, 3);
        System.out.println("Volume del parallelepipedo: " + parallelepipedo.volume());
        System.out.println(parallelepipedo.lati());
    }
}
