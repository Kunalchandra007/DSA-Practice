package Graphs;
import java.util.*;

public class dfs {

    // Recursive DFS function
    public static void dfsRec(int node, boolean vis[],
                              ArrayList<ArrayList<Integer>> adj,
                              ArrayList<Integer> ls) {

        vis[node] = true;       // mark current node
        ls.add(node);           // add to result

        // Visit all unvisited neighbours
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfsRec(it, vis, adj, ls);
            }
        }
    }

    // Function to return DFS traversal of graph
    public static ArrayList<Integer> dfsOfGraph(int V,
                ArrayList<ArrayList<Integer>> adj) {

        boolean vis[] = new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();

        dfsRec(0, vis, adj, ls);   // start DFS from node 0

        return ls;
    }

    // MAIN FUNCTION TO TEST DFS
    public static void main(String[] args) {

        int V = 5;

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges (undirected graph example)
        adj.get(0).add(1);
        adj.get(0).add(2);

        adj.get(1).add(0);
        adj.get(1).add(3);

        adj.get(2).add(0);
        adj.get(2).add(4);

        adj.get(3).add(1);
        adj.get(4).add(2);

        // Call DFS
        ArrayList<Integer> ans = dfsOfGraph(V, adj);

        System.out.println("DFS Traversal starting from node 0:");
        System.out.println(ans);
    }
}
