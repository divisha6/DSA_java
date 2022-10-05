import java.util.*;
//ArrayList is a kind of array which does not have a fixed size./**

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> name= new ArrayList<>(10);
        Scanner scan= new Scanner(System.in);

        for(int i=0; i<10; i++){
            name.add(scan.nextInt());
        }
        System.out.println(name);

        //contains gives true or false depending on whther the arraylist contains it or now
    }
}
