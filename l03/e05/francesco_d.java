package l03.e05;

import java.util.Scanner;
public class francesco_d {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("sei del primo anno? \n si = 1, no = 0");
        int primo = sc.nextInt();
        System.out.println("sai nuotare? \n si = 1, no = 0");
        int nuoto = sc.nextInt();
        String answer = (nuoto==1 && primo==1)? "vai in barca":"vai in carrozza";
        System.out.println(answer);
        sc.close();
    }   
}
