public class Prob2095 {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null){
            return head;
        }

        if(head.next==null) return null;

        int size=0;
        ListNode currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            size++;
        }

        int i=0;
        ListNode prev = head;
        int k = size%2==0 ? size/2-1 : size/2;
        while(i<k){
        i++;
        prev = prev.next;
        }

        prev.next= prev.next.next;
        return head;
    }
}
