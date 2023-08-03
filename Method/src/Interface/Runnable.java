package Interface;
//before Java8:  (100% abstraction cannot include void method or return method)
public interface Runnable { //要 implement 佢就要符合佢條件
  // if a class interface this document, they must run the method inside
  //Rule: must not be private and final

  void run();  //implicitly public and abstract

  
}
