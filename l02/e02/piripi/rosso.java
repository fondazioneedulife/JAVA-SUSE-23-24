import java.util.Scanner;

public class amicizia {
    public static void main(String[] args) {
        rosso();
    }

    static void rosso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Componi il numero di telefono di una persona.");
        //int anni = sc.nextInt();
        System.out.println("E' in casa?");
        String risposta = sc.nextLine();
        if (risposta.equals("no")){
            System.out.println("Lascia un messaggio.");
            System.out.println("Aspetta di essere richiamato.");
        }
        System.out.println("Ti va di mangiare qualcosa insieme?");
        risposta = sc.nextLine();
        if (risposta.equals("si")){
            System.out.println("Mangiate qualcosa assieme.");
        }else{
            System.out.println("blue");
        }

        sc.close();
    }
}
