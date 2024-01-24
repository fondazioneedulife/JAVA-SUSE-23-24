package l03.e08;
/*
 Weekend ad Hogsmeade. Vuoi entrare
nella locanda «la testa di porco». Ti
chiedono l’età. Per qualche strana
ragione non possono entrare i maghi e le
streghe che hanno più di 5 lettere nel
nome OPPURE non hanno tra 2 E 15
anni.
Ti fa questa domanda 3 volte, se dici tre
volte un’età non adatta il locandiere si
spazientisce e ti butta fuori dal locale,
altrimenti fa finta di niente e ti lascia
entrare, alla salute
 */
import java.util.Scanner;
public class e08_francesca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Come ti chiami?");
        String nome = sc.nextLine();
        int anni = -1;
        int count;
        if (nome.length()<=5){
            count = 2;
        } else {
            count = 0;
        }
        
        do {
            if (count>=3){
                break;
            }
            System.out.println("Quanti anni hai?");
            anni = sc.nextInt();
            count ++;
        } while (anni<=15 && anni >=2);
        if (nome.length()<=5 || anni>15 || anni <2){
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }
        sc.close();
    }
}
