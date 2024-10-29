package chapter5;

public class InheritanceLesson {
    public static void main(String[] args) {
        Panda panda1 = new Panda("Poe", 16, 2);
        panda1.getDetails();
    }
    
}

 class  Animal { //extends java.lang.Object
    String name;
    int age;
    Animal(String name,int age){
        this.age = age;
        this.name = name;
    }
}

class Mammal extends Animal{
   int numOfMammaryGland;
   Mammal(String name,int age,int numOfMammaryGland){
    super(name, age);
    this.numOfMammaryGland = numOfMammaryGland;
   }
   void getDetails(){
    System.out.println("Name:"+name+"\nAge:"+age+"\nNumber of Glands:"+numOfMammaryGland);
}
}
class Cow extends Mammal{
    Cow(){
        this("Moe", 3, 4);
    }
    Cow(String name,int age,int numOfMammaryGland){
        super(name, age, numOfMammaryGland);
    }
   public static void main(String[] args) {
    Cow cow1 = new Cow();
    cow1.getDetails();
   }
}
class Monkey extends Mammal{
    Monkey(String name,int age,int numOfMammaryGland){
        super(name, age, numOfMammaryGland);
    }
    
}
class Bear extends Mammal{
    String color[];
    Bear(String name,int age,int numOfMammaryGland){
        super(name, age, numOfMammaryGland);
    }
}
class Panda extends Bear{
    String[] colors = {"white","black"};
    Panda(String name,int age,int numOfMammaryGland){
        super(name, age, numOfMammaryGland);
        color=colors;
    }
}
class Grizzly extends Bear{
    String[] colors = {"brown"};
    Grizzly(String name,int age,int numOfMammaryGland){
        super(name, age, numOfMammaryGland);
        color=colors;
    }
}
class Polar extends Bear{
    String[] colors = {"white"};
    Polar(String name,int age,int numOfMammaryGland){
        super(name, age, numOfMammaryGland);
        color=colors;
    }
}

