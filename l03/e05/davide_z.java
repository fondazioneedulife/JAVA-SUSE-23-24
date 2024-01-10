package l03.e05;
import java.util.Scanner;
public class davide_z {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Sei del primo anno?");
        int primo = sc.nextInt();
        System.out.println("Sai nuotare?");
        int nuoto = sc.nextInt();
        String risposta = (nuoto==1 && primo==1)? "vai in barca":"vai in carrozza";
        System.out.println(risposta);
        sc.close();
    }
}
