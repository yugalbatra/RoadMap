package TwoDArray;

import java.util.Arrays;

public class SetMatrixZero {

    public void makeRowZero(int[][] matrix, int row) {
//        Arrays.fill(matrix[row], 0);
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = 0;
        }
    }

    public void makeColumnZero(int[][] matrix, int col) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {
        boolean[][] isZero = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    isZero[i][j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isZero[i][j]) {
                    makeRowZero(matrix, i);
                    makeColumnZero(matrix, j);
                }
            }
        }
    }
}
