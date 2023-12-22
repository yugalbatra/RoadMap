package TwoDArray;

public class DiagonalTraversal {

    public static void main(String[] args) {
        DiagonalTraversal dt = new DiagonalTraversal();
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ints = dt.findDiagonalOrder(mat);
        for (int i : ints) System.out.println(i);
    }

    public boolean valid(int i, int j, int maxI, int maxJ) {
        return i >= 0 && i < maxI && j >= 0 && j < maxJ;
    }

    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0) return new int[0];
        int[] diagonalTraversal = new int[mat.length * mat[0].length];
        int k = 0;
        boolean downSide = true;
        for (int i = 0, j = 0; i != mat.length - 1 || j != mat[0].length - 1; ) {
            while (valid(i, j, mat.length, mat[0].length)) {
                diagonalTraversal[k++] = mat[i][j];
                if (downSide) {
                    if (valid(i - 1, j + 1, mat.length, mat[0].length)) {
                        i--;
                        j++;
                    } else break;
                } else {
                    if (valid(i + 1, j - 1, mat.length, mat[0].length)) {
                        j--;
                        i++;
                    } else break;
                }
            }
            if (j == mat[0].length - 1) i++;
            else if (i == mat.length - 1) j++;
            else if (i == 0) j++;
            else if (j == 0) i++;
            downSide = !downSide;
        }
        diagonalTraversal[k] = mat[mat.length - 1][mat[0].length - 1];
        return diagonalTraversal;
    }

    public int[] findDiagonalOrderWithOtherApproach(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int i = 0, j = 0, m = matrix.length, n = matrix[0].length;
        int[] diagonalTraversal = new int[m * n];
        for (int k = 0; k < diagonalTraversal.length; k++) {
            diagonalTraversal[k] = matrix[i][j];
            if ((i + j) % 2 == 0) {
                if (j == n - 1) i++;
                else if (i == 0) j++;
                else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) j++;
                else if (j == 0) i++;
                else {
                    i++;
                    j--;
                }
            }
        }
        return diagonalTraversal;
    }
}
