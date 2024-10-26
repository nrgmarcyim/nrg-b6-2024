package chapter4;

import java.util.*;

public class LambdaLesson {

    static void printAnimals(List<Animal> animals,CheckTrait checker){
        for(Animal animal:animals){
            if(checker.test(animal)){
                System.out.println(animal+",");
            }

        }System.out.println("*************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("Kangaroo", true, false,3));
        animals.add(new Animal("Rabbit", true, false,2));
        animals.add(new Animal("turtle", false, true,34));
        animals.add(new Animal("Crocodile", false,true,60));
        animals.add(new Animal("Beaver", true,true,3));
        animals.add(new Animal("Giraffes", false,false,5));
        animals.add(new Animal("frog", true,true,1));
         
        // printAnimals(animals, new CheckIfHopper());
        printAnimals(animals, a -> a.canHop());

        System.out.println("Animals that can swim");
        // printAnimals(animals, new CheckIfSwimmer());
        printAnimals(animals, a -> a.canSwim());
        System.out.println("Animals that can hop and swim");
        printAnimals(animals, a ->a.canHop() && a.canSwim());
        System.out.println("Animals that can't hop and can't swim");
        printAnimals(animals, a ->!a.canHop() && !a.canSwim());
        System.out.println("Animals age higher than 3 years");
        printAnimals(animals, a-> a.getAge() >=3);
        Scanner search = new Scanner(System.in);
        System.out.print("Enter species name: ");
        String tosearch = search.nextLine();
        printAnimals(animals, a->a.toString().equalsIgnoreCase(tosearch));

        
        
    }
}
class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String species, boolean canHop, boolean canSwim,int age) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
        this.age = age;
    }
    public boolean canHop() {
        return this.canHop;
    }
    public boolean canSwim() {
        return this.canSwim;
    }
    public String toString() { return species; } 
    int getAge(){
        return age;
    }
    
   
}
interface CheckTrait {
    // a -> a.canHop()
    boolean test(Animal a);
    } 

// class CheckIfHopper implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canHop(); }
// }
// class CheckIfSwimmer implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canSwim(); }
// }