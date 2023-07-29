package Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {
  private String ownPlayer;
  private String ID;
  private String name;
  private String describition;
  private Skill[] BattleSkills;
  private Skill[] AllBattleSkills;  
  private int EXP=0;
  private int grade=1;
  private int MaxHP;
  private int HP;
  private int power;
  private int defpow;
  private int SPow;
  private int SDef;
  private int Speed;
  private int[] Upgrade;


  public Pokemon(){

  }

  public Pokemon(String ID,String name,int HP, int power, int defpow,int SPow,int SDef,int Speed){
    this.BattleSkills = new Skill[4];
    BattleSkills[0]=new Skill("HELLO");
    BattleSkills[1]=new Skill("GOOGLE");
    BattleSkills[2]=new Skill("CHATGPT3.5");
    BattleSkills[3]=new Skill("CHATGPT4.0");
    
    Skill[] AllBattleSkills = new Skill[100];
    this.ID = ID;
    this.name = name;
    this.HP = HP;
    this.MaxHP = HP;
    this.power = power;
    this.defpow = defpow;
    this.SPow = SPow;
    this.SDef = SDef;
    this.Speed = Speed;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
  }
  public String getID(){
    return this.ID;
  }
  public String getDeescribtion(){
    return this.describition;
  }
  public int getgrade(){
    return this.grade;
  }
  public int getEXP(){
    return this.EXP;
  }
  public int getHP(){
    return this.HP;
  }
  public int getPower(){
    return this.power;
  }
  public int getDefPow(){
    return this.defpow;
  }
  public int getSPow(){
    return this.SPow;
  }
  public int getSDef(){
    return this.SDef;
  }


  public void Battle (Pokemon opponent){
    Scanner input = new Scanner(System.in);
    System.out.println(opponent.getName()+"出現了！");
    boolean NotEscape = true;
    while(NotEscape&&this.HP>0&&opponent.HP>0){
      System.out.println(this.name+" 要做什麼：(請輸入數字操作)");
      while(opponent.HP>0&&this.HP>0){
      System.out.println("1: 攻擊\t2: 背包\n3: 怪獸\t4: 逃跑");
      switch(input.nextInt()){
        case 1: 
        System.out.println("請選擇技能：");
        for(int i=0;i<BattleSkills.length;i++){
        System.out.println((i+1)+": "+BattleSkills[i].getName());
        }
        System.out.println("5: Back to Main Menu");
        switch(input.nextInt()){
          case 1: this.attack(opponent);
          this.HP-=30;
                  break;
          case 2: this.attack(opponent);
                  break;
          case 3: this.attack(opponent);
                  break;
          case 4: this.attack(opponent);
                  break;
          default: break;
        }
        break;

        case 2: healing();




      }
    }
    }
    
  }

  
  public void attack(Pokemon Opponent){
    if(Hit()){
      if(CriticalHit()) 
      Opponent.HP-=(this.power*1.1-Opponent.defpow);
      else 
      Opponent.HP-=(this.power-Opponent.defpow);
    }
    System.out.println(this.getName()+" HP:"+this.getHP()+"\t"+Opponent.getName()+" HP:"+Opponent.getHP()+"\n");
    if(this.HP<=0){
      System.out.println("You have been DEFEATED");
    }
  }

  public void healing(){
    HP+=20;
    if(HP>MaxHP) HP=MaxHP;
  }

  public void escape(){
    if(Hit()){
      System.out.println(ownPlayer);
    }
  }

  public boolean Hit(){
    Random ran = new Random();
    if((ran.nextInt(100)+1)>10) return true;
    else return false;
  }

  public boolean CriticalHit(){
    Random ran = new Random();
    if((ran.nextInt(100)+1)>50) return true;
    else return false;
  }
  //Create Pokemon
  //Create Player
  //Create Items (Pokemon Ball,Healing Items, Learning Machine, PowerUpItems)
  //Create Opponent (企街哥哥姐姐, 道館館主, 道館 KELEFEI, 最勁個館, 煩膠朋友)
  public static void main(String[] args) {
    Pokemon 妙蛙種子 = new Pokemon("001","奇異種子",45,49,49,65,65,45);
    Pokemon 妙蛙草 = new Pokemon("002","奇異草",60,62,63,80,80,60);
    Pokemon 妙蛙花 = new Pokemon("003","奇異花",80,82,83,100,100,80);
    Pokemon 小火龍 = new Pokemon("004","小火龍",39,52,43,60,50,65);
    Pokemon 火恐龍 = new Pokemon("005","火恐龍",58,64,58,80,65,80);
    Pokemon 噴火龍 = new Pokemon("006","噴火龍",78,84,78,109,85,100);
    Pokemon 傑尼龜 = new Pokemon("007","車厘龜",44,48,65,50,64,33);
    Pokemon 卡咪龜 = new Pokemon("008","卡美龜",59,63,80,65,80,58);
    Pokemon 水箭龜 = new Pokemon("009","水箭龜",79,83,100,85,105,78);
    Pokemon 綠毛蟲 = new Pokemon("010","綠毛蟲",48,30,35,20,20,45);
    Pokemon 鐵甲蛹 = new Pokemon("011","鐵甲蟲",50,20,55,25,25,30);
    Pokemon 巴大蝶 = new Pokemon("012","巴他蝶",60,45,50,90,80,70);
    Pokemon 獨角蟲 = new Pokemon("013","獨角蟲",40,35,30,20,20,50);
    Pokemon 鐵殼蛹 = new Pokemon("014","鐵殼蛹",45,25,50,25,25,35);
    Pokemon 大針蜂 = new Pokemon("015","大針蜂",65,90,40,45,80,75);
    Pokemon 波波 = new Pokemon("016","波波",40,45,40,35,35,56);
    Pokemon 比比鳥 = new Pokemon("017","比比鳥",63,60,55,50,50,71);
    Pokemon 大比鳥 = new Pokemon("018","大比鳥",83,80,75,70,70,101);
    Pokemon 小拉達 = new Pokemon("019","小哥達",30,56,35,25,35,72);
    Pokemon 拉達 = new Pokemon("020","哥達",55,81,60,50,70,97);
    Pokemon 烈雀 = new Pokemon("021","烈雀",40,60,30,31,31,70);
    Pokemon 大嘴雀 = new Pokemon("022","大嘴雀",65,90,65,61,61,100);
    Pokemon 阿柏蛇 = new Pokemon("023","阿柏蛇",35,60,44,40,54,55);
    Pokemon 阿柏怪 = new Pokemon("024","阿柏怪",60,95,69,65,79,80);
    Pokemon 皮卡丘 = new Pokemon("025","皮卡丘",35,55,40,50,50,90);
    Pokemon 雷丘 = new Pokemon("026","雷丘",60,90,55,90,80,110);
    Pokemon 穿山鼠 = new Pokemon("027","穿山鼠",50,75,85,20,30,40);
    Pokemon 穿山王 = new Pokemon("028","穿山王",75,100,110,45,55,65);
    Pokemon 尼多蘭 =  new Pokemon("029","尼多蘭",55,47,52,40,40,41);
    Pokemon 尼多娜 = new Pokemon("030","尼多娜",70,62,67,55,55,56);
    Pokemon 尼多后 = new Pokemon("031","尼多后",90,92,87,75,85,76);
    Pokemon 尼多朗 = new Pokemon("032","尼多朗",46,57,40,40,40,50);
    Pokemon 尼多力諾 = new Pokemon("033","尼多力諾",61,72,57,55,55,65);
    Pokemon 尼多王 = new Pokemon("034","尼多王",81,102,77,85,75,85);
    Pokemon 皮皮 = new Pokemon("035","皮皮",70,45,48,60,65,35);
    Pokemon 皮可西 = new Pokemon("036","皮可西",95,70,73,95,90,60);
    Pokemon 六尾 = new Pokemon("037","六尾",38,41,40,50,65,65);
    Pokemon 九尾 = new Pokemon("038","九尾",73,76,75,81,100,100);
    Pokemon 胖丁 = new Pokemon("039","胖丁",115,45,20,45,25,20);
    Pokemon 胖可丁 = new Pokemon("040","胖可丁",140,70,45,85,50,45);
    Pokemon 超音蝠 = new Pokemon("041","超音蝠",40,45,35,30,40,55);
    Pokemon 大嘴蝠 = new Pokemon("042","大嘴蝠",75,80,70,65,75,90);
    Pokemon 走路草 = new Pokemon("043","走路草",45,50,55,75,65,30);
    Pokemon 臭臭花 = new Pokemon("044","臭臭花",60,65,70,85,75,40);
    Pokemon 霸王花 = new Pokemon("045","霸王花",75,80,85,110,90,50);
    Pokemon 派拉斯 = new Pokemon("046","派拉斯",35,70,55,45,55,25);
    Pokemon 派拉斯特 = new Pokemon("047","派拉斯特",60,95,80,60,80,30);
    Pokemon 毛球 = new Pokemon("048","毛球",60,55,50,40,55,45);
    Pokemon 摩魯蛾 = new Pokemon("049","摩魯蛾",70,65,60,90,75,90);
    Pokemon 地鼠 = new Pokemon("050","地鼠",10,55,25,35,45,95);
    Pokemon 三地鼠 = new Pokemon("051","三地鼠",35,100,50,50,70,120);
    Pokemon 喵喵 = new Pokemon("052","喵喵",40,45,35,40,40,90);
    Pokemon 貓老大 = new Pokemon("053","貓老大",65,70,60,65,65,115);
    Pokemon 可達鴨 = new Pokemon("054","可達鴨",50,52,48,65,50,55);
    Pokemon 哥達鴨 = new Pokemon("055","哥達鴨",80,82,78,95,80,85);
    Pokemon 猴怪 = new Pokemon("056","猴怪",40,80,35,35,45,70);
    Pokemon 火爆猴 = new Pokemon("057","火爆猴",65,105,60,60,70,95);
    Pokemon 卡蒂狗 = new Pokemon("058","卡蒂狗",55,70,45,70,50,60);
    Pokemon 風速狗 = new Pokemon("059","風速狗",90,110,80,100,80,95);
    Pokemon 蚊香蝌蚪 = new Pokemon("060","蚊香蝌蚪",40,50,40,40,40,90);
    訓練員 Him = new 訓練員();
    // 妙蛙種子.attack(蚊香蝌蚪);
    // System.out.println(妙蛙種子.getName()+" 使用了攻擊擊中了 "+蚊香蝌蚪.getName());
    // System.out.println(妙蛙種子.getName()+" HP:"+妙蛙種子.getHP()+"\t"+蚊香蝌蚪.getName()+" HP:"+蚊香蝌蚪.getHP());
    // System.out.println();
    // 妙蛙種子.attack(蚊香蝌蚪);
    // System.out.println(妙蛙種子.getName()+" 使用了攻擊擊中了 "+蚊香蝌蚪.getName());
    // System.out.println(妙蛙種子.getName()+" HP:"+妙蛙種子.getHP()+"\t"+蚊香蝌蚪.getName()+" HP:"+蚊香蝌蚪.getHP());
    // System.out.println();
    // 妙蛙種子.attack(蚊香蝌蚪);
    // System.out.println(妙蛙種子.getName()+" 使用了攻擊擊中了 "+蚊香蝌蚪.getName());
    // System.out.println(妙蛙種子.getName()+" HP:"+妙蛙種子.getHP()+"\t"+蚊香蝌蚪.getName()+" HP:"+蚊香蝌蚪.getHP());
    // System.out.println();
    // 蚊香蝌蚪.healing();
    // System.out.println(蚊香蝌蚪.getHP());

  }
}
