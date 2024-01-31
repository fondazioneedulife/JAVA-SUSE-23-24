import java.util.Scanner;
public class es03_Paolo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il voto: ");
        int voto = sc.nextInt();
        sc.close();
        if( voto == 10 ){
            System.out.println("Eccezionale");
        }
        else{ if ( voto == 8 || voto == 9) {
            System.out.println("Oltre ogni previsione");
        }
        else{ if (voto == 7 || voto == 6) {
            System.out.println("Accettabile");
        }
        else{ if ( voto == 5 ) {
            System.out.println("Scadente");
        }
        else { if ( voto == 3 || voto == 4 ) {
            System.out.println("Desolante");            
        }
        else {
            System.out.println("Troll");
        }
        }
        }
        }

        }
        
    }
}
