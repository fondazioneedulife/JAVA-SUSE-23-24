package l03.e05.Cattedra;

/*
    Sei appena sceso dal treno che ti ha
    portato ad Hogwarts. Compare
    Hagrid.
    Hagrid ti chiede se sei del primo
    anno e se sai nuotare.
    Se sai nuotare E sei del primo anno
    vai in barca, altrimenti usi la
    carrozza.
 */
import java.util.Scanner;
 public class e05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sei del primo anno?\nsi | no");
        String anno = sc.nextLine();
        System.out.println("Sai nuotare?\nsi | no");
        String nuoto = sc.nextLine();
        boolean nuoto_boolean = nuoto.equals("si");

        if (anno == "si" && nuoto_boolean){
            System.out.println("Vai in barca");
        } else {
            System.out.println("Usa la carrozza");
        }
    }
}
