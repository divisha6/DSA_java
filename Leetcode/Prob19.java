public class Prob19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        
           // size
        int size=0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        if(n==size){
            return head.next;
        }

       // previous node to the target node so that we can delete the next node of the previous node
        int indexToSearch= size-n;
        ListNode prev=head;
        int i=1;
       while(i<indexToSearch){
           prev= prev.next;
           i++;
       }

       // actual deletion
       prev.next = prev.next.next;
       return head;

   }
}
