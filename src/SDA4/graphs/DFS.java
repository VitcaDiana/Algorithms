package SDA4.graphs;

import java.util.ArrayList;
import java.util.List;


    class Node{
        public String value;
        public List<Node> children;

        public Node(String value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
public class DFS {
        public static void dfsStarter(Node startNode ){
            List<Node> visited = new ArrayList<>();
            dfs(startNode,visited);
        }
        public static void dfs(Node node, List<Node> visited){
            if (visited.contains(node)){
                return;
            }
            visited.add(node);
            System.out.println(node.value+ " ");
            for (Node child: node.children){
                dfs(child,visited);
            }
        }

    public static void main(String[] args) {
            Node nodeA = new Node("A");
            Node nodeB = new Node("B");
            Node nodeC = new Node("C");
            Node nodeD = new Node("D");
            Node nodeE = new Node("E");
            Node nodeF = new Node("F");

            nodeA.children.add(nodeB);
            nodeA.children.add(nodeC);
            nodeA.children.add(nodeD);
            nodeB.children.add(nodeE);
            nodeB.children.add(nodeF);
            dfsStarter(nodeA);



    }

}
