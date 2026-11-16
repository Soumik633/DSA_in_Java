package GFG_SumOfRowEelemets;

import java.util.Scanner;

public class SumOfRowEelemets {

    public static int[] rowSum(int mat[][]) {

        // For row length
        int m = mat.length;

        // For column length
        int n = mat[0].length;

        // Result array
        int[] ans = new int[m];

        for (int row = 0; row < m; row++) {
            int sum = 0;

            for (int cols = 0; cols < n; cols++) {
                int value = mat[row][cols];
                sum = sum + value;
            }

            ans[row] = sum;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        // Create matrix
        int mat[][] = new int[m][n];

        // Input matrix elements
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Calculate row sums
        int ans[] = rowSum(mat);

        // Display result
        System.out.println("Sum of each row:");

        for (int i = 0; i < ans.length; i++) {
            System.out.println("Row " + (i + 1) + " = " + ans[i]);
        }

        sc.close();
    }
}
