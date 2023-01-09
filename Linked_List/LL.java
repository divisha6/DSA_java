public class LL {
    Node head;

    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add in linked list
    public void addFirst(String data){
        Node newNode = new Node(data);
        // LL does not exist
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head= newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        // LL does not exist
        if(head == null){
            head = newNode;
            return;
        }

        // traversal and addition to last
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // printing a linked list
    public void printingLL(){
        if(head == null){
            System.out.println("list is empty");
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("my");
        list.addLast("Divisha");
        list.printingLL();
    }
}