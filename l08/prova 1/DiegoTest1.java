

import java.util.Scanner;

import l03.e03.nicolis_A_swich.bin.inf;

public class DiegoTest1 {

    public static void main(String[] args) {
        ///ESERCIZIO1
        int[] numbers1 = new int[8];
        int negSum = 0;

        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = sc.nextInt();
            if (numbers1[i] < 0) {
                negSum = numbers1[i] + negSum;
                numbers1[i] = 0;
            }
        }
        ///ESERCIZIO2
        int[] numbers2 = new int[5];
        int max = 0;
        
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > max);
                max = numbers2[i];
                System.out.println(max);
                System.out.println(i + 1);
        }
        ///ESERCIZIO3
        int[] numbers3 = new int[10];
        int even = 0;

        for (int i = 0; i < numbers3.length; i++) {
            numbers3[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers3.length; i++) {
            if (numbers3[i] % 2 == 0 && i % 2 == 0) {
                even = even + 1;
                System.out.println("Ci sono " + even + " numeri pari.");
            }
        }
        ///ESERCIZIO4
        int[] numbers4 = new int[10];
        int number = 0;
        int numberMax = 0;
        int countmax = 0;
        int count = 0;

        for (int i = 0; i < numbers4.length; i++) {
            numbers4[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers4.length; i++) {
            number = numbers4[i];
            for (int j = 0; j < numbers4.length; j++) {
                if (number == numbers4[j]) {
                count = count + 1;
                }
            }
            if (countmax < count) {
                countmax = count;
                numberMax = numbers4[i];
            }
        }
        System.out.println(numberMax);
        System.out.println(countmax);
    }
}

