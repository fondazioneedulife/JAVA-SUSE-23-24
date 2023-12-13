import java.util.Scanner;

public class HelloWorld
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ciao benvenut* nel mondo di Hello World,\n");  
        System.out.print("io sono Bobo e sono qui per accompagnariti in questa nuova avventura");
        System.out.print("Per iniziare il viaggio dimmi il tuo nome ");
        String nome = sc.nextLine();

        System.out.println("Ciao " + nome + " siamo in una Boss Fight dove affronterai varei sfide fino ad incontrare il Boss.\n Scegli fra le diverse classi possibili del gioco.\n - Mago (Sa fare diverse magie) \n - Armario (colui che sa usare e costruire una qualsiasi arma) \n - Arciere \n - MasterSword (e' un esperto spadaccino) \n - MartialArtsMaster\n");
        String classe = sc.nextLine();
        int bonus = 0
        String abilita = "Abilita"

        if (classe == "Mago" || classe == "mago" || classe == "Armario" || classe == "armario" || classe == "Arciere" || classe == "arciere" || classe == "Mastersword" || classe == "mastersword" || classe == "Martialartsmaster" || classe == "martialartsmaster"){
            if (classe == "Mago" || classe == "mago"){
                System.out.println("Bene ora scegli fra 4 magie che sono: \n 1 Palle di fuoco = Puoi lanciare palle di fuoco che bruciano l'avversario \n 2 Drago d'acqua = Puoi evocare un Drago acquatico che va contro il nemico \n 3 Gravita 100 = Schiaccia il nemico aumentando l'attrazione della Terra sul nemico portandolo a sotterarlo \n 4 Lancie di ghiaccio = ");
            }


        }

}
