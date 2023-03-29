import java.util.*;

public class Prob2053 {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> repeated = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
                repeated.add(arr[i]);
            } else{
                set.add(arr[i]);
            }
        }

        for(int i=0; i<arr.length; i++){
            if(list.contains(arr[i])|| repeated.contains(arr[i])){
                list.remove(arr[i]);
            }
            else list.add(arr[i]);
        }
        if(list.size()>=k) return list.get(k-1);
        else return "";
    }
}
