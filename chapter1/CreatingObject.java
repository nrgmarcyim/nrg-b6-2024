package chapter1;

public class CreatingObject {
    public static void main(String[] args) {
        Chick sisiw1 = new Chick();
        int y = 300;
        Chick sisiw2 = new Chick();
        Chick sisiw3;
        System.out.println("end of program");
        sisiw2.Chick();
        Name name1 = new Name();
        System.out.println(name1.first);
        System.out.println(name1.last);
        System.out.println(name1.full);
        name1.first = "Marc";
        name1.last = "Yim";
        System.out.println(name1.full);
    }
    
}

class Chick{
    int ageInDays;
    /**
     * Constructor for Chick object
     */
    public Chick(){
        ageInDays = 1;
        System.out.println("generating Chick object");
    }
    public void Chick(){ // pampalito sa constructor
        System.out.println("this is a method");
    }
}
class Name{
    String first ="Theodore";
    String last = "Moose";
    String full = first+last;
}