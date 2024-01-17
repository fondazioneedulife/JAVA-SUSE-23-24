import java.util.Scanner;

public class valutazione {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il voto: ");
        int voto = scanner.nextInt();

        String risultato = valutaVoto(voto);
        System.out.println("Risultato: " + risultato);

        scanner.close();
    }

    public static String valutaVoto(int n) {
        switch (n) {
            case 10:
                return "Eccezionale";
            case 9:
            case 8:
                return "Oltre ogni previsione";
            case 7:
            case 6:
                return "Accettabile";
            case 5:
                return "Scadente";
            case 4:
            case 3:
                return "Desolante";
            case 2:
            case 1:
            case 0:
                return "Troll";
        }
    }
}
