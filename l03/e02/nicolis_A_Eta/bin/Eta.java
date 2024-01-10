package nicolis_A_Eta.bin;

import java.util.Scanner;

class Eta {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Quanti anni hai?");
                int anni = sc.nextInt();
                System.out.println("hai " + anni + " anni");
                if (anni < 18){
                        System.out.println("non puoi fare magie fuori da Hogwarts");
                }
                sc.close();
        }
}