
import java.util.Scanner; 

public class esercizio {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("inserisci il numero di telefono ");
        int numero = sc.nextInt(); // read user input
        System.out.println(" È in casa ? 1 = Sì 0 = No");
        int risposta= sc.nextInt();
        if(risposta == 1)
        {
            System.out.println("TI va di mangiare qualcosa fuori");
            int a = sc.nextInt();

            if (a ==1) {
                System.out.println("andiamo a mangiare qualcosa ");
                System.out.println("siete diventati amici ;)");
            }
            if (a == 0 ) {
                System.out.println("vuoi bere qualcosa ?");
                int b = sc.nextInt();
                if(b ==1){
                    System.out.println("Cosa vuoi bere? caffè, cioccolata, té");
                    System.out.println("siete diventati amici ;)");
                }
                if(b ==0){
                    System.out.println("Allora svaghiamoci un pò cos'altro ti va di fare?");
                    int c=0;
                   while (c < 6) {
                        int e = sc.nextInt();
                        if(e == 1){
                            System.out.println("Ci sto");
                            System.out.println("siete diventati amici ;)");
                        }
                        else{
                            if(e == 0){
                                c = c + 1;
                            }
                            if(c == 6){
                                System.out.println("Accetta la proposta fatta.");
                                System.out.println("siete diventati amici ;)");
                            }
                        }

                   }
                }
            }
       
        }
        else if(risposta== 0){
            System.out.println("lascia un messaggio, aspetto di essere richiamato");
        }
    
    }
    
}