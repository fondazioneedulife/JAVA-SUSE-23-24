import java.util.Scanner;

public class completo {
    public static void main( String[] args){
        funzioneRossa();
        funzioneBlu();
        funzioneVerde();
    }
    static void funzioneRossa(){

        Scanner sc = new Scanner(System.in);

        String  a = "è in casa? 1 sì 0 no"; 
        System.out.println(a);
        int resp = sc.nextInt();
        if(resp==0){
            System.out.println("non è in casa");
            if(resp==0){
            }


        }
        else{
            System.out.println("è in casa");
            a = "si o no";
            System.out.println(a);
            resp = sc.nextInt();
            if (resp==0){
                System.out.println("Lascia un messaggio");
            }
            else{
                System.out.println("Ti va di mangiare qualcosa insieme?");
            }
        }


        sc.close();
 
    }
    static void funzioneBlu(){
        
        Scanner scanner = new Scanner(System.in);

        String messaggio = "E di bere qualcosa di caldo?\nDigita S per si o digita N per no?";
        System.out.println(messaggio);

        String risposta = scanner.nextLine();

        if (risposta.equalsIgnoreCase("S")) {
            System.out.println("Scegli una delle seguenti opzioni:");

            int opzioneScelta = 0;
            while (opzioneScelta != 3) {
                System.out.println("1. Te");
                System.out.println("2. Caffe");
                System.out.println("3. Cioccolata");

                System.out.print("Inserisci il numero dell'opzione desiderata: ");
                opzioneScelta = scanner.nextInt();

                switch (opzioneScelta) {
                    case 1:
                        System.out.println("Uscite insieme per un Te\nSiete diventati amici");
                        break;
                    case 2:
                        System.out.println("Uscite insieme per un Caffe\nSiete diventati amici");
                        break;
                    case 3:
                        System.out.println("Uscite insieme per una Cioccolata\nSiete diventati amici");
                        break;
                    default:
                        System.out.println("Opzione non valida, riprova");
                }
            }
        } else {
            System.out.println("Allora svaghiamoci un po");
        }

        scanner.close();
        
    }
    static void funzioneVerde(){
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
       
        System.out.println("Cos'altro ti va di fare? ");
        String pr = sc.nextLine();
        System.out.println("è una cosa che  mi va di fare? ");
        String resp =sc.nextLine();
        if (resp.equals("si")){ //.equals = si mette al posto di == per le stringhe
                System.out.println("e facciamolo insieme dai...");
        }
        else if(resp.equals("no")){ 
                while(n < 6){
                        n = n + 1;
                        System.out.println("Altro? ");
                        String alt = sc.nextLine();    

        }

    }

}
}