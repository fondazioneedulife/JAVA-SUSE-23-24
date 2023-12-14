package bilaterali;
import java.util.Scanner;

public class bilaterali {
    public static void main(String[] args) {
       functionRed();
    }


    static void functionRed(){
        Scanner sc = new Scanner(System.in);

        String numeroTel;
        String risposta;

        System.out.println("Componi il numero di telefono della persona: ");
        numeroTel = sc.next();
        System.out.println("\n");

        System.out.println("La persona è in casa? (si/no) ");
        risposta = sc.next();
        System.out.println("\n");
        System.out.println(risposta);
        if(risposta.equals("no")){
            nonCasa();
        }
        inCasa();
        sc.close();
    }
        public static void inCasa(){
            Scanner sc2 = new Scanner(System.in);
            String risposta2;
            System.out.println("Ti va di mangiare qualcosa insieme? (si/no) ");
            System.out.println("Ascolta la risposta ");
            risposta2 = sc2.next();
            System.out.println("\n");
            if(risposta2.equals("si")){
                System.out.println("Mangiate qualcosa insieme ");
                System.out.println("Siete diventati amici!\n ");
            }
            else{
                functionBlue();
            }
            sc2.close();
        }

        public static void nonCasa(){
            System.out.println("Lascia un messaggio ");
            System.out.println("Aspetta di essere richiamato\n ");
        }
    

    static void functionBlue(){
            Scanner sc=new Scanner(System.in);
            System.out.println("e ti piacerebbe qualcosa di caldo? 1/si, 0/no");
            int bere_caldo = sc.nextInt();
            int n = 1; 
            // 1/si, 0/no
            if (bere_caldo == 0){
                System.out.println("turno di fra");
                functionGreen();
            }
            else if (bere_caldo == 1){
                System.out.println("scegli tra the, caffè e cioccolata");
                System.out.println("quale preferisci? (0 per il the, 1 per il caffè, 2 per la cioccolata)");
                int bevanda = sc.nextInt();

                if (bevanda == 0){
                    System.out.println("facciamoci questo the!");
                }
                else if (bevanda == 1){
                    System.out.println("facciamoci questo caffè!");
                }
                else if (bevanda == 2){
                    System.out.println("facciamoci questa cioccolata!");

                }
            }
    }

    static void functionGreen(){
        Scanner sc=new Scanner(System.in);
        System.out.println("allora svagiamoci un po, ");
        int i;
        int k = 0;
        do{
            System.out.println("cos'altro ti va di fare?");
            int x = sc.nextInt();
            System.out.println("mi piace? 0/no 1/si");
            
            if(x==0){
                i =+ 1;
                if(i > 6){
                    System.out.println("scegli tra tutte le opzioni quella meno disumana");
                    System.out.println("fattela piacere");
                    System.out.println("svagatevi in sieme");
                    k = 1;
                    //siete amici
                }
            }else{
                System.out.println("facciamo in sime");
                System.out.println("svagatevi in sieme");
                //siete amici
                k = 1;
            }

        }while(k==0);
            
    }
}

