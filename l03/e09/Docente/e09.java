package l03.e09.Docente;

public class e09 {
    public static void main(String args[]){
        boolean uniforme = true;
        boolean studente = true;
        boolean insegnante = false;
        boolean preside = false;
        boolean fantasma = false;
        boolean cane = false;
        boolean check = (((uniforme &&studente)&&(studente ||insegnante||preside))||fantasma)&&!cane;
        String ans = check? "puoi entrare":"non puoi entrare";
        System.out.println(ans);
    }
}
