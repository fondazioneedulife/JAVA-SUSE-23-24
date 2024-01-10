package l03.e06;

public class DiegoZinelliAnimalCount {
    public static void main(String[] args) {
        System.out.println(animals(2,3,5,1));
        System.out.println(animals(1,2,3,0));
        System.out.println(animals(5,2,8,0));
    }
        static String animals(int a, int b, int c, int d) {
            int j = a*2 + b*4 + c*4 + d*8;
            return ("Le zampe sono " + j + "\n");
    }
}