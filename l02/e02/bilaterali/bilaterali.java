package bilaterali;
import java.util.Scanner;

public class bilaterali {
    public static void main(String[] args) {

    }
    static int functionRed(){

    }
    static int functionBleu(){
            Scanner sc=new Scanner(System.in);
            System.out.println("e ti piacerebbe qualcosa di caldo? 1/si, 0/no");
            int bere_caldo = sc.nextInt();
            int n = 1; 
            // 1/si, 0/no
            if (bere_caldo == 0){
                System.out.println("turno di fra");
                n = 0;
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
    
    static int functionGreen(){
        if(n == 0){
            System.out.println("allora svagiamoci un po, ");
            int i;
            int k = 0;
            do{
                System.out.println("cos'altro ti va di fare?");
                System.out.println("mi piace? 0/no 1/si");
                int x = sc.nextInt();

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
}
