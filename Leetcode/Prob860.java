public class Prob860 {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int i=0; i<bills.length ; i++){
            if(bills[i]==5){
                five += 5;
            }

            if(bills[i]==10){
                if(five>=5){
                    ten += 10;
                    five-=5;
                    }
                else{
                    return false;
                }
            }
            
            if(bills[i]==20){
                if(ten>=10 && five >= 5){
                    ten -= 10;
                    five -= 5;
                }
                else if (five>=15 && ten ==0){
                    five-=15;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
