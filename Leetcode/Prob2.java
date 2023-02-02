public class Prob2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;
        int carry =0;
        while(l1 != null || l2 != null || carry==1 ){
        int sum =0;
        
            if(l1 != null){
                // sum added l1 val
                sum += l1.val;
                // next node called 
                l1 = l1.next;
            }

            if(l2 != null){
                // sum added l2 val
                sum += l2.val;
                // next node called 
                l2 = l2.next;
            }

            sum += carry;
            carry = sum/10;

            ListNode nextNode = new ListNode(sum%10);
            curr.next = nextNode;
            curr = curr.next;      
        }

        return ans.next;
    }
}
