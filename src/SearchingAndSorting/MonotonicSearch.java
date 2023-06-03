package SearchingAndSorting;

public class MonotonicSearch {

    public int calculateFunction(int a, int b, int c, int n) {
        return (int) ((a * n) + (b * n * Math.log(n)) + (c * Math.pow(n, 3)));
    }

    public int findPosition(int a, int b, int c, int k) {
        int s = 0, e = k, m;
        while (s <= k) {
            m = (s + e) / 2;
            int ans = calculateFunction(a, b, c, m);
            if (ans == k) {
                return m;
            }
            if (ans < k) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return 0;
    }

}
