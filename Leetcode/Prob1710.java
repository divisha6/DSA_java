public class Prob1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int[] units = new int[1001];
        for (int[] boxtype : boxTypes) {
            units[boxtype[1]] += boxtype[0];
            // we are adding to the preexisting value in the units array assuming that the
            // given 2d array might not contain all the number of boxes added already
        }
        int count = 0;
        for (int i = units.length - 1; i > 0; i--) {
            if (units[i] == 0)
                continue;

            int num = Math.min(truckSize, units[i]);
            truckSize -= num;
            count += num * i;

            if (truckSize == 0)
                break;
        }
        return count;
    }
}
