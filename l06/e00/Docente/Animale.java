package l06.e00.Docente;

public abstract class Animale {
    String nome;

    public Animale(String unNome){
        nome = unNome;
    }
    abstract String faiVerso();
    abstract void stampa();
}
