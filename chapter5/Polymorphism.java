package chapter5;

public class Polymorphism {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        lemur.getName();
        Object LemurAsObect = lemur;
        String name =((Lemur) LemurAsObect).getName();
        // lemur.age
        Primate primate = lemur;
        // primate.age
        HasTail tail = lemur;
        System.out.println(tail.isTailStripped());

        
    }
}

class Primate{
    boolean hair = true;
    boolean hasHair(){
        return hair;
    }
}
interface HasTail{
    boolean isTailStripped();
}
class Lemur extends Primate implements HasTail{
    int age = 10;
    String getName(){
        return "Lemur";
    }
    @Override
    public boolean isTailStripped() {
        return true;
    }
}
class Reptile{
    public String getName(){
        return "Reptile";
    }
}
class Alligator extends Reptile{
    public String getName(){
        return "Alligator";
    }
}
class Crocodile extends Reptile{
    public String getName(){
        return "Crocodile";
    }
}
class ZooKeeper{
    public static void feed(Reptile reptile){
        System.out.println("Feeding reptile: "+reptile.getName());
    }
    public static void main(String[] args) {
        feed(new Reptile());
        
        feed(new Alligator());
        feed(new Crocodile());
    }
}