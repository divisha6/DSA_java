public class Prob1287 {
    public int findSpecialInteger(int[] arr) {
        int max=-1;
        int result=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i :arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            max= Math.max(max,map.get(i));
        }
        for(int i : map.keySet()){
            if(map.get(i)==max){
                result = i;
            }
        }
        return result;
    }
}
