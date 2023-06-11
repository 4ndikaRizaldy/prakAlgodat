package algodat.p7;

public class js3 {
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
    public js3(int n){
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
    public int getCurrent() {
        System.out.println("Total " + current);
        return current;
    }
    public void cetak(){
        for (int i=0; i<NodeJ; i++){
            System.out.print("["+i+"]");
            Node n = node[i];
            while (n!=null){
                System.out.print("->"+n.getDt());
                n = n.getNext();
            }
            System.out.println();
        }
    }
        
    public void bfs(){
        System.out.println("BFS (Breadth First Search)");
        boolean hide=false;
        for (int i=0; i<NodeJ; i++){
            Node n = node[i];
            if(n!=null&&hide==false){
                System.out.print("->"+i);
                hide=true;
            }
            while (n!=null){
                System.out.print("->"+n.getDt());
                n = n.getNext();
            }
        }
    }
        
    public static void main(String s[]){
        js3 g = new js3(4);
        g.addAdj(0,1,48);
        g.addAdj(0,2,33);
        g.addAdj(1,2,24);
        g.addAdj(0,3,56);
        g.addAdj(3,2,56);
        g.bfs();
        System.out.println();
        System.out.println(" -------------------");
    }
        
}
