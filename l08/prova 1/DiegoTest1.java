

import java.util.Scanner;

public class DiegoTest1 {

    public static void main(String[] args) {
        int[] numbers = new int[8];
        int negSum = 0;

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0) {
                negSum = numbers[i] + negSum;
                numbers[i] = 0;
            }
        }
    }
}
