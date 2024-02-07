package l07.e01.Thomas_e01;

public class Main {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5, 10);
        Parallelepipedo p = new Parallelepipedo(5, 10, 3);

        System.out.println("\n");
        System.out.println(r.lati());
        System.out.println("L'area del rettangolo è: " + r.Area());
        System.out.println("\n");

        System.out.println(p.lati());
        System.out.println("Il volume del parallelepipedo è: " + p.Volume());
        System.out.println("\n");
    }
}
