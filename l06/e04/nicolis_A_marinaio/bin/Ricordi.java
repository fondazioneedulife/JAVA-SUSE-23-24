package l06.e04.nicolis_A_marinaio.bin;


public class Ricordi implements Dettagli {
    private String main;
    private String enemy;
    private String work;
    private String event;
    private String act;

    public Ricordi(String main, String enemy, String work, String event, String act) {
        this.main = main;
        this.enemy = enemy;
        this.work = work;
        this.event = event;
        this.act = act;
    }

    public Ricordi() {
        this.main = "Paolo";
        this.enemy = "Pietro";
        this.work = "un abile marinaio";
        this.event = enemy;
        this.act = main;
    }

    

    
}
