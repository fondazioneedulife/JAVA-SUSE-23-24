package l02.e02.vaporeon;
import java.util.Scanner;

public class friendship {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    }

    static int red()
    {
        int scelta;
        int flag = 0;
        
        System.out.println("Componi il numero della persona");
        
        System.out.println("E' in casa? (Inserisci: 1. se è in casa, 0. se non c'è)");
        scelta = sc.nextInt();
        
        if(scelta == 0){
            System.out.println("Lascia un messaggio");
            System.out.println("Aspetta di essere richiamato");
        }

        System.out.println("Ti va di mangiare qualcosa insieme?");
            
        System.out.println("Ascolta la risposta (Inserisci: 1. se accetta, 0. se rifiuta)");
        scelta = sc.nextInt();

        if(scelta == 1){
            System.out.println("Mangiate qualcosa insieme");
            flag = 1;
            return flag;
        }
        else if(scelta == 0){
            return flag;
        }

    }

    static void blue()
    {


    }

    static boolean green()
    {
        
        return true;
    }


}
