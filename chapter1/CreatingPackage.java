package chapter1;
import chapter1.folder1.*;
public class CreatingPackage {
    public static void main(String[] args) {
        One one1 = new One();
        One one2 = new One();
        System.out.println(one1.code);//reading object fields
        System.out.println(one1.pin);//reading object fields
        one1.pin = 969345; // writting object fields
        System.out.println(one1.pin);
    }
}
