import java.util.*;

public class ReverseLL {
    private int size;
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head;
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
    }   

    public void reverseIterate(){
        Node prevNode = head;
        Node current = head.next;

    }
}