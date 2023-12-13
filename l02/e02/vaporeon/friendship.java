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

    static void red()
    {
        

    }

    static void blue(int sc)

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
            System.out.println(attivita[n] + " è una cosa che va di fare anche a me? ");
            boolean scelta = sc.nextBoolean();
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
