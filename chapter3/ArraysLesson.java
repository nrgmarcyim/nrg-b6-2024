package chapter3;

import java.util.*;

public class ArraysLesson {
    public static void main(String... args) {
        int[] numbers1 = new int[3];
        numbers1[0]=3;
        numbers1[1]=73;
        numbers1[2]=1354;
        
        int[] numbers2 ={33,4,5};
        System.out.println();
        char[] name = {'m','a','r','c','o'};
        int [] ids,types;
        int colorIds[], typeId;
        String [] bugs = { "cricket", "beetle", "ladybug" };
        bugs[2]="roach";
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString());
        // ********
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        // againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        // objects[0] = new StringBuilder(); // careful!
        System.out.println(bugs[2]);

        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        // for (int i = 0; i < numbers.length; i++)
        //     System.out.print (numbers[i] + " ");
        for(int number:numbers)
            System.out.println(number);
        int[][][] numbers3 = {
            {{1,2,3},{4,5,6},{0}},//0
            {{4,5}} //1
        };
        System.out.println(numbers3[0][1][1]);
        System.out.println("*********************");
        
        String[] strings1 = { "10","12","45", "9", "100","11","78" ,"11", "19","23013","900","1200000"};
        // char[] strings1 = { '1','9','0','5','3','6'};
        Arrays.sort(strings1);
        for (String string : strings1)
        System.out.println(string + " ");
        int[] numbers4 = { 1, 3, 5,7,9,13 };
        Arrays.sort(numbers4);
        System.out.println("**********************");
        System.out.println(Arrays.binarySearch(numbers4, 110));
        int[][] differentSize = {{1, 4}, {3}, {9,8,7}};
        int[][][] differentSize2 = {{{1, 4},{33},{21,3,5}}, {{3}}, {{9,8,7}}};
        System.out.println(differentSize[2][1]);
        System.out.println(differentSize2[0][2][2]);
        String [] rectangle = new String[3];//{null,null,null,"Hello"}
        rectangle[3] = "Hello";
        System.out.println(rectangle[3]);
    }    
}
