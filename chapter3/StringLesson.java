package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "Fluffy";
        String name2 = new String("Fluffy");
        System.out.println(name);
        name = "Tiny";
        name = "Fluffy";
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("fy"));

        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);
        String string = "animals";
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123
        System.out.println(string);
        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        String lastname ="Marco ";
        String lastname2 = "Marco";
        System.out.println(lastname.equals(lastname2));
        System.out.println("     \t \n         @      ab c d          ".trim());
    }
}
