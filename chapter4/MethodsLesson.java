package chapter4;

public class MethodsLesson {
    int p = 10;
    int sum(int a,int b){
       return (short)(a+b);
       
    }
    void sayMyName(String name){
        System.out.println("Hi "+name+", welcome to java class");
        
    }
    void oneException() throws Exception{
        throw new Exception();
    }
    void method1(int a){
        int p = 11;
        int i = 10+p;

        System.out.println(i+p+this.p);

    }
    public static void main(String[] args) {
        MethodsLesson ml1 = new MethodsLesson();
        System.out.println(ml1.sum(40,40));
        ml1.sayMyName("Marc");
        ml1.method1(1);
        VarArgsLesson val = new VarArgsLesson();
        // System.out.println(val.id1);
        System.out.println(val.id2);
        System.out.println(val.id3);
        System.out.println(val.id4);
        
    }
}

class SampleMethod{
    public static void main(String[] args) {
        MethodsLesson ml3 = new MethodsLesson();
        System.out.println(ml3.sum(300,400));
    }
}
