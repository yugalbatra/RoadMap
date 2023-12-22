package Arrays;

import java.util.Arrays;

public class MinimizeTheHeights {

    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int ans = arr[n - 1] - arr[0];
        int max = arr[n - 1] - k;
        int min = arr[0] + k;
        for (int i = 0; i < n - 1; i++) {
            int mx = Math.max(max, arr[i] + k);
            int mn = Math.min(min, arr[i + 1] - k);
            if(mn<0) continue;
            ans = Math.min(mx - mn, ans);
        }
        return ans;
    }
}
