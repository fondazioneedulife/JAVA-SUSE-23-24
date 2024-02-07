package l07.e01.DiegoE01;

public class DiegoSoluzione {
        public static void main(String[] args) {
            DiegoAreaRettangolo rettangolo = new DiegoAreaRettangolo(5, 10);
            System.out.println("Area rettangolo: " + rettangolo.area());
            System.out.println(rettangolo.lati());
    
            DiegoParallelepipedo parallelepipedo = new DiegoParallelepipedo(5, 10, 3);
            System.out.println("Volume parallelepipedo: " + parallelepipedo.volume());
            System.out.println(parallelepipedo.lati());
        }
    }

