package l03.e06.pietrofornale;

public class animals {
    public static void main(String[] args) {
        System.out.println(animals(2, 4, 5, 7)); 
    }

    static int animals(int g, int i, int s, int ss) {
        return g * 2 + i * 4 + s * 4 + ss * 8;
    }
}