package l03.e03.Docente;
import java.util.Scanner;
public class e03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome");
        String nome = sc.nextLine();
        System.out.println("Cognome");
        String cognome = sc.nextLine();
        System.out.println("maschio (0) o femmina (1)?");
        int sesso = sc.nextInt();
        sc.close();
        
        char inizialeNome = nome.toUpperCase().trim().charAt(0); 
        if(sesso==0){

            switch(inizialeNome){
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
            }
        }
        else {

            switch(inizialeNome){
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
            }
        }
        char inizialeCognome = cognome.toUpperCase().trim().charAt(0); 
        switch(inizialeCognome){
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
        }
    }
}
