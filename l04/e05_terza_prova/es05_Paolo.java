import java.util.Scanner;
public class es05_Paolo{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pensa a un numero");
        System.out.println("Il tuo numero è compreso in questa colonna: ");
        for(int i = 1; i <= 62;){
            System.out.println(i);
            i = i + 2;
        }
        int primo = sc.nextInt();

        System.out.println("\nIl tuo numero è compreso in questa colonna: ");
        for(int i = 2; i <= 62;){
            System.out.println(i);
            i = i + 1;
            System.out.println(i);
            i = i + 2;
            
        }
        int secondo = sc.nextInt();
        
        System.out.println("\nIl tuo numero è compreso in questa colonna: ");
        for(int i = 4; i <= 62;){
            for(int o = 0; o <= 4; o++){
                System.out.println(i);
                i++;
            }
            i = i + 2;
            
        }
        int terzo = sc.nextInt();

        System.out.println("\nIl tuo numero è compreso in questa colonna: ");
        for(int i = 4; i <= 62;){
            for(int o = 0; o <= 8; o++){
                System.out.println(i);
                i++;
            }
            i = i + 2;
            
        }
        int quarto = sc.nextInt();
        
        System.out.println("\nIl tuo numero è compreso in questa colonna: ");
        for(int i = 8; i <= 62;){
            for(int o = 0; o <= 8; o++){
                System.out.println(i);
                i++;
            }
            i = i + 2;
            
        }
        int quinto = sc.nextInt();
        
        System.out.println("\nIl tuo numero è compreso in questa colonna: ");
        for(int i = 16; i <= 62;){
            for(int o = 0; o <= 16; o++){
                System.out.println(i);
                i++;
            }
            i = i + 2;
            
        }
        int sesto = sc.nextInt();
        
        System.out.println("\nIl tuo numero è compreso in questa colonna: ");
        for(int i = 32; i <= 62;){
            for(int o = 0; o <= 32; o++){
                System.out.println(i);
                i++;
            }
            i = i + 2;
            
        }
        int settimo = sc.nextInt();
        sc.close();

        System.out.println( primo );
        System.out.println( secondo );
        System.out.println( terzo );
        System.out.println( quarto );
        System.out.println( quinto );
        System.out.println( sesto );
        System.out.println( settimo );
    }
}
