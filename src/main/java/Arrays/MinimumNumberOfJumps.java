package Arrays;

public class MinimumNumberOfJumps {

    public static void main(String[] args) {
        System.out.println(minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
    }

    public static int minJumps(int[] arr) {
        int n = arr.length;
        int noOfJumps = 1;
        for (int i = 0; i < n; ) {
            if (arr[i] == 0) break;
            int max = 0;
            if (i + arr[i] >= n - 1) return noOfJumps;
            int index = i;
            for (int j = i + 1; j <= i + arr[i] && j < n; j++) {
                if (j + arr[j] > max) {
                    max = j + arr[j];
                    index = j;
                }
            }
            i = index;
            noOfJumps++;
            if (max >= n) return noOfJumps;
        }
        return -1;
    }
}
