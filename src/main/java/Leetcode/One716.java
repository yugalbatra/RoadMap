package Leetcode;

public class One716 {
    public int totalMoney(int n) {
        int totalMoney = 0;
        for (int i = 1; i <= n; i++) {
            totalMoney += i;
        }

        totalMoney += n / 5;
        return totalMoney;
    }
}
