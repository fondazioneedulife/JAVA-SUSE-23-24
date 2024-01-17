package l04.e01;

public class severino {
    public static void main(String[] args){
        boolean uniforme = true;
        boolean studente = true;
        boolean insegnante = false;
        boolean preside = false;
        boolean fantasma = false;
        boolean cane = true;
        System.out.println("Con cane");
        if(possoEntrare(uniforme,studente,insegnante,preside,fantasma,cane)){
            System.out.println("Puoi entrare");
        }
        else{
            System.out.println("Non puoi entrare");
        }
        cane = false;
        System.out.println("Senza cane");
        if(possoEntrare(uniforme,studente,insegnante,preside,fantasma,cane)){
            System.out.println("Puoi entrare");
        }
        else{
            System.out.println("Non puoi entrare");
        }
    }
    private static boolean possoEntrare(boolean uniforme, boolean studente, boolean insegnante, boolean preside, boolean fantasma, boolean cane){
        // (((uniforme AND studente) AND (studente OR insegnante OR preside)) OR fantasma ) AND NOT(cane)
        return ((uniforme && studente) || insegnante || preside || fantasma ) && !(cane);
    }
}
