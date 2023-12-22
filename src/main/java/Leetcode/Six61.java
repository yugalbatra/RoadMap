package Leetcode;

public class Six61 {
    public int[][] imageSmoother(final int[][] img) {
        int m = img.length, n = m == 0 ? 0 : img[0].length;
        int[][] averageArray = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                averageArray[i][j] = calculateAverage(img, i, j, m, n);
            }
        }

        return averageArray;
    }

    private int calculateAverage(final int[][] img, final int i, final int j, final int m, final int n) {
        int sum = 0, count = 0;
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                if (validIndices(img, m, n, i + k, j + l)) {
                    sum += img[i + k][j + l];
                    count += 1;
                }
            }
        }
        return sum / count;
    }

    private boolean validIndices(int[][] img, int m, int n, int i, int j) {
        return i >= 0 && i < m && j >= 0 && j < n;
    }
}
