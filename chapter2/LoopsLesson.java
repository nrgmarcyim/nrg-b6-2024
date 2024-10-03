package chapter2;

public class LoopsLesson {
    public static void main(String[] args) {
        int w=0;
        while(w<9)
            System.out.println("w="+ w++);
        System.out.println();   
        do
            System.out.println("do w="+ w--);
        while(w>0);
        
        for(int x = 0;x<10;x++)
            System.out.println("x = "+x);
    }
}
