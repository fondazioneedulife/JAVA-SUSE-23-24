package l02.e02.altro;
import java.util.Scanner;

public class torredellamorte{
    public static void main(String[] args){
        function1();
    }
    static void function1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Componi numero di telefono della persona");
        System.out.println("E' in casa? 1 = si 2 = no");
        int n = sc.nextInt();
        if (n==2){
            System.out.println("Lascia un messaggio");
            System.out.println("Aspetta di essere richiamato");
            n = 1;
        }
        if (n==1){
            System.out.println("Ti va di mangiare qualcosa insieme?");
            System.out.println("Ascolta la risposta; 1 = si 2 = no");
            n = sc.nextInt();
            if (n==1){
                System.out.println("Mangiate qualcosa insieme");
                finale();
            } else {
                function2();
            }
        }
    }
    static void function2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("E di bere qualcosa di caldo? 1 = si 2 = no");
        int a = sc.nextInt();
        if (a == 1){
            System.out.println("Scegli: Tè(0), caffè(1), cioccolata(2)");
            int b = sc.nextInt();
            if (b == 0){
                System.out.println("Fatevi 'sto tè");
                finale();
            } else if (b == 1){
                System.out.println("Fatevi 'sto caffè");
                finale();
            } else {
                System.out.println("Fatevi 'sta cioccolata");
                finale();
            }
        } else {
            function3();
        }
    }
    static void function3(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a;
        System.out.println("Allora svaghiamoci un po'...");
        do {
            System.out.println("...cos'altro ti va di fare?");
            System.out.println("E' una cosa che va di fare anche a me? 1 = si 2 = no");
            a = sc.nextInt();
            n = n+1; 
        } while (a == 2 && n<6);

        if (n>=5){
        System.out.println("Scegli fra tutte le opzioni quella che ti appare meno disumana");
        System.out.println("Fattela piacere");
        } else {
        System.out.println("E facciamolo insieme, dai...");
        }

        System.out.println("Svagatevi un po' insieme");
        finale();
    }
    static void finale(){
        System.out.println("Siete diventati amici! Ora hai una persona in più a cui poter rompere le palle in caso di bisogno e viceversa.");
    }
}