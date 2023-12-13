import java.util.Scanner;
    public class bila1 
    {
        public static void main(String[] args)
        {
            int cibo = 0;
            Scanner sc=new Scanner(System.in);
            System.out.println("e ti piacerebbe qualcosa di caldo? (1 per si, 0 per no)");
            int bere_caldo = sc.nextInt();

            if (bere_caldo == 0){
                System.out.println("turno di fra");
                

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
    }
