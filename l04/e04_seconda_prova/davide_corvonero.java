package l04.e04_seconda_prova;
import java.util.Scanner;
public class davide_corvonero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Un Troll nei sotterranei! (Io ve l'ho detto ...uh!))");
        for (int i=1;i<=3;i++){
            String parolachiave = sc.nextLine();
            if (i==1 && !(parolachiave.equals("Vingardium Leviosa"))){
                System.out.println("Non succede nulla, il Troll ti fissa incuriosito");
            } else if (i==2 && !(parolachiave.equals("Vingardium Leviosa"))){
                System.out.println("Non succede nulla, il Troll emette un verso tremendo!");
            } else if (i==3 && !(parolachiave.equals("Vingardium Leviosa"))){
                System.out.println("Splat! Il Troll ti ha spalmato sulla parete");
            }
            if (parolachiave.equals("Vingardium Leviosa")){
                System.out.println("Sei salvo!");
                break;
            }

        }
    }
}
