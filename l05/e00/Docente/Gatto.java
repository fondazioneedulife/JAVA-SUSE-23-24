package l05.e00.Docente;

public class Gatto {
    String nome;
    public Gatto(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    public String faiVerso(){
        return "Miao";
    }
    public void stampa(){
        System.out.println("Fai verso:"+faiVerso());
    }
    
}
