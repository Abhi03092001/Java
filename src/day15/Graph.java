package day15;

class Graph {
    class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    int vertex;
    int edge;
    Edge[] edges;

    Graph(int vertex, int edge) {
        this.vertex = vertex;
        this.edge = edge;
        edges = new Edge[edge];

        // Define all 8 edges
        edges[0] = new Edge(1, 2);
        edges[1] = new Edge(1, 3);
        edges[2] = new Edge(1, 4);
        edges[3] = new Edge(2, 4);
        edges[4] = new Edge(2, 5);
        edges[5] = new Edge(3, 4);
        edges[6] = new Edge(3, 5);
        edges[7] = new Edge(4, 5);
    }

    void displayEdges() {
        System.out.println("Graph Edges:");
        for (int i = 0; i < edge; i++) {
            System.out.println(edges[i].src + " - " + edges[i].dest);
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5, 8);
        g.displayEdges();
    }
}
