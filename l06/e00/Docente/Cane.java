package l06.e00.Docente;

public class Cane {
    private String nomeCane;
    public Cane(){

    }
    public Cane(String nome){
        this.nomeCane = nome;
    }
    public String getNomeCaneSub() {
        return nomeCane.substring(
            0,2);
    }
    public String getNomeCane(){
        return nomeCane;
    }
    public void setNomeCane(String nome){
        this.nomeCane=nome;
    }
}
