package l05.e00.Docente;

public class esercizio {
    public static void main(String[] args){
        Gatto oggetto = new Gatto("Pallino");
        oggetto.stampa();
        System.out.println("Il gatto si chiama "+ oggetto.getNome());
    }
}
