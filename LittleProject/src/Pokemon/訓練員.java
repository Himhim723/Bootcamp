package Pokemon;

import java.util.Scanner;

public class 訓練員 {
  private String name;
  private String gender;
  private Pokemon[] 圖鑑;
  private Pokemon[] mypokemon;
  private boolean GiveUp;

  //private Items[] bag;

  public 訓練員 (){
    SetPlayer();
    // while(!GiveUp){
    //   Choice();
    // }
  }

  public void SetPlayer(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter \"Start\" to start the game.");
    String res = input.next();
    System.out.println("歡迎來到寵物小精靈第一代紅");
    System.out.println("你是。。。 男(M)還是女(F)的？");
    this.gender = input.next();
    boolean Confirm = false;
    while (!Confirm){
    System.out.println("你的名字是：");
    String name = input.next();
    System.out.println("你的名字是 "+name+" ，對嗎？ (Yes/No)");
    if(input.next().equals("Yes")) Confirm = true;
    this.name=name;
    }
    System.out.println("好吧！ " + this.name +" 現在要開始了～～");
    System.out.println("... ... ... ... \n... ... ... ... \n... ... ... ... 到了\n");
    System.out.println("前面好像有點吵，要過去嗎？ (Yes/No)");
    if(input.next().equals("No")){
      System.out.println("但是，情況好像很嚴重。還是過去看看好了。");
    }
    System.out.println("啊 ~ ~ ~");
    System.out.println("有個古怪的人正被狗追著，要救他嗎？ (Yes/No)");
    if(input.next().equals("No")){
      System.out.println("等等，救左佢，你可以😌屈佢送野比你😌，都係過去救佢好了😌");
    }
    System.out.println(this.name+"打開了地上的背包，裹面有三個精靈球");
    this.圖鑑 = new Pokemon[152];
    this.mypokemon = new Pokemon[4];
    Pokemon FirstPet=new Pokemon();
    Confirm = false;
    while (!Confirm){
    System.out.println("請選擇你要的精靈球： (請輸入數字)");
    System.out.println("1: 小火龍 \t 2: 車厘龜 \t 3: 奇異種子");
    switch(input.nextInt()){
      case 1: FirstPet = new Pokemon("004","小火龍",39,52,43,60,50,65); 
              break;
      case 2: FirstPet = new Pokemon("007","車厘龜",44,48,65,50,64,33); 
              break;
      case 3: FirstPet = new Pokemon("001","奇異種子",45,49,49,65,65,45);
              break;
    }
    System.out.println("你確認選擇 "+FirstPet+"，對嗎？ (Yes/No)");
    if(input.next().equals("Yes")) {
      Confirm = true;
      this.mypokemon[0]=FirstPet;
      FirstPet.setOwner(this);
      System.out.println("你已取得"+FirstPet+"\n");
    }
    }

      this.mypokemon[1]=new Pokemon("058","護主犬",55,70,45,70,50,60);
      this.mypokemon[1].setOwner(this);
      this.mypokemon[2]=new Pokemon("003","奇異花",80,82,83,100,100,80);
      this.mypokemon[2].setOwner(this);
      this.mypokemon[3]=new Pokemon("009","水箭龜",79,83,100,85,105,78);
      this.mypokemon[3].setOwner(this);
    FirstPet.Battle(new Pokemon("006","噴火龍",78,84,78,109,85,100)); //Battle Method has not been made
    if(mypokemon[0].AllDead()) {
      System.out.println("GAME OVER!!!");
      System.out.println("Do you want to start again.");
      if(input.next().toLowerCase().equals("yes")) {
      SetPlayer();
      }
    }

  }

  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    return this.name;
  }

  public void setGender(String gender){
    this.gender=gender;
  }
  public String getGender(){
    return this.gender;
  }
  public Pokemon[] getPokemons(){
    return this.mypokemon;
  }

  public void showAllPokemon(){
    System.out.println();
    for(int i=0;i<this.mypokemon.length;i++){
      System.out.println("No"+(i+1)+": "+mypokemon[i].getName());
    }
  }

  public void setGiveUp(boolean ans){
    this.GiveUp = ans;
  }

  

  @Override 
  public String toString(){
    return this.name;
  }
}

