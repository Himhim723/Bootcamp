import java.util.Arrays;

  public class Square {

  
  public Edge[] edges;

  private Square(){
    edges = new Edge[4];
    edges[0]=new Edge(3.0d,"RED");
    edges[1]=new Edge(3.0d,"BLUE");
    edges[2]=new Edge(3.0d,"BLACK");
    edges[3]=new Edge(4.3d,"BLACK");
  }

  private Square(double length){
    edges = new Edge[4];
    edges[0]=new Edge(length,"RED"); 
    edges[1]=new Edge(length,"RED");
    edges[2]=new Edge(length,"RED");
    edges[3]=new Edge(length,"RED");
  }


  public void setEdgeColor(int idx, String color){
    this.edges[idx].setEdgeColor(color);
  }

  public Edge[] getEdges(){
    return this.edges;
  }


  public static void main(String[] args) {
    Square square = new Square();
    square.setEdgeColor(0, "PURPLE");
    System.out.println(square.getEdges()[1]);
    Square hi = new Square();
    
  }
}
