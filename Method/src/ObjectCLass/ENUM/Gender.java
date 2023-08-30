package ObjectCLass.ENUM;

public enum Gender {
    MALE("Male",'M'),
    FEMALE("Female",'F');

    private String gender;
    private char gen;

    private Gender(String gender, char gen){
      this.gender=gender;
      this.gen=gen;
    }

    public String getGender(){
      return this.gender;
    }

    public char getGenderC(){
      return this.gen;
    }

    public boolean isMale(){
      return this==MALE;
    }

    public boolean isMale(String input){
      return this.getGender().toUpperCase().equals(input.toUpperCase());
    }

    public boolean isMale(char input){
      return this.getGenderC()==input || this.getGenderC()==input+32; 
    }
  

    



    public static void main(String[] args) {
      Object obj = new Ball(Color.RED,1.0d);
      System.out.println(obj.hashCode());
      //Compile Stage check Object class has hashCode() method
      //Compile Stage check if Ball class inherit Object

      //Run time object variable stores an address print to a ball object in a 
      //Run time determine if Class Ball has hashCoe() method
      //If no, then invoke class Object hashCode()
      //If yes, then invoke child class hashCode()

      Ball ball1 = new Ball(Color.RED,2.3d);
      //getClass() get the class name 
      Color color = ball1.getColor();
      Class<?> cls = ball1.getColor().getClass();
      System.out.println(cls.getName());
      Object o = 1-'a';
      System.out.println(o.getClass().isEnum());

      

      if(Color.BLUE instanceof Color){
        System.out.println("True");
      }

      //.getClass    .getName()     .isEnum
      

    }

  }