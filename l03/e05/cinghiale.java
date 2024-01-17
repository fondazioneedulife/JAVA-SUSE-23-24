import java.util.Scanner;

public class cinghiale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Età?");
            int età = sc.nextInt();
            System.out.println("Nome?");
            Scanner sc2 = new Scanner(System.in);
            String nome = sc2.nextLine();
            if ((età < 2) || (età > 15) && (nome.length()) < 5) {
                System.out.println("Puoi entrare");
                break;
            }
            if (i == 2) {
                System.out.println("Sei fuori");
                break;
            }
        }
    }
}
