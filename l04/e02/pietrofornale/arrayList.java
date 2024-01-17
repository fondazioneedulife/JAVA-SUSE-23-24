package l04.e02.pietrofornale;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<String>();
    String namesStr =  "DAVIDE GIANMARCO FRANCESCO GIACOMO THOMAS ANDREA GIACOMO FRANCESCO PIETRO PIETRO RENZO JUNIOR FRANCESCA ELIA MATTIA PIETRO LEONE ALESSANDRO DESTINY MATTEO ALESSANDRO MARIO SIMONE UBALDO PAOLO CHEIKH EMMANUELE DAVIDE DIEGO";

    String[] array = namesStr.split(" ");
    for (int i = 0; i < array.length; i++) {
      names.add(array[i]);
    }

    System.out.println("Class has " + names.size() + " students");



    System.out.println(names);
  }

  private static ArrayList<String> assignHouses(ArrayList<String> n, int len) {


    for (int i = 0; i < len)

  }

}
