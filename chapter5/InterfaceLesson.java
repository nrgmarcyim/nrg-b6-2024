package chapter5;

public class InterfaceLesson {
    
}
abstract interface CanBurrow {
    public static final int MINIMUM_DEPTH = 2;
    public abstract int getMaximumDepth();
}

interface CanBurrow2 {
    int MINIMUM_DEPTH = 2;
    int getMaximumDepth();
    default public int getHouseNumber() {
        return 1;
    }
    static int getBurrowDepth(){
        return 1;
    }
}
