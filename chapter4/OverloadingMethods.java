package chapter4;

public class OverloadingMethods {
    public void fly(int numMiles) { System.out.println("int with 1 parameter"); }
    public void fly(long numMiles) { System.out.println("long with 1 parameter"); } 
    public void fly(short numFeet) { System.out.println("short with 1 parameter"); }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { System.out.println("int,short with 2 parameters"); }
    public void fly(short numFeet, int numMiles) throws Exception {
        System.out.println("short,int with 2 parameters");
     }
     public void fly(Integer numMiles) { System.out.println("Integer with 1 parameter"); } 
     public void fly(String s) { System.out.println("string "); } 
     public void fly(Object o) { System.out.println("object "); }
     public void fly(int... num) { System.out.println("varargs "); }
    //  public void fly(int[] num) { System.out.println("int array "); }
     
     public static void main(String[] args) {
        OverloadingMethods olm = new OverloadingMethods();
        olm.fly(1);
        olm.fly((short)1);
        System.out.println(olm.fly());
        olm.fly(1, (short)1);
        Integer y = 10;
        olm.fly(y);
        olm.fly("hello");
        olm.fly(3.5);
        olm.fly(1,2,3,3,3,3,3,3,3);
    }
}


