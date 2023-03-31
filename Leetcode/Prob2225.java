import java.util.*;

public class Prob2225 {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> loses = new HashMap<>();
        HashSet<Integer> teams = new HashSet<>();
        for(int i=0; i<matches.length; i++){
            loses.put(matches[i][1], loses.getOrDefault(matches[i][1],0)+1);
            teams.add(matches[i][1]);
            teams.add(matches[i][0]);
        }

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();
        List<Integer> noLoss = new ArrayList<>();

        for(int team: teams){
            if(!loses.containsKey(team)){
                noLoss.add(team);
            }

            if(loses.containsKey(team) && loses.get(team)==1){
                oneLoss.add(team);
            }
        }
        
        Collections.sort(noLoss);
        Collections.sort(oneLoss);
        list.add(noLoss);
        list.add(oneLoss);

        return list;
    }
}
