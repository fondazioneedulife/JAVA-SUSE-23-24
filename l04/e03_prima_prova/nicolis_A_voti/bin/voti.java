package l04.e03_prima_prova.nicolis_A_voti.bin;

import java.util.Scanner;

class voti {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                
                System.out.println(num);

                if (num == 10){
                        System.out.println("Eccezionale");
                }else if (num == 9 || num == 8){
                        System.out.println("Oltre ogni previsione");
                }else if (num == 6 || num == 7){
                        System.out.println("Accettabile");
                }else if (num == 5 ){
                        System.out.println("Scadente");
                }else if (num == 3 || num == 4){
                        System.out.println("Desolante");
                }else if (num == 0 || num == 2 || num == 1){
                        System.out.println("Troll");
                }else{
                        System.out.println("non è un numero accettabile");
                }
                sc.close();
        }
}