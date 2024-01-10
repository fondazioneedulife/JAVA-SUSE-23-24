package l03.e02.pietroFornale;

import java.util.Scanner;

public class scanNameAge {
  
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("What's your name?");
    String name = sc.nextLine();
    System.out.println("Welcome " + name + ", what can I do for you? When were you born?");

    int bYear = sc.nextInt();

    int age = 2024 - bYear;

    System.out.println("You're " + (age) + " years old");

    if (age < 17) {
      System.out.println("Remember child, you're forbidden to do magic outside of Hogwards");
    }
    else {
      System.out.println("I'm at your service");
    }
  }
}
