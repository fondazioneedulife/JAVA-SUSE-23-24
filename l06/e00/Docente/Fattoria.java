package l06.e00.Docente;

public class Fattoria {
    private Cane snoopy;
    private Gatto micio;
    private Animale[] pets;
    Fattoria(){
        snoopy = new Cane("Snoopy", true);
        micio = new Gatto("Ernesto");
        pets = new Animale[2];
        pets[0] = snoopy;
        pets[1]= micio;
    }
    public void concerto(){
        for (Animale a : pets){
            System.out.println(a.faiVerso());
        }
    }
}
