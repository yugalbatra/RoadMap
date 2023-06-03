package Leetcode;

public class Three19 {

    public int bulbSwitch(int n) {
        boolean[] bulbs = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                bulbs[j] = !bulbs[j];
            }
        }
        int count = 0;
        for (boolean bool: bulbs) {
            if (bool) count++;
        }
        return count;
    }
    public int bulbSwitchOptimized(int n) {
        return (int)Math.sqrt(n);
    }
}
