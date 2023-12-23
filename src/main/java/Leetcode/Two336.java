package Leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Stack;

public class Two336 {

    int cur;
    PriorityQueue<Integer> heap;

    public Two336() {
        cur = 1;
        heap = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (heap.isEmpty()) {
            cur++;
            return cur - 1;
        }
        return heap.poll();
    }

    public void addBack(int num) {
        if (num < cur && !heap.contains(num)) heap.add(num);
    }
}
