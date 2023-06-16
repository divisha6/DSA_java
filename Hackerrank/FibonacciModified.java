import java.io.*;
import java.math.*;

class Result {

    /*
     * Complete the 'fibonacciModified' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     * 1. INTEGER t1
     * 2. INTEGER t2
     * 3. INTEGER n
     */

    public static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        // Write your code here

        BigInteger t3 = new BigInteger("1");

        for (int i = 1; i <= n - 2; i++) {

            t3 = t1.add(t2.multiply(t2));
            t1 = t2;
            t2 = t3;
        }
        return t3;

    }
}

public class FibonacciModified {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int t1 = Integer.parseInt(firstMultipleInput[0]);
        BigInteger T1 = BigInteger.valueOf(t1);

        int t2 = Integer.parseInt(firstMultipleInput[1]);
        BigInteger T2 = BigInteger.valueOf(t2);

        int n = Integer.parseInt(firstMultipleInput[2]);

        BigInteger result = Result.fibonacciModified(T1, T2, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}