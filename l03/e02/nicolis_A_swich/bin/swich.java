package nicolis_A_swich.bin;

import java.sql.Array;
import java.util.Scanner;

class swich {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("qual è il tuo nome e cognome?");
                String nome = sc.nextLine();
                String cognome = sc.nextLine();
                char n = nome.charAt(0);
                char c = cognome.charAt(0);
                String sesso = sc.nextLine();

                if (sesso.equals("maschile")){
                        switch (n) {
                                case 'A':
                                        
                                        break;
                
                                default:
                                        break;
                        }
                }else{
                        switch (n) {
                                case 'A':
                                
                                        break;
                
                                default:
                                        break;
                        }
                }

                switch (c) {
                        case 'A':
                                
                                break;
                
                        default:
                                break;
                }
        }
}