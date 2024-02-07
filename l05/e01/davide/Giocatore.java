package l05.e01.davide;

public class Giocatore {
    private String nome;
    private boolean capitano;
    private int goal;
    private int goalNazionale;

    public Giocatore(){
        this.nome = "";
        this.capitano = false;
        this.goal = 0;
        this.goalNazionale = 0;
    }

    public Giocatore(String nome, boolean capitano, int goal, int goalNazionale){
        this.nome = nome;
        this.capitano = capitano;
        this.goal = goal;
        this.goalNazionale = goalNazionale;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setGoal(int goal){
        this.goal = goal;
    }

    public int getGoal(){
        return goal;
    }

    public void setGoalNazionale(int goalNazionale){
        this.goalNazionale = goalNazionale;
    }

    public int getGoalNazionale(){
        return goalNazionale;
    }
    public boolean isCapitano(){
        return capitano;
    }

    public void setCapitano(boolean capitano){
        this.capitano = capitano;
    }

    public int calcolaGoalTotali(){
        return goal + goalNazionale;
    }
    
    @Override
    public String toString(){
        return "Giocatore = " + nome + "\n" + "Numero goal: " + goal + "\n" + "Capitano: " + capitano + "\n" + "Goal in Nazionale: " + goalNazionale;
    }
}
