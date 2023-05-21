package Placement;

import java.util.*;

public class FunWithAnagrams {
    public static void main(String[] args) {
        String[] arr = {"does", "odes", "sode", "frame", "framer"};
        System.out.println(anagram(arr));
    }

    public static String anagram(String[] arr){
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for(int i=0; i<arr[0].length(); i++){
            list1.add(arr[0].charAt(i));
        }

        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr[i].length(); j++){
                list2.add(arr[i].charAt(j));
            }
            if(list1!=list2) ans.add(arr[i]);
            list1 = list2;
            list2.clear();
        }
        
        String[] res= new String[ans.size()];
        for(int i=0; i<ans.size(); i++){
            res[i]=ans.get(i);
        }
        return res.toString();
    }
}
