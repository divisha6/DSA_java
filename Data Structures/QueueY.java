public class QueueY{
    static class Queue{
        static int[] arr;
        static int size;
        static int rear=-1;

        Queue(int n){
            arr = new int[n];
            this.size = size;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            if(rear==size-1){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        public static int remove() {
            if(isEmpty()){
                System.out.println("Q is empty");
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}