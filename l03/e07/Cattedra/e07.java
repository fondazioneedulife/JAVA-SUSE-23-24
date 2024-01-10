package l03.e07.Cattedra;
/*
Se piove e fanno meno di 10 gradi sarà meglio
rimanere a letto a dormire.
Se piove o fa meno di 10 gradi e
contemporaneamente non accadono entrambe le
cose andare a piedi con l’ombrello.
Se non piove e se fanno più di dieci gradi suggerire di
prendere la scopa
 */

public class e07 {
    public static void main(String[] args){
        System.out.println("ciao");
        boolean piove = false;
        boolean fa_freddo = false;
        if (piove == true && fa_freddo == true ){
            System.out.println("stiamo a letto");

        }
            else if ((piove || fa_freddo) && !(piove && fa_freddo)){
                System.out.println("andiamo a piedo con l'ombrello");
            
            }
            else if (!(piove && fa_freddo)){
                System.out.println("prendiamo la scopa");
            }
    }
}
