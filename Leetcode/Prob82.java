public class Prob82 {
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> repeated = new HashSet<>();
        ListNode curr = head;
        while(curr!= null){
            if(!list.contains(curr.val) && !repeated.contains(curr.val)) {
                list.add(curr.val);
                } else if(list.contains(curr.val)) {
                list.remove(list.lastIndexOf(curr.val));
                repeated.add(curr.val);
            }

            curr = curr.next;
        }

        ListNode ans = new ListNode();
        for(int i=0; i<list.size(); i++){
            ListNode newNode = new ListNode(list.get(i));
            if(ans == null){
                ans = newNode;
                break;
            }
            ListNode currNode = ans;
            while(currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
        ans = ans.next;
        return ans;
       
    }
}
