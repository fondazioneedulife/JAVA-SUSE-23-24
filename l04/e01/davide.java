package l04.e01;
public class davide {

    public static void main(String[] args) {
        boolean uniforme = true;
        boolean studente = true;
        boolean insegnante = false;
        boolean preside = false;
        boolean fantasma = false;
        boolean ha_cane = false;

       // if (uniforme && studente){
         //   System.out.println("Puoi entrare(uniforme+studente)");
       // }
        if ((studente=true) && (insegnante=false) && (preside=false)) //|| ((studente=false) && (insegnante=true) && (preside=false)) || ((studente=false)&&(insegnante=false) && (preside=true))){
            {System.out.println("entri");
        } else {
            System.out.println("NON entri");
        }
        if (!(ha_cane)){
            System.out.println("Puoi entrare(NO cane)");
        } else {
            System.out.println("NON entri (hai cane)");
        }
    }
}