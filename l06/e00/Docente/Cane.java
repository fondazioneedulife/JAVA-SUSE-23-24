package l06.e00.Docente;

public class Cane extends Animale{

    boolean abbaia;
    
    public Cane( String unNome, boolean staAbbaiando){
      super(unNome);
      this.abbaia = staAbbaiando;
    }
    public void eccitato(){
        abbaia=true;
    }
    public void quieto(){
        abbaia = false;
    }
    public String faiVerso(){
        if(abbaia)
            return "Bau!";
        else
            return "...";
    }
    public void stampa(){
        System.out.println(this.toString());
        System.out.println("fai verso:");
        System.out.println("Sta abbaiando:"+this.abbaia);
    }
}
