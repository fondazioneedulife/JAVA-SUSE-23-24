import java.util.Scanner;

public class funzRossa{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String numeroTel;
        String risposta;

        System.out.println("Componi il numero di telefono della persona: ");
        numeroTel = sc.next();
        System.out.println("\n");

        System.out.println("La persona è in casa? (si/no) ");
        risposta = sc.next();
        System.out.println("\n");
        System.out.println(risposta);
        if(risposta.equals("no")){
            nonCasa();
        }
        inCasa();
        sc.close();
    }

    public static void inCasa(){
        Scanner sc2 = new Scanner(System.in);
        String risposta2;
        System.out.println("Ti va di mangiare qualcosa insieme? (si/no) ");
        System.out.println("Ascolta la risposta ");
        risposta2 = sc2.next();
        System.out.println("\n");
        if(risposta2.equals("si")){
            System.out.println("Mangiate qualcosa insieme ");
            System.out.println("Siete diventati amici!\n ");
        }
        /*else{

        }*/
        sc2.close();
    }

    public static void nonCasa(){
        System.out.println("Lascia un messaggio ");
        System.out.println("Aspetta di essere richiamato\n ");
    }

}
