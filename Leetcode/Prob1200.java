public class Prob1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int diff = arr[i+1]-arr[i];
            if(diff==min){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }

            if(diff<min){
                min=diff;
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return ans;
    }
}
