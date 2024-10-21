import chapter4.VarArgsLesson;

public class Np {
   public static void main(String[] args) {
    VarArgsLesson val = new VarArgsLesson();
        // System.out.println(val.id1);
        // System.out.println(val.id2);
        // System.out.println(val.id3);
        System.out.println(val.id4);
   }
}

class ProtectedClassVarSample extends VarArgsLesson{
    public static void main(String[] args) {
        ProtectedClassVarSample val = new ProtectedClassVarSample();
        System.out.println(val.id3);
        System.out.println(val.id4);
    }
}
