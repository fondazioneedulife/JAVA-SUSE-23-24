package l03.e02;

import java.util.Scanner;

public class DiegoZinelliScanName {
    
        public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);

            System.out.println("Come ti chiami?");
            String name = sc.nextLine();

            System.out.println("Buonasera " + name + ", cosa posso fare per te? di che anno sei?");
            int anni = sc.nextInt();
            int età = 2024 - anni;
            System.out.println("Quindi sei " + name + " e hai " + età + " anni.");

            if (età < 17) {
                System.out.println("Sei troppo giovane per fare magie!");
            }
            else {
                System.out.println("Puoi fare magie al di fuori di Hogwarts, ottimo!");
            
            sc.close();
            }
        }
}
