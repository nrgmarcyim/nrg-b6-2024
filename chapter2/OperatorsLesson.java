package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
        int p = 0;
        System.out.println(p++);//0 post-unary ops
        System.out.println(p);//1
        System.out.println(--p);// pre-unary ops
        System.out.println(p);
        System.out.println( (10 + p * --p ) + p++ );
        // (10+ 0 * -1) + -1
        // 3 print foo
        // 5 print bar
        //3 and 5 print foo bar
        System.out.println(8>>3);
        System.out.println(1<<3);
        
        // 1 1 1 1
        // 8 4 2 1
        // 1 0 0 0
        // 0 0 0 1
        
        int age = +19;
        String msg = (age>= +21) ? "you can now work" : "under age";
        System.out.println(msg);

        short x = 10;
        short y = 3;
        short z = (short) (x * y); // DOES COMPILE
        long a = 5;
        int b = 10;
        // b = b*a;
        b*=a; //b = (type of b)(b*a)
        a*=b; //a = (type of a)(a*b)
        int c = 10;
        int d = (c=45);//c=45 d=45
        System.out.println(c+d);
        File x1 = new File("myFile.txt");
        File y1 = new File("myFile.txt");
        File z1 = x1;
        System.out.println(x1 == y1); 
        System.out.println(x1 == z1);
        String one = "Marco";
        String two = "Yim";
        String three = "Marco";
        System.out.println(one==three);
        System.out.println(two!=one);
    }
}

class File{
    String url;
    File(String url){
        this.url = url;
    }
}