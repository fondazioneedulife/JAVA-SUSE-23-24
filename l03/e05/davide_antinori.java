import java.util.Scanner;
public class davide_antinori {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int zampe_gallina = 2;
    int zampe_ippogrifo = 4;
    int zampe_snaso = 4;
    int Schiopodo = 8;
    System.out.println("Numero animali?");
    int numero_di_animali = sc.nextInt();
    System.out.println("Quale animale?\n1=gallina\n2=ippogrifo\n3=snaso\n4=schiopodo");
    int animale = sc.nextInt();
    switch (animale) {
        case 1:
            animale = 2;
            break;
        case 2:
            animale = 4;
        case 3:
            animale = 4;
        case 4:
            animale = 4;
        default:
            break;
    }
    System.err.println(funzione(numero_di_animali, animale));
    }
    

    static int funzione(int b,int c) {
        int d = b * c;
        return d;
    }
}