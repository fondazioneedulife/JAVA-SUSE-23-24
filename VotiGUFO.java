import java.util.Scanner;

public class VotiGUFO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String giudizio = "";
        int voto = 0;
        do{
        System.out.println("Dammi un voto");
        voto = (int)sc.nextFloat();
        if (voto > 10 || voto < 0){
            System.out.println("I voti devono essere tra lo 10 e lo 0.");
        }
        }while(voto > 10 || voto < 0);

        switch (voto) {
            case 0 :
            case 1:
            case 2:
                giudizio = "Troll";
                break;
            case 3:
            case 4:
                giudizio = "Desolante";
                break;
            case 5:
                giudizio = "Scadente";
                break;

            case 6:
            case 7:
                giudizio = "Accettabile";
                    break;
            case 8:
            case 9:
                giudizio = "Oltre il previsto";
                break;
            default:
                giudizio = "Eccezionale!!";
                break;
        }
        System.out.println(giudizio);
    }
}