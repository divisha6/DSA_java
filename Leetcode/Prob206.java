public class Prob206 {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode prev= null;
        ListNode curr= head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next= prev;
            prev=curr;
            curr= next;
        }
        return prev;
    }
}
