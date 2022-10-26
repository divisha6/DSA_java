public class Patterns {
    public static void main(String[] args) {
        triangle(5, 0);
    }

    public static void helper(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            helper(row, col + 1);
        } else {
            System.out.println();
            helper(row - 1, 0);
        }
    }

    public static void triangle(int row , int col ){
        if (row == 0) {
            return;
        }
        if (col < row) {
            triangle(row, col + 1);
            System.out.print("* ");
        } else {
            triangle(row - 1, 0);
            System.out.println();
        }
    }


}
