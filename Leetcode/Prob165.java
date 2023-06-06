public class Prob165 {
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
        String[] arr2 = version2.split("\\.");
        int i=0;

        for(i=0; i<Math.min(arr1.length, arr2.length); i++){
            int m = Integer.parseInt(arr1[i]);
            int n = Integer.parseInt(arr2[i]);
            if(m>n){
                return 1;
            } else if(m<n){
                return -1;
            }
        }

        while(i<Math.max(arr1.length, arr2.length)){
            if(i<arr1.length){
            if(Integer.parseInt(arr1[i])!=0){
                return 1;
            }
        } else if(i<arr2.length){
            if(Integer.parseInt(arr2[i])!=0){
                return -1;
            }
        }
            i++;
        }

        return 0;
    }
}
