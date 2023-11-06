package SDA4.trees;

import java.util.Map;

public class BSTFindClosestValue {

    //target 12
    //output 13

    public static int findClosest(Node root, int target,int closest){
        if (Math.abs(target-closest) > Math.abs(target-root.value)){
            closest = root.value;
        }
        if (target < root.value && root.left != null){
            return findClosest(root.left,target,closest);
        }else if(target > root.value && root.right != null){
            return findClosest(root.right,target,closest);
        }else {
            return closest;
        }
    }
    public static int findClosest2(Node root,int target){
        Node currentNode = root;
        int closest = 100000;
        while(currentNode != null){
            if (Math.abs(target-closest) > Math.abs(target- currentNode.value)){
                closest = currentNode.value;
            }
            if (target< currentNode.value){
                currentNode = currentNode.left;
            }else if(target > currentNode.value){
                currentNode = currentNode.right;
            }else{
                return currentNode.value;
            }
        }
        return closest;
    }
}
