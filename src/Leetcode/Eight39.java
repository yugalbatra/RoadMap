package Leetcode;

import java.util.ArrayList;
import java.util.List;
T
public class Eight39 {

    private void BFS(int start, boolean[] visited, boolean[][] adj) {
        List<Integer> q = new ArrayList<>();
        q.add(start);
        visited[start] = true;
        int vis;
        while (!q.isEmpty()) {
            vis = q.get(0);
            q.remove(q.get(0));
            for (int i = 0; i < visited.length; i++) {
                if (adj[vis][i] && (!visited[i])) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    private boolean checkSimilarString(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
        }
        return count == 2 || count == 0;
    }

    public int numSimilarGroups(String[] strs) {
        boolean[][] connected = new boolean[strs.length][strs.length];
        int count = 0;
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (checkSimilarString(strs[i], strs[j])) {
                    connected[i][j] = true;
                    connected[j][i] = true;
                }
            }
        }
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                BFS(i, visited, connected);
                count++;
            }
        }
        return count;
    }
}
