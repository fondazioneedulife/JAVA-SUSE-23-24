package l03.e03.nicolis_A_swich.bin;

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
                        int genere = 0;
                }else{
                        int genere = 1;
                }

                switch (n) {
                        case 'A':
                        System.out.println();  
                                break;
                
                        default:
                                break;
                }
                

                switch (c) {
                        case 'A':
                                
                                break;
                
                        default:
                                break;
                }
                sc.close();
        }
}