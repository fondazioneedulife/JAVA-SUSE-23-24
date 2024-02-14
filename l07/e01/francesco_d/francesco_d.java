package l07.e01.francesco_d;

interface Figura {
    String lati();
}
// Esempio di utilizzo
public class francesco_d {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 10);
        System.out.println("Area del rettangolo: " + rettangolo.area());
        System.out.println(rettangolo.lati());

        Parallelepipedo parallelepipedo = new Parallelepipedo(5, 10, 3);
        System.out.println("Volume del parallelepipedo: " + parallelepipedo.volume());
        System.out.println(parallelepipedo.lati());
    }
}