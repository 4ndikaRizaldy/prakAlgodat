package algodat.p7;

public class js2 {
    private int[][] data1;
    private int[] data2;
    private int current = 0;
    private class Node{
        private int data,jarak;
        private Node next;
        public Node(int dt, Node n,int jrk){
            data = dt;
            next = n;
            jarak=jrk;
        }
        public int getDt(){
            return data;
        }
        public Node getNext(){
            return next;
        }
    }
    private Node []node;
    private int NodeJ;
    public js2(int n){
        NodeJ = n;
        node = new Node[NodeJ];
        for(int i=0; i<NodeJ; i++) node[i] = null;
        data1 = new int[n][n];
    }
    public void addAdj(int head, int adj, int jarak) {
        Node n = new Node(adj,node[head], jarak);
        node[head] = n;
        current++;
        data1[head][adj]++;
    }

    public void dfs(){
        System.out.println("DFS");
        dfs(0);
    }

    String temp="";
    public int checkpoint = 1;
    public boolean find = false;
    public void dfs(int i) {
        data2 = new int[NodeJ];
        System.out.printf("Depth first search(%d) :\n", i);
        DFS(0);
        System.out.print(0);
        for (int w = 1; w < NodeJ; w++) {
            if (i == 0) {
                break;
            } else if (i != data2[w]) {
                System.out.print(" -> " + data2[w]);
            } else if (i == data2[w]) {
                System.out.println(" -> " + data2[w]);
                break;
            }
        }
        System.out.println();
    }
    public void DFS(int i) {
        int[] S = new int[NodeJ + 1];
        int s = 0;
        find = false;
        for (int j = 0; j < NodeJ; j++) {
            if (data1[i][j] >= 1) {
                for (int w : data2) {
                    if (data2[w] == j) {
                        find = true;
                    }
                }
                if (find != true) {
                    S[s] = j;
                    s++;
                }
            }
            find = false;
        }
        for (int k = 0; k < NodeJ; k++) {
            for (int w = 0; w < NodeJ; w++) {
                if (S[k] == data2[w]) {
                    find = true;
                }
            }
            if (find != true) {
                data2[checkpoint] = S[k];
                checkpoint++;
                DFS(S[k]);
            }
            find = false;
        }
    }
        
    public static void main(String s[]){
        js2 g = new js2(3);
        g.addAdj(0,1,48);
        g.addAdj(0,2,33);
        g.addAdj(1,2,24);
        System.out.println(" ------------- ");
        g.dfs(1);
        System.out.println(" ------------------- ");
    }
       
}
