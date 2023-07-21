public class CircularQueue {
    static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;
        static int front = -1;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
 

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1)%size == front;
        }

        // enqueue
        public static void add(int data) {
            if(isFull()){
                System.out.println("full queue");
                return;
            }

            if(front ==-1){
                front=0;
            }

            rear= (rear+1)%size;
            arr[rear]=data;
        }

        public static int remove() {
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
            int result = arr[front];
            // condition for single element
            if(front==rear){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
            
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(56);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
