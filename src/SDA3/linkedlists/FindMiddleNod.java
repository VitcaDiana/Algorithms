package SDA3.linkedlists;

public class FindMiddleNod {
    public static class Node {
        //Input : 1-2-3-4-5-6-7
        //Output: 4
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static int findMIddleNode(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.value;
    }

}
