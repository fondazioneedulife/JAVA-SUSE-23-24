package l05.e01.thomasEs01;

public class giocatore{
    private String nome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;

    public giocatore(){
        this.nome = "";
        this.capitano = false;
        this.goal = 0;
        this.goalNazionale = 0;
    }

    public giocatore(String nome, boolean capitano, int goal,
    int goalNazionale){
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public boolean isCapitano(){
        return this.capitano;
    }

    public void setCapitano(boolean capitano){
        this.capitano = capitano;
    }

    public int getGoal(){
        return goal;
    }

    public void setGoal(int goal){
        this.goal = goal;
    }

    public int getGoalNazionale(){
        return goalNazionale;
    }

    public void setGoalNazionale(int goalNazionale){
        this.goalNazionale = goalNazionale;
    }

    public int calcolaGoalTotali(int goal, int goalNazionale){
        int tot;
        tot = goal + goalNazionale;
        return tot;
    }

    @Override
    public String toString(){
        String dati;
        dati = " Nome: " + nome + " Capitano: " + capitano + " Goal: " + goal + 
        " Goal in nazionale: " + goalNazionale; 
        return dati;
    }
}