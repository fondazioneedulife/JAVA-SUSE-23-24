package bilaterali;
import java.util.Scanner;

public class bilaterali {
    public static void main(String[] args) {
       functionRed();
    }


    static void functionRed(){
        Scanner sc = new Scanner(System.in);
        Scanner sci = new Scanner(System.in);

        String numeroTel;
        int risposta;

        System.out.println("Componi il numero di telefono della persona: ");
        numeroTel = sc.next();
        System.out.println("\n");

        System.out.println("La persona è in casa? (0/no 1/si) ");
        risposta = sci.nextInt();
        System.out.println("\n");
        System.out.println(risposta);
        if(risposta == 0){
            nonCasa();
        }
        inCasa();
        sc.close();
        sci.close();
    }
        public static void inCasa(){
            Scanner sc = new Scanner(System.in);

            int risposta2;
            System.out.println("Ti va di mangiare qualcosa insieme? (0/no 1/si) ");
            System.out.println("Ascolta la risposta ");
            risposta2 = sc.nextInt();

            System.out.println("\n");
            if(risposta2 == 1){
                System.out.println("Mangiate qualcosa insieme ");
                System.out.println("Siete diventati amici!\n ");
            }
            else{
                functionBlue();
            }
            sc.close();
        }

        public static void nonCasa(){
            System.out.println("Lascia un messaggio ");
            System.out.println("Aspetta di essere richiamato\n ");
        }
    

    static void functionBlue(){
            Scanner sc=new Scanner(System.in);
            System.out.println("e ti piacerebbe qualcosa di caldo? (1/si, 0/no)");
            int bere_caldo = sc.nextInt(); 
            // 1/si, 0/no
            if (bere_caldo == 0){
                System.out.println("turno di fra");
                functionGreen();
            }
            else if (bere_caldo == 1){
                System.out.println("scegli tra the, caffè e cioccolata");
                System.out.println("quale preferisci? \n 0 per il the\n 1 per il caffè \n 2 per la cioccolata)");
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
            sc.close();
    }

    static void functionGreen(){
        Scanner sc=new Scanner(System.in);
        System.out.println("allora svagliamoci un po, ");
        int k = 0;
        int i = 0;
        do{
            System.out.println("cos'altro ti va di fare? \nmi piace? (0/no 1/si)");
            int x = sc.nextInt();
            if(x == 0){
                i++;
                if(i > 6){
                    System.out.println("scegli tra tutte le opzioni quella meno disumana");
                    System.out.println("fattela piacere");
                    System.out.println("svagatevi insieme");
                    k = 1;
                    //siete amici
                }
            }else{
                System.out.println("facciamo insieme");
                System.out.println("svagatevi insieme");
                //siete amici
                k = 1;
            }

        }while(k==0);
        sc.close();
            
    }
}

