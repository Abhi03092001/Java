package day15;

public class GraphUsingArray {
    public static void main(String[] args) {
        int[][] edges = {
                {1, 2},
                {1, 3},
                {1, 4},
                {2, 4},
                {2, 5},
                {3, 4},
                {3, 5},
                {4, 5}
        };

        System.out.println("Graph Edges:");
        for (int i = 0; i < edges.length; i++) {
            System.out.println(edges[i][0] + " - " + edges[i][1]);
        }
    }
}
