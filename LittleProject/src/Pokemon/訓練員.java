package Pokemon;

import java.util.Scanner;

public class 訓練員 {
  public String name;
  public String gender;
  public Pokemon[] pokemon;
  //private Items[] bag;

  public 訓練員 (){
    SetPlayer();
  }

  public void SetPlayer(){
    Scanner input = new Scanner(System.in);
    // System.out.println("Enter \"Start\" to start the game.");
    // String res = input.next();
    // System.out.println("歡迎來到寵物小精靈第一代朱紅");
    // System.out.println("你是。。。 男(M)還是女(F)的？");
    // this.gender = input.next();
    // boolean Confirm = false;
    // while (!Confirm){
    // System.out.println("你的名字是：");
    // String name = input.next();
    // System.out.println("你的名字是 "+name+" ，對嗎？ (Yes/No)");
    // if(input.next().equals("Yes")) Confirm = true;
    // this.name=name;
    // }
    // System.out.println("好吧！ " + this.name +" 現在要開始了～～");
    // System.out.println("... ... ... ... \n... ... ... ... \n... ... ... ... 到了\n");
    // System.out.println("前面好像有點吵，要過去嗎？ (Yes/No)");
    // if(input.next().equals("No")){
    //   System.out.println("但是，情況好像很嚴重。還是過去看看好了。");
    // }
    // System.out.println("啊 ~ ~ ~");
    // System.out.println("有個古怪的人正被狗追著，要救他嗎？ (Yes/No)");
    // if(input.next().equals("No")){
    //   System.out.println("等等，救左佢，你可以😌屈佢送野比你😌，都係過去救佢好了😌");
    // }
    // System.out.println(this.name+"打開了地上的背包，裹面有三個精靈球");
    this.pokemon = new Pokemon[152];
    Pokemon FirstPet=new Pokemon();
    boolean Confirm = false;
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
    System.out.println("你確認選擇 "+FirstPet.getName()+"，對嗎？ (Yes/No)");
    if(input.next().equals("Yes")) {
      Confirm = true;
      this.pokemon[0]=FirstPet;
      System.out.println("你已取得"+FirstPet.getName()+"\n");
    }
    }
    FirstPet.Battle(new Pokemon("019","小哥達",80,56,35,25,35,72)); //Battle Method has not been made


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

  public void showAllPokemon(){

    System.out.println();
    for(int i=0;i<this.pokemon.length;i++){
      System.out.println("No: "+pokemon[i]);
    }
  }
}

