package l08.prova01;
import java.util.Scanner;
import java.util.HashMap;

public class Lannister {
  public static void main(String[] args) {
    int negSum = 0;
    int n, max;
    int[] array = new int[8];
    Scanner sc = new Scanner(System.in);
    int dex = 0;

    System.out.println("Inserire 8 numeri:");
    for (int i = 0; i < 8; i++) {
      n = sc.nextInt();
      
      if (n < 0) {
        negSum += n;
        n = 0;
      }
      array[i] = n;
    }

    for (int i : array) {
      System.out.print(i + " ");
    }
    System.out.println("\nNeg Sum = " + negSum);
    
    System.out.println("Inserire 10 numeri:");
    n = sc.nextInt();
    max = n;
    int maxi = 0;
    
    for (int i = 1; i < 10; i++) {
      n = sc.nextInt();
      if (n > max) {
        max = n;
        maxi = i;
      }
    }
    System.out.println("Max: " + max + ", Max Index: " + maxi);

    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean even = true;

    for (int i = 0; i < 10; i += 2) {
      if (!(arr[i] % 2 == 0)) {
        even = false;
      }
    }
    System.out.println("Tutti pari: " + even);


    int[] more = {0, 0, 2, 3, 4, 5, 6, 7, 8, 9};
    HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();

    for (int i = 0; i < 10; i++) {
      int count = 0;
      if (nums.containsKey(more[i])) {
        count = nums.get(more[i]);
      }
      nums.put(more[i], count + 1);
    }

    int m = 0;


    for (int i : nums.keySet()) {
      if (nums.get(i) > m) {
        m = nums.get(i);
        dex = i;
      }
    }

    System.out.println("Numero che compare di piu: " + dex);

    sc.close();
  }

}