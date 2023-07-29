import java.util.Arrays;

public class Edge {
  private double length;
  private String color;

  public Edge(){
    
  }
  public Edge(double length, String color){
    this.length=length;
    this.color=color;
  }

  public String setEdgeColor (String color){
    return this.color=color;
  }

  public String getColor(){
    return this.color;
  }

  public double getLength(){
    return this.length;
  }

  public Edge getEdges(){
    return this;
  }
  
  public String toString(){
    return this.color+" " +this.length;
  }
}
