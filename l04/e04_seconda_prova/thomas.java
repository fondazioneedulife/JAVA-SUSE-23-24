package l04.e04_seconda_prova;

import java.util.Scanner;

public class thomas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String what;
        boolean saved = false;

        System.out.println("Un Troll nei sotterranei(Io ve l’ho detto ...uh!)");
        System.out.println("Cosa fai?");
        what = sc.nextLine();

        if(what.equals("Vingardium Leviosa")){
            saved();
            saved = true;
        }
        else{
            System.out.println("Non succede nulla, il troll ti fissa incuriosito");
            System.out.println("Cosa fai?");
            what = sc.nextLine();

            if(what.equals("Vingardium Leviosa") || saved){
                saved();
                saved = true;
            }
            else{
                System.out.println("Non succede nulla, il troll emette un verso tremendo!");
                System.out.println("Cosa fai?");
                what = sc.nextLine();

                if(what.equals("Vingardium Leviosa") || saved){
                    saved();
                    saved = true;
                }
                else{
                    System.out.println("Splat! il troll ti ha spalmato sulla parete");
                }
            }
        }
    }

    static void saved(){
        System.out.println("Sei salvo!");
    }
}
