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

        String[] colors = {"red","pink","green","white", "black","yellow"};
        for(String color: colors)
            System.out.println(color + ", ");

OUTER_LOOP:        for(int i=1; i<=10;i++){
INNER_LOOP:             for(int j = 1; j<=10;j++){
                            if(j==9)
                                continue INNER_LOOP;
                            
                            if(i==7)
                                break INNER_LOOP;
                            System.out.print(i*j+" ");
                        }
                        
                        System.out.println();
                    }
    }
}
