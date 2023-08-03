package SportsDay;
import java.util.Arrays;

public class Team {
  private int TeamNum = 0;
  private String TeamName;
  private Athlete[] TeamMember;
  private double[] LapTime44;
  private double Result44;
  private double[] LapTime41;
  private double Result41;
  private static int TeamCounter = 0;

  public Team(String TeamName) {
    this.TeamName = TeamName;
    this.TeamNum++;
    TeamCounter++;
  }

  public int getTeamCounter() {
    return TeamCounter;
  }

  public int length() {
    return this.TeamMember.length;
  }

  public int getTeamNum() {
    return this.TeamNum;
  }

  public void setTeamName(String TeamName) {
    this.TeamName = TeamName;
  }

  public String getTeamName() {
    return this.TeamName;
  }

  public void setTeamMembers(Athlete[] teamMember) {
    this.TeamMember = teamMember;
  }

  public Athlete[] getTeamMember() {
    return this.TeamMember;
  }

  public String toString() {
    return this.TeamName;
  }

  public void getTeamDetails() {
    System.out.println("Team Name: " + this.TeamName);
    System.out.println("Members: ");
    for (int i = 0; i < TeamMember.length; i++) {
      System.out.println("Runner" + (i + 1) + " : " + this.TeamMember[i]);
    }
  }

  public void setLapTime44() {
    this.LapTime44 = new double[this.TeamMember.length];
    for (int i = 0; i < this.TeamMember.length; i++) {
      this.LapTime44[i] = this.TeamMember[i].getResult400();
    }
  }

  public String getLapTime44() {
    return Arrays.toString(this.LapTime44);
  }

  public double getResult44() {
    double result44 = 0;
    for (int i = 0; i < this.TeamMember.length; i++) {
      result44 += this.TeamMember[i].getResult400();
    }
    return result44;
  }

  public void setLapTime41() {
    this.LapTime41 = new double[this.TeamMember.length];
    for (int i = 0; i < this.TeamMember.length; i++) {
      this.LapTime41[i] = this.TeamMember[i].getResult100();
    }
  }

  public String getLapTime41() {
    return Arrays.toString(this.LapTime41);
  }

  public double getResult41() {
    double result41 = 0;
    for (int i = 0; i < this.TeamMember.length; i++) {
      result41 += this.TeamMember[i].getResult100();
    }
    return result41;
  }

  public Team changeTeamMembers(int index, Athlete athlete) {
    if (this.contains(this.TeamMember, athlete)) {
      System.out.println(athlete.getName() + " has been in the team already.");
    } else {
      String name = this.TeamMember[index].getName();
      this.TeamMember[index] = athlete;
      System.out.println("Your Team Member has been changed from " + name + " to " + athlete.getName());
    }
    return this;
  }

  public boolean contains(Athlete[] teamMember, Athlete athlete) {
    for (int i = 0; i < teamMember.length; i++) {
      if (teamMember[i].equals(athlete)) {
        return true;
      }
    }
    return false;
  }

}
