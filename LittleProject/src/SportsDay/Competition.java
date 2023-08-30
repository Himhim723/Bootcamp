package SportsDay;
import java.util.Arrays;

import SportsDay.Athlete.Event;

public class Competition {
  private Athlete[] Athletes;
  private Team[] Teams;
  private Team[] Team44Result;
  private Team[] Team41Result;
  private Athlete[] Individual400Rank;
  private Athlete[] Individual100Rank;

  public Competition() {

  }

  /**
   * At the moment, Numbers of Athletes are not allowed to be changed
   * so this method can be used once only
   * 
   * @return All participants joing Team Events are recorded in the data bank of comp
   */
  public Athlete[] setParticipants() {
    System.out.println("Participant:");
    int count = 0;
    for (int i = 0; i < Teams.length; i++) {
      count += this.Teams[i].length();
    }
    this.Athletes = new Athlete[count];
    int index = 0;
    for (int i = 0; i < Teams.length; i++) {
      for (int k = 0; k < Teams[i].length(); k++) {
        Athletes[index] = Teams[i].getTeamMember()[k];
        System.out.println("Comp No." + (index + 1) + ": " + Teams[i].getTeamMember()[k]
            + "  \thas successfully enrolled in the competition.");
        index++;
      }
    }
    System.out.println();
    return Athletes;
  }

  /***
   * same as above, no addTeam method at the moment
   * adding the team data into the data bank
   * 
   * @param teams Recording All Teams participanting in the game
   */
  public void setTeams(Team[] teams) {
    this.Teams = new Team[teams.length];
    for (int i = 0; i < teams.length; i++) {
      this.Teams[i] = teams[i];
    }
  }

  /***
   * for getting the names of teams participanting in the game
   * 
   * @return
   */
  public Team[] getTeams() {
    return this.Teams;
  }

  //試驗中 可否根據不同項目選用不同 getResult 既 Method
  public Athlete[] RankingSystem(Event event){
    Athlete[] Rank  = Arrays.copyOf(Athletes, Athletes.length);
    for (int i = 0; i < Athletes.length; i++) {
      for (int k = i + 1; k < Athletes.length; k++) {
        if (Rank[i].getResult(event) > Rank[k].getResult(event)) {
          Athlete temp = Rank[i];
          Rank[i] = Rank[k];
          Rank[k] = temp;  
        }
      }
    }
    return Rank;
  }

  /***
   * calculate the result of participants and arrange the ranking in ascending
   * order
   * 
   * @return Ranking of the event 400m
   */
  // public Athlete[] getIndividual400Rank() {
  //   this.Individual400Rank = Arrays.copyOf(Athletes, Athletes.length);
  //   for (int i = 0; i < Athletes.length; i++) {
  //     for (int k = i + 1; k < Athletes.length; k++) {
  //       if (Individual400Rank[i].getResult400() > Individual400Rank[k].getResult400()) {
  //         Athlete temp = Individual400Rank[i];
  //         Individual400Rank[i] = Individual400Rank[k];
  //         Individual400Rank[k] = temp;
  //       }
  //     }
  //   }
  //   int rank = 1;
  //   System.out.println("Event 001: 400m Individual Result");
  //   for (Athlete a : this.Individual400Rank) {
  //     if (a.getResult400() == 0)
  //       continue;
  //     System.out.println("Rank " + (rank++) + ": " + a + "      \tResult: " + a.getResult400());
  //   }
  //   System.out.println();
  //   return this.Individual400Rank;
  // }

  /***
   * calculate the result of participants and arrange the ranking in ascending
   * order
   * 
   * @return Ranking of the event 100m
   */
  // public Athlete[] getIndividual100Rank() {
  //   this.Individual100Rank = Arrays.copyOf(Athletes, Athletes.length);
  //   for (int i = 0; i < Athletes.length; i++) {
  //     for (int k = i + 1; k < Athletes.length; k++) {
  //       if (Individual100Rank[i].getResult100() > Individual100Rank[k].getResult100()) {
  //         Athlete temp = Individual100Rank[i];
  //         Individual100Rank[i] = Individual100Rank[k];
  //         Individual100Rank[k] = temp;
  //       }
  //     }
  //   }
  //   int rank = 1;
  //   System.out.println("Event 002: 100m Individual Result");
  //   for (Athlete a : this.Individual100Rank) {
  //     if (a.getResult100() == 0)
  //       continue;
  //     System.out.println("Rank " + (rank++) + ": " + a + "     \tResult: " + a.getResult100());
  //   }
  //   System.out.println();
  //   return this.Individual100Rank;
  // }

  /***
   * rank the position according to the result of 4x400m relay
   * 
   * @return List the position of the teams
   */
  public Team[] getTeam44Rank() {
    this.Team44Result = Arrays.copyOf(Teams, Teams.length);
    for (int i = 0; i < Teams.length; i++) {
      for (int k = i + 1; k < Teams.length; k++) {
        if (this.Teams[i].getResult44() > Teams[k].getResult44()) {
          Team temp = Team44Result[i];
          Team44Result[i] = Team44Result[k];
          Team44Result[k] = temp;
        }
      }
    }
    int position = 1;
    System.out.println("Event 004: 4x400m Relay");
    for (Team team : Team44Result) {
      System.out.println("Rank " + (position++) + " :" + team + " \t   Result: " + team.getResult44());
    }
    System.out.println();
    return Team44Result;
  }

  /***
   * rank the position according to the result of 4x100m relay
   * 
   * @return List the position of the teams
   */
  public Team[] getTeam41Rank() {
    this.Team41Result = Arrays.copyOf(Teams, Teams.length);
    for (int i = 0; i < Teams.length; i++) {
      for (int k = i + 1; k < Teams.length; k++) {
        if (this.Teams[i].getResult41() > Teams[k].getResult41()) {
          Team temp = Team41Result[i];
          Team41Result[i] = Team41Result[k];
          Team41Result[k] = temp;
        }
      }
    }
    int position = 1;
    System.out.println("Event 003: 4x100m Relay Result");
    for (Team team : Team41Result) {
      System.out.println("Rank " + (position++) + " :" + team + " \t   Result: " + team.getResult41());
    }
    System.out.println();
    return Team41Result;
  }

  public static void main(String[] args) {
    Athlete Him = new Athlete("HimJai", 24, 'M', 1998);
    Athlete ABC = new Athlete("BACHI", 21, 'M', 1998);
    Athlete DEF = new Athlete("TFBOYS", 25, 'M', 1998);
    // Athlete KAI = new Athlete("KAILO", 27, 'M', 1998);
    // Athlete PKJ = new Athlete("PKKJai", 54, 'M', 1998);
    // Team Team1 = new Team("KAI LO Team");
    // Team1.setTeamMembers(new Athlete[]{Him,ABC,DEF,KAI});
    // Team1.changeTeamMembers(1, PKJ);
    // Team1.changeTeamMembers(0, PKJ);
    // Team1.changeTeamMembers(2, ABC);
    // Team1.changeTeamMembers(3, DEF);
    
    Him.setResult(Event.R400,53.12);
    ABC.setResult(Event.R400,61.11);
    DEF.setResult(Event.R400,57.99);
    Competition comp = new Competition();
    //comp.setTeams(new Team[]{Team1});
    comp.setParticipants();
    System.out.println(Him);
    System.out.println(ABC);
    //System.out.println(PKJ);
    System.out.println(Arrays.toString(comp.RankingSystem(Event.R400)));



  }
}
