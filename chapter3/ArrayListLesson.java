package chapter3;
import java.util.*;

public class ArrayListLesson {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList(10);
        list2.add("a");
        list2.add(300);
        list2.add(true);
        ArrayList list3 = new ArrayList(list2);
        list3.add('c');
        System.out.println(list2==list3);
        System.out.println(list2.equals(list3));
        ArrayList<String> list5 = new ArrayList<>();
        List<String> birds = new ArrayList<>();
        System.out.println(birds.add("hawk")); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        birds.add(4, "love bird");
        birds.add("pigeon"); 
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds.remove(4));
        System.out.println(birds.remove("pigeon"));
        birds.get(0);
        //Wrapper class
        Integer.parseInt("300");
        Integer.valueOf("30000");
        int p = Integer.valueOf(300);
        System.out.println(p);
        List numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2);
        numbers.remove(1);
        System.out.println(numbers);
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(99);
        numbers2.add(5);
        numbers2.add(81);
        Collections.shuffle(numbers2); //sort,reverse,shuffle
        System.out.println(numbers2); 
        Random r = new Random();
        List<Integer> numbers3 = new ArrayList<>();
        for(int x=1; x <=50;x++)
            numbers3.add(x);
        Collections.shuffle(numbers3);
        List<Integer> winningNumbers = new ArrayList<>();
        for(Integer num:numbers3){
            winningNumbers.add(num);
            if(winningNumbers.size()==6){
                break;
            }
        }
        Collections.sort(winningNumbers);
        System.out.println(winningNumbers);
        
        
    }    
}
