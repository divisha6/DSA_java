import java.util.*;

public class Prob1436 {
    public String destCity(List<List<String>> paths) {
        ArrayList<String> destinations = new ArrayList<>();
        // HashSet<String> departure = new HashSet<>();
        for(List<String> path: paths){
            String B = path.get(1);
            destinations.add(B);
        }

        for(List<String> path: paths){
            String A = path.get(0);
            if(destinations.contains(A)){
                destinations.remove(destinations.indexOf(A));
            }
        }
        return destinations.get(0);
    }
}
