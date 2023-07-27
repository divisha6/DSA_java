package Data_Structures;

import java.util.*;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // this is done because Queue is an interface and not a class in java
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
    }
}
}
