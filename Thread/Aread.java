package Thread;

public class Aread implements run {
  run gomethod;
  public Aread(run a){
    this.gomethod = a;
  }
  
  @Override
  public void go(){
    gomethod.go();;
  }
}
