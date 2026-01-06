package Graphs;
import java.util.*;

public class NumofProvinces {

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjLs, int vis[]) {
        vis[node] = 1;
        for (Integer it : adjLs.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adjLs, vis);
            }
        }
    }

    public static int numProvinces(int[][] adj) {
        int V = adj.length;

        // adjacency list
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        for (int i = 0; i < V; i++) adjLs.add(new ArrayList<>());

        // convert matrix → list
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (adj[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                }
            }
        }

        int vis[] = new int[V];
        int cnt = 0;

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                cnt++;
                dfs(i, adjLs, vis);
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[][] adj = {
            {1, 1, 0},
            {1, 1, 0},
            {0, 0, 1}
        };

        int ans = numProvinces(adj);
        System.out.println("Number of Provinces = " + ans);
    }
}
