public class Prob989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
         int len = num.length-1;
         while(len >= 0 || k != 0){
             if(len >= 0){
                 k += num[len];
                 len--;
             }
             ans.addFirst(k % 10);
             k = k/10;
         }     
         return ans;
     }
}
