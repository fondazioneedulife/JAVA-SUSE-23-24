package l04.e04_seconda_prova;

import java.util.Scanner;
public class francesco_d {
    public static void main(String[] args) {
        
  //Stampiamo “Un Troll nei sotterranei! (Io ve l’ho detto ...uh!)” e ci chiede  di inserire una parola (che dovrebbe essere  “Vingardium Leviosa”). Se sbagliamo il programma  dovrà scrivere “Non succede nulla, il Troll ti fissa incuriosito” e dovrà chiederci  nuovamente la parola; se sbaglieremo ancora dovrà scrivere “Non succede nulla, il Troll emette un verso tremendo!” e dovrà richiederci la parola.  Se sbagliamo per la terza volta scriverà “Splat! Il Troll ti ha spalmato sulla parete” e poi il programma deve finire. Se in qualsiasi momento inseriamo la parola “Vingardium Leviosa” il programma deve stampare “Sei salvo!” e deve terminare.

          Scanner sc = new Scanner(System.in);
          System.out.println("Inserisci una parola");
          String parola = sc.next();
        if (parola.equals("Vingardium Leviosa")) {
            System.out.println("Sei salvo!");
            sc.close();
            return;
        } else {
            System.out.println("Non succede nulla, il Troll ti fissa incuriosito");
            
        } 

        }
    }

}
      
