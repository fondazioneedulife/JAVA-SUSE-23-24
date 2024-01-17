package l02.e02.altro;
import java.util.Scanner;

public class amicizia_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); {
        System.out.println("Svegliamoci un po' dai...");
        for (int n = 0; n < 6; n++ ) {
            System.out.println("...cos'altro ti piace?");
            String dom = sc.nextLine();
            System.out.println("è una cosa che ci piace?");
            String answ = sc.nextLine();
        
            if (answ == "si" || answ == "Si") {
                System.out.println("facciamolo insieme va, svagaghiamoci insieme allora!");
                n = n + 6;
            }
            else if (answ == "no" || answ =="No") {
                n = n + 1;
                if (n == 6) {
                    System.out.println("Scegliene una di queste e fattela piacere!");
                }                           
            }
                System.out.println("Ora potete svagarvi insieme!!!");
            
                    sc.close();
                    }
            }
        }
}


