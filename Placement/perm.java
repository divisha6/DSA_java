public class perm {
    public static String nextPermutation(String word) {
        char[] A = word.toCharArray();
        if(A == null || A.length <= 1) return "x";
            int i = A.length - 2;
            while(i >= 0 && A[i] >= A[i + 1]) i--; 
            if(i >= 0) {                           
                int j = A.length - 1;              
                while(A[j] <= A[i]) j--;      
                // swap(A, i, j);                     
            }
            return reverse(A, i + 1, A.length - 1);
        }

    
        public static String reverse(char[] A, int i, int j) {
            while(i < j){
                char tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
                i++;
                j--;
        }

            String str = new String(A);
            return str;
        }

        public static void main(String[] args) {
            String word = "baca";
            System.out.println(nextPermutation(word));
        }
}
