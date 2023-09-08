package EducationalCenter.Product.Course;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

import EducationalCenter.Customer;
import EducationalCenter.Product.Product;
import EducationalCenter.Product.Coach.Coach;

public class Course extends Product{
  // (Product) String name ;
  //Timetable Attributes
  private List<LocalDate> timetable = new LinkedList<>();   // It is better to record both Date and Time in one attribute
  private LocalDate startDate;  
  private LocalDate endDate;  
  private HashSet<DayOfWeek> weekDay = new HashSet<>();
  private int quantity;

  // Basic Details
  private Coach coach;
  private Venue venue;  
  private int capacity;
  private String details;

  // Agreement
  private String agreement;

  // Student Application
  private List<Customer> stuList = new ArrayList<>(); 

  private Course (){}
  public Course setTitle(String title){
    this.name = title;
    return this;
  }
  public Course setVenue(Venue venue){
    this.venue = venue;
    return this;
  }
  public Course setStartDate(int Year, int Month,int Date){
    this.startDate = LocalDate.of(Year, Month, Date);
    return this;
  }
  public Course setEndDate(int Year, int Month,int Date){
    this.endDate = LocalDate.of(Year, Month, Date);
    return this;
  }
  public Course setDay(DayOfWeek... days){
    for(DayOfWeek day: days){
      this.weekDay.add(day);
    }
    return this;
  }
  public Course setTimeTable(){
    if(startDate==null) System.out.println("Have not initialize start date"); 
    else if(endDate == null) System.out.println("Have not initialize end date"); 
    else if(weekDay.isEmpty()) System.out.println("Have not initialize Day(s) of Week");
    else {
    int count=0;
    for(LocalDate i = startDate;i.isBefore(endDate);i=i.plusDays(1l)){
      if(this.weekDay.contains(i.getDayOfWeek())){
        count++;
        this.timetable.add(i);
      }
    }
    if(weekDay.contains(endDate.getDayOfWeek()))
    this.timetable.add(endDate);
    this.quantity = count;
    }
    return this;
  }
  public Course setCoach(Coach coach){
    this.coach = coach;
    return this;
  }
  public Course setPrice(double price){
    this.price = price;
    return this;
  }
  public Course setCapacity (int capacity){
    this.capacity = capacity;
    return this;
  }
  public Course setAgreement(String agreement){
    this.agreement = agreement;
    return this;
  }
  public Course setDetail(String detail){
    this.details = detail;
    return this;
  }
  public HashSet<DayOfWeek> getDayOfWeeks(){
    return this.weekDay;
  }
  public String getTimeTable(){
    if(timetable.isEmpty()) return "TimeTable has not been completed";
    StringBuilder sb = new StringBuilder();
    sb.append("TimeTable: ");
    for(LocalDate i : timetable){
      sb.append(i+"\n           ");
    }
    return sb.toString();
  }
  public void addStudent(Customer customer){
    this.stuList.add(customer);
  }
  public void addStudent(List<Customer> customer){
    this.stuList.addAll(customer);
  }
  
  @Override
  public boolean equals(Object o){
    if(o==this) return true;
    if(!(o instanceof Course)) return false;
    Course course = (Course) o;
    return (Objects.equals(course.timetable, this.timetable)&&
            Objects.equals(course.coach, this.coach)&&
            Objects.equals(course.venue, this.venue)&&
            Objects.equals(course.details, this.details));
  }

  @Override
  public int hashCode(){
    return Objects.hash();
  }

  @Override 
  public String toString(){
    return "Course Information:\n"+
           this.name+"\n"+
           "Coach: "+coach.getName()+"\n"+
           "Venue: "+ this.venue.getVenue()+"\n"+
           "Price: $"+ this.price +"/ lesson \n"+
           getTimeTable() + 
           "\nNumber of Lesson = " + this.timetable.size();
  }
  

  public static void main(String[] args) {
    Course course1 = new Course();
    course1.setTitle("Flyer RUNNER 2023 TKO SAT").setVenue(Venue.TKO)
           .setStartDate(2023, 8, 19).setEndDate(2023, 9, 30).setDay(DayOfWeek.MONDAY,DayOfWeek.FRIDAY)
           .setPrice(120.0d)
           .setTimeTable().setCoach(new Coach("Him"));
    
    System.out.println(course1);
    

  }



  
}
