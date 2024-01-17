import java.util.Scanner;

public class ex2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Un Troll nei sotterranei!(Io ve l'ho detto...uh!)");
        System.out.println("Formula magica: ");
        String parola = sc.nextLine();
        if (parola.equals("Vingardium Leviosa")){
            System.out.println("Sei salvo!");
        } else {
            System.out.println("Non succede nulla, il Troll ti fissa icuriosito");
            System.out.println("Formula magica: ");
            parola = sc.nextLine();
            if (parola.equals("Vingardium Leviosa")){
                System.out.println("Sei salvo!");
            } else {
                System.out.println("Non succede nulla, il Troll emette un verso tremendo!");
                System.out.println("Formula magica: ");
                parola = sc.nextLine();
                if (parola.equals("Vingardium Leviosa")){
                    System.out.println("Sei salvo!");
                } else {
                    System.out.println("Splat! Il Troll ti ha spalmato sulla parete");
                }
            }
        }
    }
}