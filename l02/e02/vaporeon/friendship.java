package l02.e02.vaporeon;
import java.util.Scanner;


public class friendship {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        if(!red(sc)){
            if(!blue(sc)){
                if(!green(sc)){

                }
            }
        }

        System.out.println("\nSiete diventati AmIcI!!!!!");

        sc.close();
    }

    static Boolean red(Scanner sc)
    {
        int scelta;
        Boolean flag = false;
        
        System.out.println("Componi il numero della persona");
        
        System.out.println("E' in casa?\nInserisci:\n1. Se è in casa\n0. Se non c'è");
        scelta = sc.nextInt();
        
        if(scelta == 0){
            System.out.println("Lascia un messaggio");
            System.out.println("Aspetta di essere richiamato");
        }

        System.out.println("\nTi va di mangiare qualcosa insieme?");
            
        System.out.println("Ascolta la risposta\nInserisci:\n1. se accetta\n0. se rifiuta");
        scelta = sc.nextInt();

        if(scelta == 1){
            System.out.println("Mangiate qualcosa insieme");
            flag = true;
        }
        
        return flag;
    }

    static boolean blue(Scanner sc)
    {
        boolean flag = false;
        System.out.println("\nE di bere qualcosa di caldo?\nInserisci:\n1. se accetta\n0. se rifiuta");
        boolean choice = (sc.nextInt() == 1) ? true:false;

        if (choice)
        {
            System.out.println("\nScegli:\n1. Tè\n2. Caffè\n3. Cioccolata");
            int selection = sc.nextInt();

            switch(selection)
            {
                case 1:
                    System.out.println("Fatevi `sto tè");
                    break;

                case 2:
                    System.out.println("Fatevi `sto coffee");
                    break;

                case 3:
                    System.out.println("Fatevi `sta cioccolata");
                    break;
            }

            flag = true;

        }
        return flag;
    }

    static boolean green(Scanner sc)
    {
        int n = 0;
        Scanner scan = new Scanner(System.in);
        String[] attivita = new String[6];
        boolean rimani = true;
        System.out.println("Allora svaghiamoci un po'... ");

        do{
            System.out.println("...cos'altro ti va di fare? ");

            attivita[n] = scan.nextLine();
            System.out.println("\n" + attivita[n] + " è una cosa che va di fare anche a me?\n1. Per si\n0. Per no");
            int scelta = sc.nextInt();
            if (scelta == 1) {
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
        scan.close();
        return true;
    }

}
