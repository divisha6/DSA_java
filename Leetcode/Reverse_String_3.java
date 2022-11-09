import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

class Reverse_String_3 {
    public void main(String[] args) {
        String s= "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public String reverse(char[] solution) {
        int x= solution.length-1;
        int y = 0;

        while (y<=x) {
            char temp = solution[y];
            solution[y]= solution[x];
            solution[x]= temp;
           x--;
            y++;
        }
         String string = new String(solution);
        return string;
}


public String reverseWords (String s){
    
    String result = "";
    char[] ind = s.toCharArray();
    for (int i = 0; i < ind.length; i++) {
        int x= 0;
        if(ind[i]==0){
            result = result + reverse(Arrays.copyOfRange(ind, x, i-1));
            x=i+1;
            break;
        }
        else{
            i++;
            
        }
    }
    return result;    
}

}