package Leetcode;

public class Two482 {
    public int[][] onesMinusZeros(int[][] grid) {
        int[][] diff = new int[grid.length][grid.length == 0 ? 0 : grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int noOfZeroesInRow = countNoOfZeroesInRow(grid, i);
            int noOfOnesInRow = grid.length - noOfZeroesInRow;
            for (int j = 0; j < grid[i].length; j++) {
                int noOfZeroesInColumn = countNoOfZeroesInColumn(grid, j);
                int noOfOnesInColumn = grid[i].length - noOfZeroesInColumn;
                diff[i][j] = noOfOnesInRow + noOfOnesInColumn - noOfZeroesInRow - noOfZeroesInColumn;
            }
        }

        return diff;
    }

    private int countNoOfZeroesInColumn(final int[][] grid, final int j) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][j] == 0) {
                count++;
            }
        }

        return count;
    }

    private int countNoOfZeroesInRow(final int[][] grid, final int i) {
        int count = 0;
        for (int j = 0; j < grid[i].length; j++) {
            if (grid[i][j] == 0) {
                count++;
            }
        }

        return count;
    }

    public int[][] onesMinusZerosTLEFixed(int[][] grid) {
        int[] rowOnes = new int[grid.length];
        int[] colOnes = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                rowOnes[i] += grid[i][j];
                colOnes[j] += grid[i][j];
            }
        }
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                grid[i][j] = 2 * (rowOnes[i] + colOnes[j]) - grid.length - grid[0].length;
            }
        }

        return grid;
    }
}
