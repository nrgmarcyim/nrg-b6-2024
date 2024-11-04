package chapter5;

public class OverrideMethod {
    public Animal getAnimal(){
        Panda result = new Panda(null, 0,0);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight()); 
        System.out.println(new Wolf().getAverageWeight()); }
}
class Canine {
    public double getAverageWeight(){ 
        return 50; 
    } 
}

class Wolf extends Canine { 
    public double getAverageWeight() {
        return super.getAverageWeight()+20; }
         }

