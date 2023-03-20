public class Prob605{
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int plants=0;
        if(n==0){
            return true;
        }

        if(flowerbed.length==1){
            if(flowerbed[0]==0){
                return true;
            } else{
                return false;
            }
        }
        if(n>= flowerbed.length){ return false; }
        if(flowerbed[0]==0 && flowerbed[1]==0){
            plants++;
            flowerbed[0]=1;
        }

        for(int i=1; i<flowerbed.length-1; i++){
            if(flowerbed[i]==0){
                if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    plants++;
                }
            }
        }

        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            plants++;
            flowerbed[flowerbed.length-1]=1;
        }

        if(plants>=n){
            return true;
        }
        return false;
    }
}