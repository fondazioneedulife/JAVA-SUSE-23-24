package l03.e07.pietrofornale;

import java.util.Scanner;

public class rain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's the temperature");
        int temp = sc.nextInt();

        System.out.println("What's the weather like?\n0. Sunny\n1. Rainy");
        int weather = sc.nextInt();

        String answer = "";

        if (temp < 10 && weather == 1) {
            answer = "Stay in your dorm you sloth!";

        } else if (temp >= 10 && weather == 0) {
            answer = "Pick up your broom and come!";
        } else {
            answer = "You may come, but bring an umbrella";
        }

        System.out.println(answer);
    }
}
