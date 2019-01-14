import java.util.*; 
public class DFS{
    
    static class Node{
        public int v;
        public ArrayList<Node> children;
        public boolean visited;
        
        public Node(int v){
            this.v = v;
            this.visited = false;
            this.children = new ArrayList<Node>();
        }
        
        public void addEdge(Node n){
            this.children.add(n);
        }
    }
    
    static void BFS(Node root){
        LinkedList<Node> q = new LinkedList<Node>();
        root.visited = true;
        q.add(root);
        
        while(!q.isEmpty()){
            Node n = q.removeFirst();
            System.out.println(n.v);
            
            for(Node node: n.children){
                if(!node.visited){
                    node.visited = true;
                    q.add(node);
                }
            }
        }
    }
    
    public static void main(String []args){
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n0.addEdge(n1);
        n0.addEdge(n2);
        n1.addEdge(n2);
        n2.addEdge(n0);
        n2.addEdge(n3);
        n3.addEdge(n3);
        
        System.out.println("Following is Breadth First Traversal"); 
        BFS(n2);
     }
}
