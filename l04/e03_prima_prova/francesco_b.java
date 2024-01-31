package l04.e03_prima_prova;
public class francesco_b {

    public static void main(String[] args) {
        int voto=2;
        switch (voto) {
            case 10:
                System.out.println("Eccezionale");
                break;
            case 8,9:
                System.out.println("Oltre ogni previsione");
                break;
            case 6,7:
                System.out.println("Accettabile");
                break;
            case 5:
                System.out.println("Scadente");
                break;
            case 3,4:
                System.out.println("Desolante");
                break;
            case 0,1,2:
                System.out.println("Troll");
                break;
            default:
                break;
        }
    }
}