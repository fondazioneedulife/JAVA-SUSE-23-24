package l06.e00.Docente;

public class Gatto extends Animale {
    public Gatto(String unNome){
        super(unNome);
    }
    public String faiVerso(){
        return "Miao";
    }
    public void stampa(){
        System.out.println("Fai verso: "+faiVerso());
    }
}
