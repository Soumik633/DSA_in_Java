package LC_Q48_RotateImage;

import java.util.Scanner;

public class RotateImageBy90 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (in-place)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int row = 0; row < n; row++) {
            int startCol = 0; 
            int endCol = n - 1;

            while (startCol < endCol) {
                // Swap elements of the row
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;

                startCol++;
                endCol--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of matrix (n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // User input
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Rotate the matrix
        RotateImageBy90 obj = new RotateImageBy90();
        obj.rotate(matrix);

        // Display rotated matrix
        System.out.println("\nMatrix after 90-degree clockwise rotation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}