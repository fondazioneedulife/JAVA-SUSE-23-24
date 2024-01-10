package l03.e05.severino;

import java.util.Scanner;

public class severino{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int ric1;
        int ric2;

        System.out.println("Hagrid: sai nuotare? (0=no/1=si) ");
        ric1 = sc.nextInt();
 
        System.out.println("Sei del primo anno? (0=no/1=si) ");
        ric2 = sc.nextInt();
        
        if(ric1 == 1 && ric2 == 1){
            System.out.println("Vai in barca");
        }
        else{
            System.out.println("Vai in carrozza");
        }

    }
}
