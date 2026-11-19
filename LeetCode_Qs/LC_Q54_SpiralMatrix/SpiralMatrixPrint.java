
package LC_Q54_SpiralMatrix;

import java.util.*;

public class SpiralMatrixPrint {

    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int startingRow = 0;
        int endingRow = m - 1;
        int startingCol = 0;
        int endingCol = n - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {

            // Left to Right
            for (int i = startingCol; i <= endingCol; i++) {
                ans.add(matrix[startingRow][i]);
            }
            startingRow++;

            // Top to Bottom
            for (int i = startingRow; i <= endingRow; i++) {
                ans.add(matrix[i][endingCol]);
            }
            endingCol--;

            // Right to Left
            if (startingRow <= endingRow) {
                for (int i = endingCol; i >= startingCol; i--) {
                    ans.add(matrix[endingRow][i]);
                }
                endingRow--;
            }

            // Bottom to Top
            if (startingCol <= endingCol) {
                for (int i = endingRow; i >= startingRow; i--) {
                    ans.add(matrix[i][startingCol]);
                }
                startingCol++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();

        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        SpiralMatrixPrint obj = new SpiralMatrixPrint();

        System.out.println("Spiral Order: " + obj.spiralOrder(matrix));

        sc.close();
    }
}
