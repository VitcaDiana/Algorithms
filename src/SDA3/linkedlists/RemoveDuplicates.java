package SDA3.linkedlists;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    //O(N)


    public static Node removeDuplicates(Node head) {
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            while (nextNode != null && currentNode.value == nextNode.value){
                currentNode.next = nextNode.next;
            }
            currentNode.next = nextNode;
            currentNode = currentNode.next;
        }
        return head;

    }



    public static void main(String[] args) {
        Node node7 = new Node(3,null);
        Node node6 = new Node(3,node7);
        Node node5 = new Node(3, node6);
        Node node4 = new Node(3, node5);
        Node node3 = new Node(2, node4);
        Node node2 = new Node(1, node3);
        Node node1 = new Node(1, node2);
//        Map<String,Integer> map = new HashMap<>();
//        for (Map.Entry<String,Integer> entry: map.entrySet()){
//
//        }
        removeDuplicates(node1);


    }
}





