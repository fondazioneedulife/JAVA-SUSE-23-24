import java.util.Scanner;
public class es04_Paolo {
    public static void main(String[] args) {
        System.out.println("È presente un troll nei sotterranei");
        for( int i = 0; i <= 3; i++) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una parola per sconfiggerlo: ");
        String parola = sc.nextLine();
        sc.close();

        if( parola == "Vingardium Leviosa"){
            System.out.println("Sei salvo!");
        }
        else {
            if ( i == 1 ){
                System.out.println("Non succede nulla");
            }
            else {
                if ( i == 2 ){
                    System.out.println("Non succede nulla, ha fatto uno strano rumore");
                }
                else {
                    if ( i == 3) {
                        System.out.println("Sei stato sbattuto contro il muro hai perso");
                    }
                }
            }
        }
        }
    }
}