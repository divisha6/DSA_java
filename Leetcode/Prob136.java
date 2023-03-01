public class Prob136 {
    public int singleNumber(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length ; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            } else{
                list.remove(Integer.valueOf(nums[i]));
            }
        }
        return list.get(0);
    } 
}
