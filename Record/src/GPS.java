import java.util.Objects;

public class GPS {
  private int x = 0;
  private int y = 0;

  public GPS() {
  }

  public GPS(GPS old){
    this.x = old.x;
    this.y = old.y;
  }

  public String getCoordinates() {
    return " is in [ " + x + ", " + y + " ]";
  }

  public String toString() {
    return getCoordinates();
  }

  public int right() {
    return this.x++;
  }

  public int left() {
    return this.x--;
  }

  public int forward() {
    return this.y++;
  }

  public int backward() {
    return this.y--;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof GPS))
      return false;
    GPS player = (GPS) o;
    if (player.x == this.x &&
        player.y == this.y)
      return true;
    return false;
  }

}
