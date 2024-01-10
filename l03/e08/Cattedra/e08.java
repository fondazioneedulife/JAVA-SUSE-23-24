package l03.e08.Cattedra;
/*
 Weekend ad Hogsmeade. Vuoi entrare
nella locanda «la testa di porco». Ti
chiedono l’età. Per qualche strana
ragione non possono entrare i maghi e le
streghe che hanno più di 5 lettere nel
nome OPPURE non possono entrare quelli che hanno tra 2 E 15
anni.
Ti fa questa domanda 3 volte, se dici tre
volte un’età non adatta il locandiere si
spazientisce e ti butta fuori dal locale,
altrimenti fa finta di niente e ti lascia
entrare, alla salute
 */
public class e08 {

    public static void main(String[] args) {

        String nome = "Luca";
        int anni = 15;

        for (int i = 0; i < 3; i++) {
            System.out.println("Quanti anni hai?");
            // input
            if (anni > 2 && anni < 15) {
                System.out.println("Non puoi entrare!");
            }
        }

        if (!(anni > 2 && anni < 15) && (nome.length() < 5)) {
            System.out.println("benvenuto");
        }

    }
    
}
