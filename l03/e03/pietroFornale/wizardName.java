package l03.e03.pietrofornale;
import java.util.Scanner;

public class wizardName {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What's your first name?");
    String fName = sc.nextLine();

    System.out.println("What's your last name?");
    String lName = sc.nextLine();

    System.out.println("What's your gender?\n0. Female\n1. Male");
    int gender = sc.nextInt();

    sc.close();

    char initial = fName.toUpperCase().trim().charAt(0); 

    switch(initial) {
      case 'A':
        String[] a = {"Astoria", "Aberforth"};
        System.out.println(a[gender]);
        break;
      case 'B':
        String[] b = {"Bellatrix", "Bill"};
        System.out.println(b[gender]);
        break;
      case 'C':
        String[] c = {"Cho", "Charlie"};
        System.out.println(c[gender]);
        break;
      case 'D':
        String[] d = {"Dolores", "Draco"};
        System.out.println(d[gender]);
        break;
      case 'E':
        String[] e = {"Eileen", "Elphias"};
        System.out.println(e[gender]);
        break;
      case 'F':
        String[] f = {"Fleur", "Fred"};
        System.out.println(f[gender]);
        break;
      case 'G':
        String[] g = {"Ginny", "George"};
        System.out.println(g[gender]);
        break;
      case 'H':
        String[] h = {"Hermione", "Harry"};
        System.out.println(h[gender]);
        break;
      case 'I':
        String[] i = {"Irma", "Ignotus"};
        System.out.println(i[gender]);
        break;
      case 'L':
        String[] l = {"Luna", "Lee"};
        System.out.println(l[gender]);
        break;
      case 'M':
        String[] m = {"Mirtilla", "Malocchio"};
        System.out.println(m[gender]);
        break;
      case 'N':
        String[] n = {"Narcissa", "Neville"};
        System.out.println(n[gender]);
        break;
      case 'O':
        String[] o = {"Olympe", "Oliver"};
        System.out.println(o[gender]);
        break;
      case 'P':
        String[] p = {"Pomona", "Percy"};
        System.out.println(p[gender]);
        break;
      case 'Q':
        String[] q = {"Queenie", "Quirinius"};
        System.out.println(q[gender]);
        break;
      case 'R':
        String[] r = {"Rita", "Remus"};
        System.out.println(r[gender]);
        break;
      case 'S':
        String[] s = {"Sibilla", "Sirius"};
        System.out.println(s[gender]);
        break;
      case 'T':
        String[] t = {"Tosca", "Tom"};
        System.out.println(t[gender]);
        break;
      case 'U':
        String[] u = {"Unci", "Unci"};
        System.out.println(u[gender]);
        break;
      case 'V':
        String[] v = {"Victoire", "Viktor"};
        System.out.println(v[gender]);
        break;
      case 'Z':
        String[] z = {"Zacharias", "Zacharias"};
        System.out.println(z[gender]);
        break; 
      default:
        System.out.println("Unlucky");

    }

    initial = lName.toUpperCase().trim().charAt(0);

    switch(initial) {
      case 'A':
        System.out.println("Abbott");
        break;
      case 'B':
        System.out.println("Baston");
        break;
      case 'C':
        System.out.println("Crouch");
        break;
      case 'D':
        System.out.println("Dursley");
        break;
      case 'E':
        System.out.println("Evans");
        break;
      case 'F':
        System.out.println("Finnigan");
        break;
      case 'G':
        System.out.println("Granger");
        break;
      case 'H':
        System.out.println("Hagrid");
        break;
      case 'I':
        System.out.println("Ippogrifo");
        break;
      case 'L':
        System.out.println("Lovegood");
        break;
      case 'M':
        System.out.println("McGranitt");
        break;
      case 'N':
        System.out.println("Nott");
        break;
      case 'O':
        System.out.println("Olivander");
        break;
      case 'P':
        System.out.println("Potter");
        break;
      case 'Q':
        System.out.println("Quirrell");
        break;
      case 'R':
        System.out.println("Raptor");
        break;
      case 'S':
        System.out.println("Skeeter");
        break;
      case 'T':
        System.out.println("Thomas");
        break;
      case 'U':
        System.out.println("Umbridge");
        break;
      case 'V':
        System.out.println("Vitious");
        break;
      case 'Z':
        System.out.println("Zabini");
        break; 
      default:
        System.out.println("Dude");

    }
  }
  
}

