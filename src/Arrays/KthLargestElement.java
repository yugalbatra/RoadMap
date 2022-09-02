package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) pq.poll();
        }
        return pq.peek();
    }

    public int findKthLargestBySorting(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
