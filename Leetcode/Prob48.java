public class Prob48 {
    public void rotate(int[][] matrix) {
        // first tranpose
        transpose(matrix);
        // then reverse every horizontal array in the matrix
        reverseAllRows(matrix);
    }


    public void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j<matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverseAllRows(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            int[] arr = matrix[i];
            int s = 0; int e=arr.length-1;
            while(s<e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; e--;
            }
        }
    }
}
