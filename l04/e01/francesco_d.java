package l04.e01;

public class francesco_d {
    public static void main(String[] args) {
        
        boolean uniforme = true;
        boolean studente = true;
        boolean professore = false;
        boolean preside = false;
        boolean fantasma = false;
        boolean cane = true;

        System.out.println("Possiedi il cane");
        if (entro(uniforme, studente, professore, preside, fantasma, cane)) {
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }
        cane = false;
        System.out.println("Nono possiedi il cane");
        if (entro(uniforme, studente, professore, preside, fantasma, cane)) {
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }
    
    }

private static boolean entro(boolean uniforme, boolean studente, boolean professore, boolean preside, boolean fantasma, boolean cane) {
            // (((uniforme AND studente) AND (studente OR professore OR preside)) OR fantasma ) AND NOT(cane)
    return ((uniforme && studente) ||  professore || preside || fantasma ) && !(cane);
        
    }
}
