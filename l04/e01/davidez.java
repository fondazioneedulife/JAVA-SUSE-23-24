package l04.e01;

public class davidez {
    public static void main(String[] args) {
        boolean uniforme = true;
        boolean studente = true;
        boolean insegnante = false;
        boolean preside = false;
        boolean fantasma = false;
        boolean cane = true;

        System.out.println("Hai il cane");

        if(entro(uniforme, studente, insegnante, preside, fantasma, cane)){
            System.out.println("Puoi entrare");
        }
        else{
            System.out.println("Non puoi entrare");
        }
        cane = false;
        System.out.println("Non hai il cane");
        if(entro(uniforme, studente, insegnante, preside, fantasma, cane)){
            System.out.println("Puoi entrare");
        }
        else{
            System.out.println("Non puoi entrare");
    }
}
private static boolean entro(boolean uniforme, boolean studente, boolean insegnante, boolean preside, boolean fantasma, boolean cane){
    return((uniforme && studente) || insegnante || preside || fantasma) && !(cane);

}

}