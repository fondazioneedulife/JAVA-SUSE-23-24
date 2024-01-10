  
    ///Dalla parte blu c'é una domanda che se si risponde no è: "E di bere qualcosa di caldo?"
    ///Lì le risposte sarebbero queste:
    import java.util.Scanner;
    class EsercizioTabellaAmicizia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("E di bere qualcosa di caldo?\n 0. No\n 1. Si");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Allora svaghiamoci un po'..");
        }
        else if (n == 1) {
            System.out.println("Che Bevanda vuoi?\n 1. Tè\n 2. Caffè\n 3. Cioccolata");
            n = sc.nextInt();
            
        
            if (n == 1) {
                System.out.println("Andiamo a fare un Tè, dai.");
            }
            else if (n == 2) {
                System.out.println("Andiamo a bere un Caffè così ci tiriamo su.");
            }
            else if (n == 3) {
                System.out.println("Una cioccolata calda non fa mai male.");
            }
        sc.close();
        }
    }
}

