package Leetcode;

import java.util.Arrays;

public class Eight8 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        for (; i < m && j < n; i++) {
            if (nums1[i] == 0) {
                break;
            }

            if (nums1[i] > nums2[j]) {
                nums1[i] = nums1[i] ^ nums2[j] ^ (nums2[j] = nums1[i]);
                Arrays.sort(nums2);
            }
        }
        while (i < m && j< n) {
            nums1[i++] = nums2[j++];
        }
    }
}
