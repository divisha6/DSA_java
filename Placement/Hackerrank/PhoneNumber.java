package Hackerrank;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber {
    public static void main(String[] args) {
        String s = "five eight double two double two four eight";
        System.out.println(convert(s));
    }

    public static String convert(String s) {
        HashMap<String, Character> map = new HashMap<>();
        map.put("one", '1');
        map.put("two", '2');
        map.put("three", '3');
        map.put("four", '4');
        map.put("five", '5');
        map.put("six", '6');
        map.put("seven", '7');
        map.put("eight", '8');
        map.put("nine", '9');
        map.put("zero", '0');

        String[] arr = s.split(" ");
        // String ans = "";
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            String currString = arr[i];
            // char currInt = '';
            if (currString.equals("double")) {
                count = 2;
                currString = arr[++i];
                // i++;
            } else if (currString.equals("triple")) {
                count = 3;
                currString = arr[++i];
                // i++;
            } else{
                count = 1;

            }
            // else currInt = map.get(currString);
            while (count > 0) {
                ans.append(map.get(currString)) ;
                count--;
            }
        }
        return ans.toString();
    }
}
