package l06.e03.docente;

public class Soluzione {
    public static void main(String[] args) {
        Cane cane1 = new Cane(2021);
        Negozio negozio = new Negozio(cane1);
        if(negozio.adotta() instanceof Cane){
            System.out.println("L'animale è nato nel "+((Cane)negozio.adotta()).annoNascita());
        }
    }
}
