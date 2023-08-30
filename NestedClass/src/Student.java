import java.util.ArrayList;

// Outer Class can access inner class attribute
public class Student {
    //static nested class
    //Inner Class (non-static nested Class)
    private String name;
    private Bag bag;

    public Student (){}
    public Student (String name){
        this.name=name;
        this.bag = new Student.Bag();
    }

    public int getSize(){
        return this.bag.size;
    }

    public void clearBag(){
        Bag.clear(this.bag);
    }
    public String getNmae(){
        return this.name;
    }

    public static class Bag{
        // Static Inner Class cannot access Outer Class attribute
        int size;
        ArrayList<String> item;

        public Bag(){
            this.item= new ArrayList<>();
        }
        
        public void setSize(){
            this.size = size;
        }
        public int getSize(){
            return this.item.size();
        }
        public void add(String item){
            this.item.add(item);
        }
        public ArrayList<String> getItems(){
            return this.item;
        }
        public static void clear(Bag bag){
            bag.item.clear();
        }
    }

    //Inner Non-static class
    public class Grade {
        int score;

        public Grade(){}
        public Grade(int score){
            this.score= score;
        }
        public void setScore(int score){
            this.score = score;
        }
        public int getScore(){
            return this.score;
        }
        public char getGrade(){
            switch(this.score){
                case 90: return 'A';
                case 80: return 'B';
                case 70: return 'C';
            }
            return 'F';
        }
        public void getStudentName(){
            System.out.println(Student.this.getNmae());
        }

    }

    @Override
    public String toString(){
        return "Name: "+this.name+" Bag Size "+ bag.getSize() +"\nBag Items: "+bag.item;
    }




 



    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Student Him = new Student();
        Student.Bag bag = new Student.Bag();
        Student Him2  = new Student("Him2");
        System.out.println(Him2);
        Student.Grade grade = new Student("Ally").new Grade(3);
        Student.Grade grade2 = Him2.new Grade(11);
        grade2.getScore();
        Him2.bag.add("Apple");
        Him2.bag.add("Orange");
        Him2.bag.add("Banana");
        grade.getStudentName();
        System.out.println(Him2);
        grade2.getStudentName();
        
    }
}
