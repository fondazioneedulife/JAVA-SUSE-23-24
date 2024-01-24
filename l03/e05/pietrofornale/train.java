//package l03.e05.pietrofornale;

import java.util.Scanner;

public class train {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Are you a freshman?");
        String fm = sc.nextLine();
        fm = fm.toUpperCase();

        System.out.println("Can you swim?");
        String sw = sc.nextLine();
        sw = sw.toUpperCase();

        String answer = (fm.equals("YES") && sw.equals("YES"))? "Let's sail away":"Go with them losers";
        
        System.out.println(answer);

    }
}