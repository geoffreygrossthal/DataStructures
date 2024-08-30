package BinarySearchTree;
//Date: 7/22/2024
//Programmer: Geoffrey Grossthal
//Program: Represents an implementation of a binary search tree using integers


//Table
public class BinarySearchTree {

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(Keyed data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node currentNode, Keyed data) {
        if (currentNode == null) {
            currentNode = new Node(data);
            return currentNode;
        }
        else if (-1 == data.keyComp(currentNode.data))
            currentNode.left = insertRec(currentNode.left, data);
        else if (1 == data.keyComp(currentNode.data))
            currentNode.right = insertRec(currentNode.right, data);
        return currentNode;
    }

    public Keyed search(Keyed data) {
        return search(data, root);
    }

    private Keyed search(Keyed data, Node current_node) {
        if (current_node == null)
            return null;
        else if (0 == current_node.data.keyComp(data))
            return data;
        else if (-1 == current_node.data.keyComp(data))
            return search(data, current_node.left);
        else
            return search(data, current_node.right);
    }

    public int getHeight() {
        return getHeightRec(root, 0);
    }

    private int getHeightRec(Node current_node, int current_height) {
        if (current_node == null)
            return current_height;
        else
            return Math.max(getHeightRec(current_node.left, current_height + 1), 
                    getHeightRec(current_node.right, current_height + 1));
    }

    public int getSize() {
        return getSize(root);
    }

    private int getSize(Node node) {
        if (node == null)
            return 0;
        else 
            return getSize(node.left) + getSize(node.right) + 1;
    }

    public String toString() {
        return toString(root);
    }

    private String toString(Node node) {
        if (node == null)
            return "";
        String result = "";
        result += toString(node.left);
        result += node.data.toString();
        result += toString(node.right);
        result += " ";
        return result;
    }

    public void showTree() {
        showTree(root, "");
    }

    private void showTree(Node node, String spaces) {
        if (node == null)
            return;
        showTree(node.right, spaces +"  ");
        System.out.println(spaces + node.data.toString());
        showTree(node.left, spaces + "  ");
    }
}