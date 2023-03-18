public class Prob12 {
    public String intToRoman(int num) {
        String[] ones= {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] tens= {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
        String[] hund= {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] thous= {"", "M", "MM", "MMM", "MMMM"};

        String ans = thous[(num/1000)] + hund[(num/100)%10] + tens[(num/10)%10] + ones[num%10];
        return ans;
    }
}
