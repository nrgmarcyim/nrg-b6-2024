package chapter4;

public class ConstructorsLesson {
   public static void main(String[] args) {
      Bunny b1 = new Bunny("white",1,"bogart");
      Bunny b2 = new Bunny("black",2,"simon");
      Bunny b3 = new Bunny();
      System.out.println();
      Hamster h1 = new Hamster(1);
      Hamster h2 = new Hamster(1,"Black");
      System.out.println();
      Customer c1 = new Customer("Marc","Yim");
      Loan l1 = new Loan(500, c1);
      System.out.println(l1);
      l1.payloan(250);
      System.out.println(l1); 
      Student s1 = new Student("Elsa", "Snow", "Legazpi City", 12, 5);     
      System.out.println(s1);
   }
    
}
class Bunny {
    private String color;
    private int age;
    private String name;
    
    public Bunny(){}
    public Bunny(String color,int age,String name) {
      this.color = color;
      this.age = age;
      this.name = name;
    } 
   }

class Loan{
   int amount;
   Customer name;
   public Loan(int amount,Customer name){
      this.amount = amount;
      this.name = name;
   }
   public String toString(){
      return "Loan Details:\nCustomer Name: "+name.lastName+", "
      +name.firstName+"\nBalance: P"+amount;
   }


   int payloan(int amount){
      return this.amount-=amount;

   }
}
class Customer{
   String firstName;
   String lastName;
   public Customer(String firstName, String lastName){
      this.firstName = firstName;
      this.lastName = lastName;
   }
}

class Hamster {
   private String color;
   private int weight;
   public Hamster(int weight) {
      // first constructor
      // this.weight = weight;
      // color = "brown";
      this(weight,"brown");
   }
   public Hamster(int weight, String color) {
   // second constructor
   this.weight = weight;
   this.color = color; } 
}
class Student{
   String firstName;
   String lastName;
   String address;
   int gradeLevel;
   int section;

   public Student(String firstName, String lastName,String address, int gradeLevel,int section){
      this.firstName = firstName;
      this.lastName = lastName;
      this.address=address;
      this.gradeLevel=gradeLevel;
      this.section=section;
   }

   @Override
   public String toString() {
      return "{" +
         " firstName='" +  firstName + "'" +
         ", lastName='" + lastName + "'" +
         ", address='" + address + "'" +
         ", gradeLevel='" + gradeLevel + "'" +
         ", section='" + section + "'" +
         "}";
   }
}