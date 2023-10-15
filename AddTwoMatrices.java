//Exercise 6: A program that adds two matrices of the same size
public class AddTwoMatrices {
    public static void main(String[] args) {
        //Create two constant matrices
        int[][] matrix1 = { {9, 3, 7}, {4, 2, 8}, {3, 12, 0} };
        int[][] matrix2 = { {15, 16, 17}, {1, 3, 9}, {12, 17, 6} };

        //Create two variables to store number of rows and columns
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        //Create a variable to store sum of two corresponding elements of two matrices
        int[][] sum = new int[rows][columns];

        //Calculate the sum
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the sum matrix
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}