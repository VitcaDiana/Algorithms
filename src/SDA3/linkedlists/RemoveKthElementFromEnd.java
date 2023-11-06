package SDA3.linkedlists;

public class RemoveKthElementFromEnd {
    //Input : 1-2-3-4-5-6-7, k=2
    //Output: 1-3-4-5-7
    public static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static Node removeKthNodeFRomEnd(Node head,int k){
        Node slow = head;
        Node fast = head;
        //mutam pe second cu k pozitii mai in fata
        for (int i = 0; i < k; i++) {
            fast = fast.next;

        }
        while (fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;

    }



}
