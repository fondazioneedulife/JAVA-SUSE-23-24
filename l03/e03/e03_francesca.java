package l03.e03;

import java.util.Scanner;

public class e03_francesca {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome");
        String nome = sc.nextLine();
        System.out.println("Cognome");
        String cognome = sc.nextLine();
        int genere;
        do{
            System.out.println("Sei maschio (0) o femmina (1)?");
            genere = sc.nextInt();
        }while(genere != 0 && genere != 1);
        sc.close();

        char inizialeNome = nome.toUpperCase().trim().charAt(0); 
        if(genere==0){
            switch(inizialeNome) {
                case 'A':
                    System.out.println("Aberforth");
                    break;
                case 'B':
                    System.out.println("Bill");
                    break;
                case 'C':
                    System.out.println("Charlie");
                    break;
                case 'D':
                    System.out.println("Draco");
                    break;
                case 'E':
                    System.out.println("Elphias");
                    break;
                case 'F':
                    System.out.println("Fred");
                    break;
                case 'G':
                    System.out.println("George");
                    break;
                case 'H':
                    System.out.println("Harry");
                    break;
                case 'I':
                    System.out.println("Ignotus");
                    break;
                case 'L':
                    System.out.println("Lee");
                    break;
                case 'M':
                    System.out.println("Malocchio");
                    break;
                case 'N':
                    System.out.println("Neville");
                    break;
                case 'O':
                    System.out.println("Oliver");
                    break;
                case 'P':
                    System.out.println("Percy");
                    break;
                case 'Q':
                    System.out.println("Quirinius");
                    break;
                case 'R':
                    System.out.println("Remus");
                    break;
                case 'S':
                    System.out.println("Sirius");
                    break;
                case 'T':
                    System.out.println("Tom");
                    break;
                case 'U':
                    System.out.println("Unci");
                    break;
                case 'V':
                    System.out.println("Viktor");
                    break;
                case 'Z':
                    System.out.println("Zacharias");
                    break;
            }
            
        }
        else {
            switch(inizialeNome) {
                case 'A':
                    System.out.println("Astoria");
                    break;
                case 'B':
                    System.out.println("Bellatrix");
                    break;
                case 'C':
                    System.out.println("Cho");
                    break;
                case 'D':
                    System.out.println("Dolores");
                    break;
                case 'E':
                    System.out.println("Eileen");
                    break;
                case 'F':
                    System.out.println("Fleur");
                    break;
                case 'G':
                    System.out.println("Ginny");
                    break;
                case 'H':
                    System.out.println("Hermione");
                    break;
                case 'I':
                    System.out.println("Irma");
                    break;
                case 'L':
                    System.out.println("Luna");
                    break;
                case 'M':
                    System.out.println("Mirtilla");
                    break;
                case 'N':
                    System.out.println("Narcissa");
                    break;
                case 'O':
                    System.out.println("Olympe");
                    break;
                case 'P':
                    System.out.println("Pomona");
                    break;
                case 'Q':
                    System.out.println("Queenie");
                    break;
                case 'R':
                    System.out.println("Rita");
                    break;
                case 'S':
                    System.out.println("Sibilla");
                    break;
                case 'T':
                    System.out.println("Tosca");
                    break;
                case 'U':
                    System.out.println("Unci");
                    break;
                case 'V':
                    System.out.println("Victoire");
                    break;
                case 'Z':
                    System.out.println("Zacharias");
                    break;
            }
            
        }
        char inizialeCognome = cognome.toUpperCase().trim().charAt(0); 
        switch(inizialeCognome) {
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
        }
        
        
    }
}
