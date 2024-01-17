package l04.e04_seconda_prova.pietrofornale;

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  System.out.println("Un Troll nei sotterranei!\n(Io ve l’ho detto ...uh!)");
  
  System.out.println("Di una parola: ");
  
  String word = sc.nextLine();
  int count = 0;

  if (!word.equals("Vingardium Leviosa")) {
    System.out.println("Non succede nulla, il Troll ti fissa incuriosito");
    count++;
  }

  while (!(word.equals("Vingardium Leviosa")) && count < 3) {
    count++;
    System.out.println("Di una parola: ");
    word = sc.nextLine();

  }

  if (word.equals("Vingardium Leviosa")){
    System.out.println("Sei salvo");
  
  } else {
    System.out.println("Splat! Il Troll ti ha spalmato sulla parete");
  }
  }

  
  
}
