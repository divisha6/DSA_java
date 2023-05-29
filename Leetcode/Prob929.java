import java.util.*;

public class Prob929 {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<emails.length; i++){
            set.add(newMail(emails[i]));
        }
        return set.size();
    }

    public String newMail(String mail){
        String[] arr = mail.split("@");
        ArrayList<Character> list = new ArrayList<>();
        for(char c : arr[0].toCharArray()){
            if(c=='.'){
                continue;
            } else if(c=='+'){
                break;
            } else{
                list.add(c);
            }
        }
        String ans ="";
        for(int i=0; i<list.size(); i++){
            ans += list.get(i);
        }

        ans = ans + "@" + arr[1];
        return ans;
    }
}
