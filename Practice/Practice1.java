package Practice;

import java.util.*;

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
