package l04.e04_seconda_prova;

import java.util.Scanner;

public class francesco_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3; i++){
            
            String parola = sc.next();
            if((!parola.equals("vin")) & (i == 1)){
                System.err.println("Non succede nulla, il Troll /n ti fissa incuriosito");
                parola = sc.next();
                if((!parola.equals("vin")) & (i == 2)){
                    System.err.println("Non succede nulla, il Troll /n ti fissa incuriosito");
                }else{
                    System.err.println("Splat! Il Troll ti ha spalmato sulla parete");
                }
            }
        }
    }
}
