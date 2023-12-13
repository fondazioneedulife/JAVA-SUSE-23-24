package es9;

import java.util.Scanner;

public class alg_amici {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = 0;
               
                System.out.println("Cos'altro ti va di fare? ");
                String pr = sc.nextLine();
                System.out.println("è una cosa che  mi va di fare? ");
                String resp =sc.nextLine();
                if (resp.equals("si")){ //.equals = si mette al posto di == per le stringhe
                        System.out.println("e facciamolo insieme dai...");
                }
                else if(resp.equals("no")){ 
                        while(n < 6){
                                n = n + 1;
                                System.out.println("Altro? ");
                                String alt = sc.nextLine();    

                }
        }
    
}
}
