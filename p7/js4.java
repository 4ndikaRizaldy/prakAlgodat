package algodat.p7;

public class js4 {
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
    public js4(int n){
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
        
    public void adjacency() {
        int i;
        System.out.print(" ");
        for (i = 0; i < NodeJ; i++) {
            System.out.printf("[%d] ", i);
        }
        System.out.println();
        for (i = 0; i < NodeJ; i++) {
            System.out.printf("[%d]", i);
            for (int j = 0; j < NodeJ; j++) {
                Node n = node[i];
                boolean ketemu = false;
                while (n != null) {
                    if (n.getDt() == j) {
                        System.out.print(" 1 ");
                        ketemu = true;
                        break;
                    }
                n = n.getNext();
                }
                if (!ketemu) {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
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
        
    public static void main(String s[]){
        js4 g = new js4(3);
        g.addAdj(0,1,48);
        g.addAdj(0,2,33);
        g.addAdj(1,2,24);
        System.out.println("Self Loop");
        System.out.println(" ------------- ");
        g.cetak();
        System.out.println(" -------------- ");
        System.out.println("Graph dengan Matrik Adjacency");
        g.adjacency();
    }
        
}
