package Practice;

import java.util.*;

import chapter4.MethodsLesson;

public class Practice1 {
    
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter a number: ");
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        N.close();
        for(int i = 1;i<=n;i++){
            // Take an integer input N from the user.
            // Use a for loop to sum the numbers from 1 to N.
            // Print the sum at the end.
            
            sum +=i;
        }
        System.out.println(sum);
    }
    
}
class Practice2{
    public static void main(String[] args) {
//Take an integer input N from the user (the number of terms).
        int first=0;
        int second=1;
        int third =0;
        int count=0;
        System.out.println("Enter a number: ");
        Scanner N = new Scanner(System.in);
        int n = N.nextInt();
        N.close();
        do{
// Use a do-while loop to generate and print the Fibonacci 
//sequence up to N terms.          
            System.out.println(first);
            third = first+second;
            first=second;
            second=third;
            count++;  
        }while(count<n);


    }
    // Input: 7
    // Output: 0, 1, 1, 2, 3, 5, 8
}


class Practice3{
    public static void main(String[] args) {
        System.out.print("Enter a Word: ");
        // Take a string input from the user.
        Scanner word = new Scanner(System.in);
        String wordString = word.next();
        String wordRev ="";
        // Use a for loop to reverse the string.
        for(int i = (wordString.length()-1);i>=0;i--){
            wordRev+=wordString.charAt(i);
        }
        // Print the reversed string.
        System.out.println(wordRev);
    }
    
        
}
class Practice4{
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        // System.out.println(a==b);
        Scanner y = new Scanner(System.in);
        System.out.println("Enter 1st word");
        a = y.nextLine();
        System.out.println("Enter 2nd word");
        b= y.nextLine();
        System.out.println(a.equals(b));
        System.out.println();
    }
}
class Practice5{
    public static void main(String[] args) {
        MethodsLesson ml2 = new MethodsLesson();
        // System.out.println(ml2.sum(100, 900));
    }
}
class Practice6{
//     Input: nums = [3,2,2,3], val = 3
//     Output: 2, nums = [2,2,_,_]
    int removeElement(int[] nums,int val){
        // what?
        return 0;
    }
    public static void main(String[] args) {
        Practice6 p6 = new Practice6();
        int [] nums = {3,2,2,3};
        p6.removeElement(nums, 3);
    }
}
class Practice7{
    float getGradeAverage(float... grades){
        float sum = 0;
        for(float grade:grades)
            sum+=grade;
        return sum/grades.length;
        
    }
    String threeNumbers(int a,int b,int c){
        ArrayList nums = new ArrayList<>();
        nums.add(a);nums.add(b);nums.add(c);
        return ((Integer.compare(a, b))==0 && (Integer.compare(b, c)==0))?"All numbers are equal":"the largest intger is  "+Collections.max(nums); 

    }
    public static void main(String[] args) {
        Practice7 p7 = new Practice7();
        float grades[] = {90,89,87,91,78,85,81};
        System.out.println(p7.getGradeAverage(grades));
        System.out.println(p7.threeNumbers(3,3,3));
    }
}
