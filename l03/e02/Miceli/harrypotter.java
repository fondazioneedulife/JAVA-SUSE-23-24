import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<=20; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

        int a = 40;
        while (a <= 50){
            if (a % 2 != 0){
                System.out.println(a);
            }
            a += 1;
        }

        sc.close();
    }
}