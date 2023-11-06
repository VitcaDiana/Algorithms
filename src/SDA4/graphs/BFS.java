package SDA4.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    //adaug in coada
    //sterg elementul curent din coada
    //adaug  curent in array
    //adaug copii lui curent in coada

    public static List<String> bfs(Node startNode) {
        List<String> visited = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            visited.add(current.value);
            queue.addAll(current.children);
        }
        return visited;
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
        System.out.println(bfs(nodeA));
    }
}




