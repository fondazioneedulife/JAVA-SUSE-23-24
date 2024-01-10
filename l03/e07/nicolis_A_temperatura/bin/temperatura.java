package nicolis_A_temperatura.bin;

import java.util.Scanner;

class temperatura {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                boolean piove = sc.nextBoolean();
                int temp = sc.nextInt();
                if(piove && temp<10){
                System.out.println("letto");
                }
                // equivalente di xor
                else if((piove || temp <10) && !(piove && temp<10)){
                System.out.println("ombrello");
                }
                else{
                System.out.println("scopa");
                }
                sc.close();
        }        
}