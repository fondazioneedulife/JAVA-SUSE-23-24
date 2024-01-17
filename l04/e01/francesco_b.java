package l04.e01;
import java.util.Scanner;

public class francesco_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean uniforme = false;
        boolean studente = false;
        boolean insegnante = false;
        boolean preside = false;
        boolean fantasma = false;
        boolean cane = false;
        boolean puoiEntrareFlag = false;

        System.out.println("hai un uniforme?");
        uniforme = sc.nextBoolean();
        if(possoEntrare(uniforme, studente, insegnante, preside, fantasma, cane, puoiEntrareFlag)){
            System.out.println("puoi entrare");
            return;
        }
        
        System.out.println("sei uno studente?");
        studente = sc.nextBoolean();
        if(possoEntrare(uniforme, studente, insegnante, preside, fantasma, cane, puoiEntrareFlag)){
            System.out.println("puoi entrare");
            return;
        }
        
        System.out.println("sei un insegnate?");
        insegnante = sc.nextBoolean();
        if(possoEntrare(uniforme, studente, insegnante, preside, fantasma, cane, puoiEntrareFlag)){
            System.out.println("puoi entrare");
            return;
        }

        System.out.println("sei un preside?");
        preside = sc.nextBoolean();
        if(possoEntrare(uniforme, studente, insegnante, preside, fantasma, cane, puoiEntrareFlag)){
            System.out.println("puoi entrare");
            return;
        }

        System.out.println("sei un fantasma?");
        fantasma = sc.nextBoolean();
        if(possoEntrare(uniforme, studente, insegnante, preside, fantasma, cane, puoiEntrareFlag)){
            System.out.println("puoi entrare");
            return;
        }

        System.out.println("hai un cane");
        cane = sc.nextBoolean();
        if(possoEntrare(uniforme, studente, insegnante, preside, fantasma, cane, puoiEntrareFlag)){
            System.out.println("puoi entrare");
            return;
        }
    }

    private static boolean possoEntrare(boolean uniforme, boolean studente, boolean insegnante, boolean preside, boolean fantasma, boolean cane, boolean puoiEntrareFlag){
    if((uniforme & studente) || insegnante || preside || fantasma){  
        if(!cane){
                puoiEntrareFlag = true;
                return puoiEntrareFlag;
            }else{
                puoiEntrareFlag = false;
                return puoiEntrareFlag;}
        }else{
            puoiEntrareFlag = false;
            return puoiEntrareFlag;
       }
    }
}


