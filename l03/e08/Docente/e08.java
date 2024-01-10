package l03.e08.Docente;

import java.util.Scanner;

public class e08 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        String eta,nome;
        do{
            System.out.println("eta");
            eta=sc.nextLine();
            System.out.println("nome");
            nome=sc.nextLine();
            i++;
        }        
        while(i<3 &&( (Integer.parseInt(eta)>2 && Integer.parseInt(eta)<15) || nome.length()>5));
        if(i==3){
            System.out.println("venga, le mostro l'uscita");
        }
        else{
            System.out.println("Salute!");
        }
    }
}
