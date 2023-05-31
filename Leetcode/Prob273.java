public class Prob273{
    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
        String[] o= {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if(num==1000 || num==2000 || num==3000 || num==4000 || num==5000 || num==6000 || num==7000 || num==8000 || num==9000 || num==10000){
            return (ones[num/1000] + " " + "Thousand").trim();
        }

        String temp = Integer.toString(num);
        int[] arr = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            arr[i] = temp.charAt(i) - '0';
        }

        if(num==11000 || num==12000 || num==13000 || num==14000 || num==15000 || num==16000 || num==17000 || num==18000 || num==19000){
            return (o[arr[1]] + " " + "Thousand").trim();
        }

        int len = temp.length();
        String ans = ""; int counter=2;
        if(len==1){
            return ones[num];
        }
        if(arr[len-2]==1) {
            ans = o[arr[len-1]];
        } else{
            ans = tens[arr[len-2]] + " " + ones[arr[len-1]];
            
        }

        String[] numbers = {"", "", "Hundred", "Thousand", "", "Hundred", "Million", "", "Hundred", "Billion"};

        for(int i=len-3; i>=0; i--){
            if((counter==2|| counter==5 || counter==8) && arr[i]!=0){
                ans = ones[arr[i]] + " " + numbers[counter] + " " + ans.trim();
            } 
            
            else if((counter==3 || counter==6)){
                if(len>counter+1 && arr[i-1]==1 ){
                    ans = o[arr[i]] + " " + numbers[counter] +  " " + ans.trim();
                }
                else if(len>counter+1 && arr[i-1]==1 && arr[i]==0){
                    ans = ones[arr[i]] + " " + numbers[counter] +  " " + ans.trim();
                } else if(len>counter+2 && arr[i-2]==0 && arr[i-1]==0 && arr[i]==0){
                    ans = ones[arr[i]] + " "  + ans.trim() ;
                } else{
                    ans = ones[arr[i]] + " " + numbers[counter] + " " + ans.trim() ;
                }
            } 
            
            else if((counter==4 || counter==7) && arr[i]!=1 ){
                if(arr[i]!=0){
                    ans = tens[arr[i]] + " " + ans.trim();
                } else{
                    ans = ones[arr[i]] + " " + ans.trim();
                }
            } 
            
            else if(counter==9 && arr[i]!=0){
                ans = ones[arr[i]] + " " + numbers[counter] + " " + ans.trim();
            }

            counter++;
        }
        return ans.trim();
    }
}