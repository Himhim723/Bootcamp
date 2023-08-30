import java.util.Objects;

public class Player {
  String name;
  int age;
  GPS coordinate = new GPS();


  public Player(Player player) {
    this.name = player.name;
    this.age = player.age;
    this.coordinate = new GPS(player.coordinate);
  }

  public Player(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public int right() {
    return coordinate.right();
  }

  public int left() {
    return coordinate.left();
  }

  public int forward() {
    return coordinate.forward();
  }

  public int backward() {
    return coordinate.backward();
  }

  public String getCoordinate() {
    return this.name + coordinate.getCoordinates();
  }

  // @Override
  // public int hashCode() {
  //   return Objects.hash();
  // }

  // @Override
  // public boolean equals(Object o) {
  //   if (o == this)
  //     return true;
  //   if (!(o instanceof Player))
  //     return false;
  //   Player player = (Player) o;
  //   if (player.age == this.age &&
  //       player.coordinate.equals(this.coordinate) &&
  //       player.name.equals(this.name))
  //     return true;
  //   return false;
  // }

  // Inner Class
  record SavePoint(Player player) {
    public Player reset() {
      return this.player;
    }
    public boolean contains(Player player){
      return player.age==9;
    }


  }

  public static void main(String[] args) {
    Player Him = new Player("Him", 33);
    // System.out.println(Him.getCoordinate());
    Him.right();
    Him.right();
    Him.right();
    Him.right();
    System.out.println(Him.getCoordinate()+" SAVED");
    Player.SavePoint SavePoint1 = new SavePoint(new Player(Him));
    Him.right();
    Him.forward();
    Him.forward();
    System.out.println(Him.getCoordinate() +" Now");
    System.out.println("Return Save Point " + SavePoint1.reset().getCoordinate());
    Him.forward();
    System.out.println("Saving and Moving " + Him.getCoordinate());

    System.out.println(SavePoint1.reset());
    System.out.println(Him);
    Him = SavePoint1.reset();
    System.out.println(SavePoint1.reset());
    System.out.println(Him.getCoordinate());

    

    

  }

}
