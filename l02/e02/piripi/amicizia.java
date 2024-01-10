import java.util.Scanner;
public class amicizia {
    public static void main(String[] args) {
        rosso();
        System.out.println("SIETE DIVENTATI AMICI! ora hai una persona in più a cui rompere le palle in caso di bisogno e viceversa.");
    }

    public static void rosso(){
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
            blue();
        }
        sc.close();
    }

    public static void blue(){
        System.out.println("Vuoi andare a bere qualcosa di caldo?");
        Scanner sc = new Scanner(System.in);
        System.out.println("qual è la risposta? sì e no] ");
        String risposta = sc.nextLine();
        if (risposta.equals("Si")){
            Scanner cc = new Scanner(System.in);
            System.out.println("scegli tra: 1=te, 2=caffè, 3=cioccolata");
            int bevanda = cc.nextInt();
                if (bevanda == 1){
                    System.out.println("Fatevi sto te");
                }
                else if (bevanda == 2){
                    System.out.println("Fatevi sto caffè");
                }
                else if (bevanda == 3){
                    System.out.println("Fatevi sto cioccolato");
                }
            cc.close();
        }
        else{
            verde();
        }
        sc.close();
    }

    public static void verde(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String[] inte = new String[5];
        System.out.println("Allora svaghiamoci un pò...");

        for (int i = 0; i < 6; i++) {
            System.out.println("...cos'altro ti va di fare ?");
            inte[n] = sc.nextLine();
            System.out.println("è una cosa che ti va di fare anche a te ?");
            String sentim = new String();
            do {
                sentim = sc.nextLine();
            } while (!((sentim.equals("Si")) ||  (sentim.equals("No"))));
            if (sentim.equals("Si")) {
                System.out.println("Facciamo insieme questa :" + inte[n]);
                break;
            }else{
                n++;
            }
        }

        System.out.println("Scegli tra tutte le opzioni quella che sembra essere la meno disumana");
        int num = sc.nextInt();
        System.out.println("Facciamo insieme questa attività :" + inte[num]);
        System.out.println("Divertitevi");
        sc.close();
    }
}