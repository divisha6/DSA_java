package Coding_Ninjas;

import java.util.HashSet;

public class SubarraysWithSumS {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.    
        int sum=0;
        int count =0;
        HashSet<Integer> set = new HashSet<>();
            for(int j=0; j<arr.length; j++){
                sum+=arr[j];
                if(sum==s){
                    count++;
                }
                set.add(sum);
                if(set.contains(sum-s)){
                    count++;
                }
        }
        return count;
    }
}
