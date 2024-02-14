package l08.prova06.Docente;

public class Studente extends Mago{
    private int annoDiIscrizione;
    private String casa;
    public String getAnno() {
        return "Stai frequentando il "+(2024-annoDiIscrizione)+ " anno.";
    }
    public void setCasa(String a){
        this.casa = a;
    }
}
