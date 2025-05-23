package datastructures.binarysearchtree;

public class BinarySearchTree {

    Node root;

    public class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value){
        Node newNode = new Node(value);
        if (root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true){
            if (newNode.value == temp.value){
                return false;
            }
            if (newNode.value < temp.value){
                if (temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            }else{
                if (temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value){
        Node temp = root;
        while (temp != null){
            if (value < temp.value){
                temp = temp.left;
            }else if (value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

    private boolean rContains(Node currentNode, int value){
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;
        if (value < currentNode.value){
            return rContains(currentNode.left, value);
        }else{
            return rContains(currentNode.right, value);
        }
    }

    public boolean rContains(int value){
        return rContains(root, value);
    }
}
