public class Prob876 {
    public ListNode middleNode(ListNode head) {
        if(head==null){
            return head;
        }

        int size=0;
        ListNode currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
            size++;
        }

        int i=0;
        int k = size%2==0 ? size/2-1 : size/2;
        while(i<=k){
        if(head== null){
            return head;
        }
        i++;
        head = head.next;
        }
        return head;

    }
}
