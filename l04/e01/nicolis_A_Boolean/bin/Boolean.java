package nicolis_A_Boolean.bin;

import java.util.Scanner;

class Boolean {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("che occupazione hai? studente, preside o insegnante");
                String occupString = sc.nextLine();

                
                System.out.println("hai una divisa?");
                boolean divisa = sc.nextBoolean();
                boolean studente = false;
                System.out.println("sei un fantasma?");
                boolean fantasma = sc.nextBoolean();
                System.out.println("hai un cane?");
                boolean cane = sc.nextBoolean();
                boolean occupazione = false;
                
                
                

                if (occupString.equals("studente")){
                        studente = true;
                }else if(occupString.equals("insegnante") || occupString.equals("preside")) {
                        occupazione = true;
                }else{
                        occupazione = false;
                }
                
                if (cane == true){
                        System.out.println("non puoi entrare");
                }else if (fantasma) {
                        System.out.println("puoi entrare");
                }else if(studente == true && divisa == true){
                        System.out.println("puoi entrare");
                }else if (occupazione) {
                        System.out.println("puoi entrare");
                }else{
                        System.out.println("non puoi entrare");
                }

                sc.close();
        }
}