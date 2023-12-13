package corso;

import java.util.Scanner;

public class ciclo_for {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String  a = "è in casa? 1 sì 0 no"; 
        System.out.println(a);
        int resp = sc.nextInt();
        if(resp==0){
            System.out.println("non è in casa");
            if(resp==0){
                


        }
        else{
            System.out.println("è in casa");
            a = "si o no";
            System.out.println(a);
            resp = sc.nextInt();
            if (resp==0){
                System.out.println("Lascia un messaggio");
            }
            else{
                System.out.println("Ti va di mangiare qualcosa insieme?");
            }
        }


        sc.close();
    }
}