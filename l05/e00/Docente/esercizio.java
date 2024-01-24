package l05.e00.Docente;

public class esercizio {
    public static void main(String[] args){
        Gatto gatto = new Gatto("Pallino");
        gatto.stampa();
        System.out.println("Il gatto si chiama "+gatto.getNome());
    }
}
