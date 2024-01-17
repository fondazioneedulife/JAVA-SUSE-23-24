package l04.e05_terza_prova.pietrofornale;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class ex3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int a;
    int finale = 0;
    
    System.out.println("Num:");
    int num = sc.nextInt();
    
    for (int i = 0; i < 6; i++) {
      series(Math.pow(2, i));
      System.out.println("Compare:" + num);
      if (sc.nextInt() == 1) {
        finale += Math.pow(2, i);
      }
    }

    System.out.println(num);  
  }

  private static void series(double ser) {
    ser = Math.round(ser);
    int count = 1;
    int check = -1;
    int max = 62;

      for (int j = 0; j < max; j++) {
        if (check > 0) {
          System.out.print(j + " ");
        }
        if (count == ser) {
          count = 0;
          check *= -1;
        }
        count++;
      }
    
  }
  
  

}
