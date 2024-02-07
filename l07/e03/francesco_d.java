package l07.e03;

public class francesco_d {
    public static void main(String[] args) {
        int [] num2 = new int [50];
        int [] num = new int [20];
        int count = 0;
        for (int i = 1; i <= 40; i ++) {
            if (i % 2 == 1) {
                num[count] = i;
                count++;
            }
        }
        System.out.println();
        
        count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                num2[count] = i;
                count++;
            }
        }
        System.out.println("\n");
        for (int i = 0; i < 20; i++){
            System.out.print(num[i] + " ");
        }
    }
}
