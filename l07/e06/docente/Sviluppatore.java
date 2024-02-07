package l07.e06.docente;

public class Sviluppatore extends Dipendente{
    String favLanguage;
    
    public Sviluppatore(String a, int b, String c){
        super(a,b);
        this.favLanguage = c;
    }

    @Override
    public String toString(){
        return this.getNome()+" "+this.dataAssunzione+" "+this.favLanguage;
    }

    
}
