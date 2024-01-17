package l04.e03_prima_prova.pietrofornale;

import java.util.Scanner;

public class ex1 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Che voto hai preso? ");
    int voto = sc.nextInt();

    switch(voto) {
      case 10:
        System.out.println("Eccezionale");
        break;
      case 9:
        System.out.println("Oltre ogni previsione");
        break;
      case 8:
        System.out.println("Oltre ogni previsione");
        break;
      case 7:
        System.out.println("Accettabile");
        break;
      case 6:
        System.out.println("Accettabile");
        break;
      case 5:
        System.out.println("Scadente");
        break;
        case 4:
        System.out.println("Scadente");
        break;
        case 3:
        System.out.println("Desolante");
        break;
        case 2:
        System.out.println("Troll");
        break;
        case 1:
        System.out.println("Troll");
        break;
        case 0:
        System.out.println("Troll");
        break;


      default:
        // code block
    }
  }
  
  
}
