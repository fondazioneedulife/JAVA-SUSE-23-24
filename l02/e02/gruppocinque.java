import java.util.Scanner;
public class gruppocinque {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String scelta = "";
            do {
                System.out.println("Componi il numero di telefono della persona");
                scelta = sc.nextLine();
                }
                while (!(isNumeric(scelta)));
 
            sc = new Scanner(System.in);
            String casa = "";

            do {
                System.out.println("E' in casa?");
                casa = sc.nextLine();
            } while (!((casa.equals("si")) || (casa.equals("no"))));

                String mangiare = "";
                if (casa.equals("si")){
                    do {
                        System.out.println("Ti va di mangiare qualcosa insieme?");
                        mangiare = sc.nextLine();
                    } while (!((mangiare.equals("si")) || (mangiare.equals("no"))));

                        if (mangiare.equals("si")) {
                        System.out.println("Mangiamo qualcosa insieme");
                        }
                } 
                
                if (casa.equals("no")){
                System.out.println("Lascia un messaggio");
                String messaggio = sc.nextLine();
                System.out.println("Aspetta di essere richiamato");
                }
            
            }
            
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
