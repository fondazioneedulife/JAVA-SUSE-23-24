package l02.e02.vaporeon;
import java.util.Scanner;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes

public class friendship {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    }

    static int red(Scanner sc)
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
        }
        
        return flag;
    }

    static void blue(Scanner sc)
    {
        System.out.println("E di bere qualcosa di caldo?");
        sc = sc.nextInt();

        if (sc)
        {
            System.out.println("E di bere qualcosa di caldo?");
            switch(sc)
            {
                case 0:
                    System.out.println("Fatevi `sto tè");
                    break;

                case 1:
                    System.out.println("Fatevi `sto coffee");
                    break;

                case 2:
                    System.out.println("Fatevi `sta cioccolata");
                    break;
            }

            return true;

        }
        else {
            green();
        }
    }

    static boolean green(Scanner sc)
    {
        int n = 0;
        String[] attivita;
        boolean rimani = true;
        System.out.println("Allora svaghiamoci un po'... ");
        do{
            System.out.println("...cos'altro ti va di fare? ");
            attivita[n] = sc.nextLine();
            System.out.println(attivita[n] + " è una cosa che va di fare anche a me? ('true' per si e 'false' per no) ");
            boolean scelta;
            do{
                scelta = sc.nextBoolean();
            } while (scelta || !scelta);
            if (scelta) {
                System.out.println("E facciamolo assieme, dai... ");
                rimani = false;
            } else {
                n++;
                if (n > 6){
                    System.out.println("Scegli fra tutte le opzioni quella che ti appare meno disumana e fattela piacere");
                    for (int i = 0; i < n; i++){
                        System.out.println(attivita[i]);
                    }
                    rimani = false;
                }
            }
        } while (rimani);
        return true;
    }

}
