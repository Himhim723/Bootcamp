
public class Ball1 {
    private int id;
    private static int count=0;
    private Color1 color;

    public Ball1(Color1 color){
      this.color = color;
      this.id = ++count;
    }
    public Ball1(int num){
      this.id = ++count;
      Color1 temp = null;
      switch(num){
        case 0: temp = Color1.RED;
                break;
        case 1: temp = Color1.BLUE;
                break;
        case 2: temp = Color1.YELLOW;
      }
      this.color=temp;
    }

    public Color1 getColor(){
      return this.color;
    }

    public int getScore(){
      return this.color.getScore();
    }

    @Override
    public String toString(){
      return "Ball id="+this.id+"  Color = "+this.color;
    }


}
