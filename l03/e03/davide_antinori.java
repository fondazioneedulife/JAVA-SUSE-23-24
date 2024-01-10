import java.util.Scanner;
public class davide_antinori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome?");
        String nome = sc.nextLine();
        System.out.println("Cognome?");
        String cognome = sc.nextLine();
        System.out.println("Uomo o donna?\n0 uomo | 1 donna");
        int gender = sc.nextInt();
        nome = nome.toLowerCase();
        cognome = cognome.toLowerCase();
        char result_nome = nome.charAt(0);
        char result_cognome = cognome.charAt(0);

        if (gender == 0) {
            switch (result_nome) {
                case 'a':
                    System.out.println("Aberforth");
                    break;           
                case 'b':
                    System.out.println("Bill");
                    break;
                case 'c':
                    System.out.println("Charlie");
                    break;
                case 'd':
                    System.out.println("Draco");
                    break;
                case 'e':
                    System.out.println("Elphias");
                    break;
                case 'f':
                    System.out.println("Fred");
                    break;
                case 'g':
                    System.out.println("George");
                    break;
                case 'h':
                    System.out.println("Harry");
                    break;
                case 'i':
                    System.out.println("Ignotus");
                    break;
                case 'l':
                    System.out.println("Lee");
                    break;
                case 'm':
                    System.out.println("Malocchio");
                    break;
                case 'n':
                    System.out.println("Neville");
                    break;
                case 'o':
                    System.out.println("Oliver");
                    break;
                case 'p':
                    System.out.println("Percy");
                    break;
                case 'q':
                    System.out.println("Quinnius");
                    break;
                case 'r':
                    System.out.println("Remus");
                    break;
                case 's':
                    System.out.println("Sirius");
                    break;
                case 't':
                    System.out.println("Tom");
                    break;
                case 'u':
                    System.out.println("Unci");
                    break;
            }
        } else {
                switch (result_nome) {
                case 'a':
                    System.out.println("Aberforth");
                    break;           
                case 'b':
                    System.out.println("Bill");
                    break;
                case 'c':
                    System.out.println("Charlie");
                    break;
                case 'd':
                    System.out.println("Draco");
                    break;
                case 'e':
                    System.out.println("Elphias");
                    break;
                case 'f':
                    System.out.println("Fred");
                    break;
                case 'g':
                    System.out.println("George");
                    break;
                case 'h':
                    System.out.println("Harry");
                    break;
                case 'i':
                    System.out.println("Ignotus");
                    break;
                case 'l':
                    System.out.println("Lee");
                    break;
                case 'm':
                    System.out.println("Malocchio");
                    break;
                case 'n':
                    System.out.println("Neville");
                    break;
                case 'o':
                    System.out.println("Oliver");
                    break;
                case 'p':
                    System.out.println("Percy");
                    break;
                case 'q':
                    System.out.println("Quinnius");
                    break;
                case 'r':
                    System.out.println("Remus");
                    break;
                case 's':
                    System.out.println("Sirius");
                    break;
                case 't':
                    System.out.println("Tom");
                    break;
                case 'u':
                    System.out.println("Unci");
                    break;
        }
    }
}
}