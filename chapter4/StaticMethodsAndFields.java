package chapter4;

public class StaticMethodsAndFields {
    static int sCounter;
    int counter = 1;
    static void hello(){
        System.out.println("Hello");
    }
    public void hello2(){
        System.out.println("Hello2");
    }
    public static void main(String[] args) {
        StaticMethodsAndFields smf1 = new StaticMethodsAndFields();
        StaticMethodsAndFields smf2 = new StaticMethodsAndFields();
        StaticMethodsAndFields smf3 = new StaticMethodsAndFields();
        smf1.counter=9;
        smf1.sCounter=1;
        smf2.counter=2;
        smf2.sCounter=2;
        smf3.counter=6;
        smf1.hello2();
        hello();
        System.out.println(smf1.counter+","+smf1.sCounter);
        System.out.println(smf2.counter+","+smf2.sCounter);
        System.out.println(smf3.counter+","+smf3.sCounter);
        smf1.hello2();
        hello();
        Food f1 = new Food();
        Food f2 = new Food();
        Food f3 = new Food();
        Food f4 = new Food();
        f1.name = "kwek kwek";f1.price = 5;
        f2.name = "burger";f2.price= 25;
        f3.name = "sopas";f3.price=15;
        f4.name = "sinapot";f4.price = 10;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println("Total price is: P"+f2.subTotal(f1,f2,f3,f4,f4));
    }
    
}
class Food{
    String name;
    int price;
    public String toString(){
        return "Name: "+name+"\nPrice: P"+price;
    }
    public int subTotal(Food... Foods){
        int total = 0;
        for(Food food:Foods){
            total+= food.price;
        }
        return total;
    }
}