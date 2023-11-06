package SDA4.trees;

import java.util.List;

public class BSTTraversal {


    public static List<Integer> inOrder(Node root, List<Integer> array){
        if (root.left != null) {
            inOrder(root.left, array);
        }
        array.add(root.value);
        if (root.right !=null) {
            inOrder(root.right, array);
        }
        return array;
    }
    public static List<Integer> preOrder(Node root, List<Integer> array){
        array.add(root.value);
        inOrder(root.left,array);
        inOrder(root.right,array);
        return array;
    }
    public static List<Integer> postOrder(Node root, List<Integer> array){
        inOrder(root.left,array);
        inOrder(root.right,array);
        array.add(root.value);
        return array;
    }
}
