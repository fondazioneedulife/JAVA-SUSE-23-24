package l05.e01.pietrofornale;

public class Player {
  private String name;
  private boolean captain;
  private int clubGoals;
  private int natGoals;

  public Player() {
    this.name = "";
    this.captain = false;
    this.clubGoals = 0;
    this.natGoals = 0;
  }

  public Player(String name, boolean captain, int clubGoals, int natGoals) {
    this.name = name;
    this.captain = captain;
    this.clubGoals = clubGoals;
    this.natGoals = natGoals;
  }

  
  // Get
  public String getName() {
    return name;
  }

  public boolean getCaptain() {
    return captain;
  }

  public int getClubGoals() {
    return clubGoals;
  }

  public int getNatGoals() {
    return natGoals;
  }


  // Set
  public void setName(String name) {
    this.name = name;
  }

  public void setCaptain(boolean captain) {
    this.captain = captain;
  }

  public void setClubGoals(int clubGoals) {
    this.clubGoals = clubGoals;
  }

  public void setNatGoals(int natGoals) {
    this.natGoals = natGoals;
  }

  // Other

  public int getTotalGoals() {
    return clubGoals + natGoals;
  }

  public String toString() {
    return "Giocatore{" +
                "Name =' " + name + '\'' +
                ", Captain = " + captain +
                ", Club Goals = " + clubGoals +
                ", National Goals = " + natGoals +
                '}';
    }

}
