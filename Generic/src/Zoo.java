import java.util.ArrayList;

public class Zoo<T> {

    ArrayList<T> animal;


    private Zoo(T animal){
      if(!(animal instanceof Animal[])) return;
      this.animal = new ArrayList<>();
      this.animal.add(animal);
    }

    private Zoo(T... animal){
      if(!(animal instanceof Animal[])) return;
      this.animal = new ArrayList<T>();
      for(T pet: animal){
        this.animal.add(pet);
      }
    }

    public static <T extends Animal> Zoo<T> creatTZoo(T... animal){  //<T extends Animal>
      return new Zoo<T>(animal); 
    }

    public ArrayList<T> getAnimal(){
      return this.animal;
    }


    public static void main(String[] args) {
      Cat cat = new Cat("HIM");
      cat.setName("HIM");
      Dog mathew = Dog.create("Mathew");
      Dog dog = new Dog();
      dog.setName("Mini");
      Zoo<Animal> Zoo1 = Zoo.creatTZoo(dog,cat,mathew);
      // Zoo<Animal> Zoo1 = new Zoo(dog);
      System.out.println(Zoo1.getAnimal());
      

    }

}
