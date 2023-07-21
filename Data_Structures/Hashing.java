import java.util.HashSet;
import java.util.Iterator;

public class Hashing{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // insertion
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        System.out.println(set.size());
        System.out.println(set);

        // iterator in hash set
        Iterator it = set.iterator();
        // iterator offers 2 functions: hasNext and next
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // Search 
        if(set.contains(2)){
            System.out.println("Set contains 2");
        }
        if(!set.contains(5)){
            System.out.println("Set doesnt contain 5");
        }

        // deletion
        set.remove(3);
        if(!set.contains(3)){
            System.out.println("We deleted 3");
        }
    }
}