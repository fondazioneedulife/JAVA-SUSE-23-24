package l03.e06;

import java.util.Scanner;

public class e06_francesca {
    static int count_zampe(int a, int b, int c, int d){
        return a*2+b*4+c*4+d*8;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci quante galline c'erano: ");
        int galline = sc.nextInt();
        System.out.println("Inserisci quanti ippogrifi c'erano: ");
        int ippogrifi = sc.nextInt();
        System.out.println("Inserisci quanti snasi c'erano: ");
        int snaasi = sc.nextInt();
        System.out.println("Inserisci quanti schiopodi c'erano: ");
        int schiopodi = sc.nextInt();
        System.out.println(count_zampe(galline, ippogrifi, snaasi, schiopodi));
        sc.close();
    }
}
