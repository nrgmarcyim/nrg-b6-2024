package chapter1;
public class Main{
    public static void main(String[] args) {
        String[] name = new String[]{"Marco","John"};
        Hero h1 = new Hero();
        // this is a comment
        h1.setHp(-10);
        System.out.println(h1);
        System.out.println(args[1]);
    }
}