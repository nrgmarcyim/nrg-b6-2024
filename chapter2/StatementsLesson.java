package chapter2;

public class StatementsLesson {
    static boolean getScore(){
        return true;
    }
    public static void main(String[] args) {
        int hourOfDay = 17;
        if(hourOfDay<11)
            System.out.println("Good Morning");
        System.out.println("Welcome to Java NC III");
        int grades = 75;
        if(grades<=67)
            System.out.println("passed");
        else
            System.out.println("F!");
        int counter = 0;
        float l = 90f;
        char option = 'z';
        switch(option){
            
            case 'a': System.out.println("Option a is selected");
                        counter++; 
                    break;
            default: System.out.println("invalid option");break;
            case 'b': System.out.println("Option b is selected");break;
            case 'c': System.out.println("Option c is selected");break;
            
        }
    }
}
