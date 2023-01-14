public class Prob234 {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        
        ListNode mid = findMiddleHead(head);
        ListNode start2 = reverse(mid.next);

        ListNode start1 = head;
        while(start2 != null){
            if(start2.val != start1.val){
                return false;
            }
            start1 = start1.next;
            start2= start2.next; 
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode prev= null;
        ListNode curr = head;

        while(curr != null){
            ListNode next= curr.next;
            curr.next = prev;
            prev= curr;
            curr= next;
        }
    return prev;
    }

    public ListNode findMiddleHead(ListNode head){
        ListNode hare= head;
        ListNode turtle= head;

        while(hare.next != null && hare.next.next != null){
            hare= hare.next.next;
            turtle= turtle.next;
        }
        return turtle;
    }
}

