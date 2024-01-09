package l03.e05.Docente;

import java.util.Scanner;

public class e05 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Sei del primo anno?");
        int primo = sc.nextInt();
        System.out.println("Sai nuotare?");
        int nuoto = sc.nextInt();
        String answer = (nuoto==1 && primo==1)? "vai in barca":"vai in carrozza";
        System.out.println(answer);
        sc.close();
    }
    
}
