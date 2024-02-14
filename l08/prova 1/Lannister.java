import java.util.Scanner;
import java.util.HashMap;

public class Lannister {
  public static void main(String[] args) {
    int negSum = 0;
    int n, max;
    int[] array = new int[8];
    Scanner sc = new Scanner(System.in);
    int dex = 0;

    for (int i = 0; i < 8; i++) {
      n = sc.nextInt();
      
      if (n < 0) {
        negSum += n;
        n = 0;
      }
      array[i] = n;
    }

    n = sc.nextInt();
    max = n;

    for (int i = 0; i < 4; i++) {
      n = sc.nextInt();
      if (n > max) {
        max = n;
      }
    }

    for (int i = 0; i < 10; i++) {
      n = sc.nextInt();
      if (n > max) {
        max = n;
      }
    }

    int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean even = true;
    for (int i = 0; i < 10; i += 2) {
      if (!(arr[i] % 2 == 0)) {
        even = false;
      }
    }
    System.out.println(even);


    int[] more = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
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

    System.out.println(dex);

    sc.close();
  }

}