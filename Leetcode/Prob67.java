public class Prob67{
    public String addBinary(String a, String b) { 
        BigInteger b1 = new BigInteger(a,2);
        BigInteger b2 = new BigInteger(b,2);
        BigInteger ans = b1.add(b2);

        return ans.toString(2);

        // return new java.math.BigInteger(a, 2).add(new java.math.BigInteger(b, 2)).toString(2);

    }
}