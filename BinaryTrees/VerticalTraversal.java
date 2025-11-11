import java.util.*;

public class VerticalTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static class Tuple {
        TreeNode node;
        int row;
        int col;

        public Tuple(TreeNode _node, int _row, int _col) {
            node = _node;
            row = _row;
            col = _col;
        }
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple tuple = q.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }

            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.val);

            if (node.left != null) {
                q.offer(new Tuple(node.left, x - 1, y + 1));
            }

            if (node.right != null) {
                q.offer(new Tuple(node.right, x + 1, y + 1));
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            list.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        // Example tree:
        //       3
        //      / \
        //     9  20
        //        / \
        //       15  7

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        List<List<Integer>> result = verticalTraversal(root);

        System.out.println("Vertical Order Traversal:");
        for (List<Integer> col : result) {
            System.out.println(col);
        }
    }
}
//leetcode
// import java.util.*;

// /**
//  * Definition for a binary tree node.
//  */
// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
// }

// // Helper class to store node along with its position
// class Tuple {
//     TreeNode node;
//     int row;
//     int col;

//     public Tuple(TreeNode _node, int _row, int _col) {
//         node = _node;
//         row = _row;
//         col = _col;
//     }
// }

// class Solution {
//     public List<List<Integer>> verticalTraversal(TreeNode root) {
//         TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
//         Queue<Tuple> q = new LinkedList<>();
//         q.offer(new Tuple(root, 0, 0));

//         while (!q.isEmpty()) {
//             Tuple tuple = q.poll();
//             TreeNode node = tuple.node;
//             int x = tuple.row;  // horizontal distance
//             int y = tuple.col;  // depth level

//             map.putIfAbsent(x, new TreeMap<>());
//             map.get(x).putIfAbsent(y, new PriorityQueue<>());
//             map.get(x).get(y).offer(node.val);

//             if (node.left != null) {
//                 q.offer(new Tuple(node.left, x - 1, y + 1));
//             }

//             if (node.right != null) {
//                 q.offer(new Tuple(node.right, x + 1, y + 1));
//             }
//         }

//         List<List<Integer>> list = new ArrayList<>();

//         for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
//             List<Integer> colList = new ArrayList<>();
//             for (PriorityQueue<Integer> nodes : ys.values()) {
//                 while (!nodes.isEmpty()) {
//                     colList.add(nodes.poll());
//                 }
//             }
//             list.add(colList);
//         }

//         return list;
//     }
// }
