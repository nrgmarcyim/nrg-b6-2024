package chapter4;

public class VarArgsLesson {
    
    private int id1 = 3123;
    int id2 = 123;
    protected int id3 = 595467;
    public int id4 = 4562;

    float getGradeAverage(int a,float... grades){
        float sum = 0;
        for(float grade:grades)
            sum+=grade;
        return sum/grades.length;
    }
    public static void main(String[] args) {
        VarArgsLesson val = new VarArgsLesson();
        float grades[] = {90,89,87,91,78,85,81};
        System.out.println(val.getGradeAverage(90,89,87,91,78,85,81,78,93,88));
        System.out.println(val.getGradeAverage(89,89,98));
        System.out.println(val.id1);
        System.out.println(val.id2);
        System.out.println(val.id3);
        System.out.println(val.id4);
    }
}
