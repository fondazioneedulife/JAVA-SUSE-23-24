package l03.e05;

import java.util.Scanner;

public class DiegoZinelliSwimming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sei del primo anno?\nSi \nNo \n----");
        String anno = sc.nextLine();
        System.out.println("\nSai nuotare?\nSi \nNo \n----");
        String nuoto = sc.nextLine();

        if(anno.toUpperCase().equals("SI") && nuoto.toUpperCase().equals("SI")) {
            System.out.println("\nAllora vieni in barca");
        }
        else {
            System.out.println("\nAndrai quindi in carrozza");
        }
        sc.close();
    }
}