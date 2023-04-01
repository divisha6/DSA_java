public class Prob279 {
    public int numSquares(int n) {
        // Legendre's 3-Square Theorem
        // 4-Square theorem: Every natural no is sum of 4 squares.
        // 3-Square Theorem: Every natural no is sum of 3 squares if it does not satisfies 4^a (8b + 7) = N
        // So our answer will be 1, 2, 3 or 4.

        // Steps:
        // If it's perfect square, return 1
        // If it satisfies 4^a (8b + 7)=0, return 4
        // If it's sum of 2 perfect squares, return 2
        // Otherwise, return 3

        int sqrt = (int)Math.sqrt(n);
        if(sqrt*sqrt==n) return 1;

        while (n % 4 == 0) // 4^a (8b + 7)
		n = n / 4;

        if (n % 8 == 7)
            return 4;

        for(int i=1; i*i<=n ; i++){
            int square = i*i;
            int comp = n-square;
            int base = (int)(Math.sqrt(comp));
            if(base*base==comp) return 2;
        }
        return 3;
    }
}
