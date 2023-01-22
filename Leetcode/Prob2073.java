public class Prob2073 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        while(tickets[k]!=0){
            for(int i=0; i<tickets.length; i++){
            if(tickets[i]>0){
                tickets[i]--;
                time++;
            }

            if(i==k && tickets[k]==0){
            break;
        }
        }
        }
        return time;
    }
}
