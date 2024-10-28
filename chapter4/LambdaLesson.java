package chapter4;

import java.util.*;
import java.util.function.*;

public class LambdaLesson {

    static void printAnimals(List<Animal> animals, Predicate<Animal> checker){
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
        printAnimals(animals,(Animal a)->{ return a.toString().equalsIgnoreCase(tosearch);});
        
        
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
// interface CheckTrait {
//     // a -> a.canHop()
//     boolean test(Animal a);
//     } 

// class CheckIfHopper implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canHop(); }
// }
// class CheckIfSwimmer implements CheckTrait {
//     public boolean test(Animal a) {
//         return a.canSwim(); }
// }
class Bunny{
    public static void main(String[] args) {
        
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);
        // [long ear, floppy, hoppy]
        bunnies.removeIf(s -> s.charAt(0) !='h');
        
        System.out.println(bunnies);
        // [hoppy]
    }
    
}
class Sum{
    static List<Integer> filteredNumber(int[] nums,Predicate<Integer> condition){
        List<Integer> result= new ArrayList<>();
            for(int num:nums){
                if(condition.test(num))
                result.add(num);
            }
            return result; 
        }

        
    
    public static void main(String[] args) {
        int[] numss={1,2,3,4,5};
        Predicate<Integer> oddnum = n->n%2==1;
        SumOfAll sumOfAll = (int[] nums)-> { int total=0;  for(int num:nums) total+=num; return total; };
        System.out.println(sumOfAll.sum(numss));
        System.out.println(filteredNumber(numss, oddnum));
        

    }
    
}
interface SumOfAll{
    int sum(int[] i);
}