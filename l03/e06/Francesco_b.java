package l03.e06;

public class Francesco_b {
    public static void main(String[] args){
        System.out.println(animali(2,3,5,1));
        System.out.println(animali(1,2,3,0));
        System.out.println(animali(5,2,8,0));
    }
    static int animali (int a, int b, int c, int d){
        return a*2+b*4+c*4+d*8;
    }
}
