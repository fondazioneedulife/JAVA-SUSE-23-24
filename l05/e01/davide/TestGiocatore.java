package l05.e01.davide;
import java.util.Scanner;

public class TestGiocatore {
    public static void main(String[] args) {
        Giocatore totti = new Giocatore();
        totti.setNome("Francesco Totti");
        totti.setCapitano(true);
        totti.setGoal(250);
        totti.setGoalNazionale(30);

        Giocatore zanetti = new Giocatore("Javier", false, 30, 10);
        
        Giocatore delPiero = new Giocatore();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome del giocatore..");
        delPiero.setNome(sc.nextLine());

        System.out.println("Il giocatore è capitano? (true/false)");
        delPiero.setCapitano(sc.nextBoolean());

        System.out.println("Numero di goal..");
        delPiero.setGoal(sc.nextInt());

        System.out.println("Numero di goal in nazionale..");
        delPiero.setGoalNazionale(sc.nextInt());

        sc.close();

        System.out.println("Dettagli di totti: " + totti);
        System.out.println("Dettagli di Zanetti:" + zanetti);
        System.out.println("Dettagli di delPiero: " + delPiero);

        System.out.println("Goal totali di Totti: " + totti.calcolaGoalTotali());
        System.out.println("Goal totali di Zanetti: " + zanetti.calcolaGoalTotali());
        System.out.println("Goal totali di delPiero: " + delPiero.calcolaGoalTotali());
        System.out.println(delPiero.toString());
    }
}
