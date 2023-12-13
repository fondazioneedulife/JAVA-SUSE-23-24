import java.util.Scanner;
<<<<<<< Updated upstream
public class amicizia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VerdeAm();
=======

public class amicizia {
    public static void main(String[] args) {
        rosso();
    }

    static void rosso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Componi il numero di telefono di una persona.");
        //int anni = sc.nextInt();
        System.out.println("E' in casa?");
        String risposta = sc.nextLine();
        if (risposta.equals("no")){
            System.out.println("Lascia un messaggio.");
            System.out.println("Aspetta di essere richiamato.");
        }
        System.out.println("Ti va di mangiare qualcosa insieme?");
        risposta = sc.nextLine();
        if (risposta.equals("si")){
            System.out.println("Mangiate qualcosa assieme.");
        }else{
            System.out.println("blue");
        }

        sc.close();
>>>>>>> Stashed changes
    }

    public static void VerdeAm(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String[] inte = new String[6];
        System.out.println("Allora svaghiamoci un pò...");

        for (int i = 0; i < 6; i++) {
            System.out.println("...cos'altro ti va di fare ?");
            inte[n] = sc.nextLine();
            System.out.println("è una cosa che ti va di fare anche a te ?");
            String sentim = new String();
            //do {
            sentim = sc.nextLine();
            //System.out.println("ciao" + n);
            //} while (! (sentim.equals("Si")) ||  !(sentim.equals("No")));
            if (sentim.equals("Si")) {
                System.out.println("Facciamo insieme questa :" + inte[n]);
                return;
            }else{
                n++;
            }
        }

        System.out.println("Scegli tra tutte le opzioni quella che sembra essere la meno disumana");
        int num = sc.nextInt();
        System.out.println("Facciamo insieme questa attività :" + inte[num]);
        System.out.println("Divertitevi");
    }

}