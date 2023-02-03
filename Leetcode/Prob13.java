public class Prob13 {
    public int romanToInt(String s) {
        int sum =0;
        int num=0;
        int prev=0;
        for(int i=s.length()-1; i>=0; i--){
            switch (s.charAt(i)) {
                case 'M': num = 1000;  break;
                case 'D':  num = 500;  break;
                case 'C':  num = 100;  break;
                case 'L':   num = 50;  break;
                case 'X':   num = 10;  break;
                case 'V':    num = 5;  break;
                case 'I':    num = 1;  break;
        }
        if(prev>num){
            sum -= num;
        }
        else{
            sum += num;
        }
        prev=num;
    }
    return sum;
}
}
