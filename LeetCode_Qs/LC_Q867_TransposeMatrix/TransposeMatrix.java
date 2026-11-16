
package LC_Q867_TransposeMatrix;

import java.util.Scanner;

public class TransposeMatrix {

    public int[][] transpose(int[][] matrix) {

        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        // Original matrix
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        // New transpose matrix
        int newTotalRows = totalCols;
        int newTotalCols = totalRows;

        int[][] ans = new int[newTotalRows][newTotalCols];

        // Actual Logic
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;
    }

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter total rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter total columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display Original Matrix
        System.out.println("\nOriginal Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Create object
        TransposeMatrix obj = new TransposeMatrix();

        // Call transpose method
        int[][] result = obj.transpose(matrix);

        // Display Transpose Matrix
        System.out.println("\nTranspose Matrix:");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
