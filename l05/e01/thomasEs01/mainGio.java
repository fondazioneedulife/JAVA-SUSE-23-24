package l05.e01.thomasEs01;

import java.util.Scanner;

public class mainGio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        giocatore totti = new giocatore();
        giocatore zanetti = new giocatore("zanetti", true, 
        50, 100);
        giocatore delPiero = new giocatore();

        //totti
        totti.setNome("Tottus");
        totti.setCapitano(true);
        totti.setGoal(12);
        totti.setGoalNazionale(78);

        System.out.println(totti.toString());
        System.out.println("Il giocatore ha fatto: " + 
        totti.calcolaGoalTotali(20, 70) + " goal");

        //zanetti
        System.out.println(zanetti.toString());
        System.out.println("Il giocatore ha fatto: " + 
        zanetti.calcolaGoalTotali(zanetti.getGoal(), zanetti.getGoalNazionale()) + 
        " goal");


        //delPiero
        System.out.println("Inserire il nome del giocatore: ");
        delPiero.setNome(sc.nextLine());

        System.out.println("Il giocatore è un capitano? (y = si / n = no)");
        delPiero.setCapitano((sc.nextLine() == "y") ? true : false);

        System.out.println("Inserire i goal del giocatore: ");
        delPiero.setGoal(sc.nextInt());

        System.out.println("Inserire i goal del giocatore in Nazionale: ");
        delPiero.setGoalNazionale(sc.nextInt());

        delPiero.toString();
        System.out.println("Il giocatore ha fatto: " + 
        delPiero.calcolaGoalTotali(delPiero.getGoal(), delPiero.getGoalNazionale()) 
        + " goal");
    }
}
