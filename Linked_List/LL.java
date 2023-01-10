public class LL {
    Node head;
    private int size;

    LL(){
        this.size=0;
    }

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
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

    // delete first
    public void deleteFirst(){
        if(head== null){
            System.out.println("the list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast(){
        if(head== null){
            System.out.println("the list is empty");
            return;
        }

        size--;
        if(head.next == null){
            head= null;
            return;
        }

        Node secondLast = head;
        Node newNode = head.next;

        while(newNode.next != null){
            newNode = newNode.next;
            secondLast= secondLast.next;
        }
        secondLast.next= null;
    }

    // gettinh size of LL
    public int getSize(){
        return size;
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
        System.out.println();

        list.deleteFirst();
        list.deleteLast();
        list.printingLL();
        System.out.println();

        System.out.println(list.getSize());
    }
}