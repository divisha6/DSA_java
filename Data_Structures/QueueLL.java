public class QueueLL {
    static class Node{
        Node(int data){
            this.data=data;
            next=null;
        }

        int data;
        int size;
        Node next;
    }

    static class Queue{
        static Node head=null;
        static Node tail=null;

        // check if isEmpty()
        public static boolean isEmpty() {
            return head==null && tail==null;
        }
        // there will be no isFull() because LL can increase in size 

        // enqueue
        public static void add(int data) {
            Node newNode = new Node(data);

            if(isEmpty()){
                tail=head=newNode;
            }
            else{
                tail.next= newNode;
                tail = newNode;
            }
        }

        public static int remove() {
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
           
            int front = head.data;
            // condition for single element
            if(head.next==null){
                head=tail=null;
            }
            if(head==tail){
                tail=null;
            }
            
            head = head.next;
            
            return front;
        }

        // peek
        public static int peek() {
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
            
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
