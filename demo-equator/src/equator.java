public class equator{
  public static void main(String[] args){
    int a = 3;
    System.out.println(a); //a=3
    a=a+1;
    System.out.println(a); //a=4
    a=a+1;
    System.out.println(a); //a=5
    a=a+1;
    System.out.println(a); //a=6

    a=a+1;  //有幾種寫法   a=7
    System.out.println(a); 
    a+=2;   // a=8
    System.out.println(a); 
    a++;    // a=9
    System.out.println(a); //10
    System.out.println(a--); //先print 出 a 既 value (10) 之後默默地加 1
    //now the value of a is 9
    System.out.println(--a); //a 既 value先減左 1 再print out value
    //所以print out 既 value is 8
    
    a+=2; //a=a+2
    a-=2; //a=a-2
    a*=2; //a=a*2
    a/=2; //a=a/2  8

    System.out.println(a++*2);  //16
    System.out.println(a);      //9

    int b=3;
    System.out.println((b++ +3)*b++);
    System.out.println(b);

    int preNum = 5;
    preNum++; //preNum=6
    int postNum=preNum++;         
    //先將preNum放到post, 然後preNum再獨自由亞古獸進化做機械暴龍獸 7
    System.out.println(postNum); //post 進化前既亞古獸 6
    System.out.println(preNum);  //pre 進化後既機械暴龍獸 7
    
    
  }
}