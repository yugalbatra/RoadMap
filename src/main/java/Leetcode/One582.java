package Leetcode;

public class One582 {

    public int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            int index = checkRow(mat, i);

            if (index == -1) {
                continue;
            }

            if (checkColumn(mat, i, index)) {
                count++;
            }
        }

        return count;
    }

    private boolean checkColumn(final int[][] mat, final int i, final int j) {
        for (int k = 0; k < mat.length; k++) {
            if (k != i && mat[k][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private int checkRow(final int[][] mat, final int i) {
        boolean foundOne = false;
        int index = -1;
        for (int j = 0; j < mat[i].length; j++) {
            if (mat[i][j] == 1) {
                if (foundOne) {
                    return -1;
                }
                else {
                    foundOne = true;
                    index = j;
                }
            }
        }

        return index;
    }

    public static void main(String[] args) {
        One582 one582 = new One582();
        System.out.println(one582.numSpecial(new int[][] {
            { 1, 0, 0 },
            { 0, 0, 1 },
            { 1, 0, 0 }
        }));
    }
}
