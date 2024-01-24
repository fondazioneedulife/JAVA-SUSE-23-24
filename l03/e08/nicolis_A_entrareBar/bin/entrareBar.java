package nicolis_A_entrareBar.bin;

import java.util.Scanner;

class entrareBar {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int cont = 0;
                String name = sc.nextLine();
                for (int i = 0; i < 3; i++) {
                        
                        int eta = sc.nextInt();
                        if(name.length() > 5 || (2 < eta && eta < 15)){
                                cont++;
                        }
                }
                if (cont == 3) {
                        System.out.println("sparisci");
                }else{
                        System.out.println("Benventuto cliente");
                }
                sc.close();
        }
}