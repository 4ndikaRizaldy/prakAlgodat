package algodat.p7;

import java.util.*;

public class Graph {
    private int V; // Jumlah vertex
    private List<List<Integer>> adj; // Daftar adjacency

    public Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

    public void printAdjacency() {
        for (int i = 0; i < V; i++) {
            System.out.print("Adjacency of vertex " + i + ": ");
            for (int neighbor : adj.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public int getVertexCount() {
        return V;
    }

    public int getEdgeCount() {
        int count = 0;
        for (int i = 0; i < V; i++) {
            count += adj.get(i).size();
        }
        return count / 2; // Karena setiap edge ditambahkan dua kali
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[V];
        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adj.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah vertex: ");
        int V = input.nextInt();

        Graph graph = new Graph(V);

        System.out.print("Masukkan jumlah edge: ");
        int E = input.nextInt();

        System.out.println("Masukkan edge (src dest):");
        for (int i = 0; i < E; i++) {
            int src = input.nextInt();
            int dest = input.nextInt();
            graph.addEdge(src, dest);
        }

        int choice = 0;
        while (choice != 5) {
            System.out.println("\nProgram Graph");
            System.out.println("1. Menampilkan Adjacency setiap vertex");
            System.out.println("2. Menampilkan jumlah vertex");
            System.out.println("3. Menampilkan jumlah edge");
            System.out.println("4. Menampilkan hasil penelusuran DFS dan BFS dari graph");
            System.out.println("5. Keluar");
            System.out.print("\nMasukkan pilihan menu (1-5): ");
            choice = input.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    graph.printAdjacency();
                    break;
                case 2:
                    System.out.println("Jumlah vertex: " + graph.getVertexCount());
                    break;
                case 3:
                    System.out.println("Jumlah edge: " + graph.getEdgeCount());
                    break;
                case 4:
                    System.out.print("Masukkan vertex awal untuk DFS: ");
                    int startDFS = input.nextInt();
                    System.out.print("Hasil penelusuran DFS: ");
                    graph.DFS(startDFS);
                    System.out.println();

                    System.out.print("Masukkan vertex awal untuk BFS: ");
                    int startBFS = input.nextInt();
                    System.out.print("Hasil penelusuran BFS: ");
                    graph.BFS(startBFS);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }

        input.close();
    }
}
