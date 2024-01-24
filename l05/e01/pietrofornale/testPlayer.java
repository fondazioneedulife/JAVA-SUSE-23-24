package l05.e01.pietrofornale;

import java.util.Scanner;

public class testPlayer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Player totti = new Player();
    Player zanetti = new Player("Javier Zanetti", true, 32, 5);
    Player delPiero = new Player();

    totti.setName("Francesco Totti");
    totti.setCaptain(true);
    totti.setClubGoals(90);
    totti.setNatGoals(13);

    System.out.println("Name: ");
    delPiero.setName(sc.nextLine());

    System.out.println("Captain: ");
    delPiero.setCaptain(sc.nextInt() > 0);

    System.out.println("Club Goals: ");
    delPiero.setClubGoals(sc.nextInt());

    System.out.println("National Goals: ");
    delPiero.setNatGoals(sc.nextInt());


    System.out.println(totti.toString());
    System.out.println(zanetti.toString());
    System.out.println(delPiero.toString());
    

  }
  

}
