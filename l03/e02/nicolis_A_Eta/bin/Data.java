package nicolis_A_Eta.bin;

import java.sql.Date;
import java.util.Scanner;

class Data {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Quanti anni hai?");
                int anno = sc.nextInt();
                int mese = sc.nextInt();
                int day = sc.nextInt();
                Date d = new Date(anno, mese, day);
                Date d2 = new Date(2024, 0, 10);
                
                int num = d2.compareTo(d);
                System.out.println(num);
                if (num < 18*365){
                        System.out.println("non puoi fare magie fuori da Hogwarts");
                }
                sc.close();
        }
}