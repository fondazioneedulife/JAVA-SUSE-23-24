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

        System.out.println("Siete diventati AmIcI!!!!!");

    }

    static Boolean red(Scanner sc)
    {
        int scelta;
        Boolean flag = false;
        
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
            flag = true;
        }
        
        return flag;
    }

    static boolean blue(Scanner sc)
    {
        boolean flag = false;
        System.out.println("E di bere qualcosa di caldo?");
        boolean choice = (sc.nextInt() == 1) ? true:false;

        if (choice)
        {
            System.out.println("Scegli:\n1. Tè\n2. Caffè\n3. Cioccolata");
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
        String[] attivita = new String[6];
        boolean rimani = true;
        System.out.println("Allora svaghiamoci un po'... ");
        do{
            System.out.println("...cos'altro ti va di fare? ");
            attivita[n] = sc.nextLine();
            System.out.println(attivita[n] + " è una cosa che va di fare anche a me? ('1' per si e '0' per no) ");
            int scelta;
            do{
                scelta = sc.nextInt();
            } while (scelta == 0 || scelta == 1);
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
        return true;
    }

}
