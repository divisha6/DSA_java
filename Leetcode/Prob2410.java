import java.util.*;

public class Prob2410 {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int p=0; // iterator for players array
        int t=0; // iterator for trainers array
        Arrays.sort(players);
        Arrays.sort(trainers);
        int count=0;
        while(p<players.length || t<trainers.length){
            if(players[p]<=trainers[t]) {
                count++;
                p++; t++;
            } else if(players[p]>trainers[t]){
                t++;
            }

            if(t>=trainers.length || p>= players.length) return count;

        }
        return count;
    }
}
