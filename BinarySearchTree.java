public class BinarySearchTree {
    
    public TreeNode root;
    
    //Constructor
    public BinarySearchTree() {
        root = null;
    }
    
    //Method to insert a new node with given value into BST
    public void insert(int val) {
        root = insertRecursive(root, val);
    }
    
    //Recursive function to insert a new node into BST allowing duplicates
    private TreeNode insertRecursive(TreeNode node, int val) {
        //Base case: if the tree is empty, return a new node
        if (node == null)
            return new TreeNode(val);
        
        //Recursive case: insert into the appropriate subtree
        if (val <= node.val)
            node.left = insertRecursive(node.left, val);
        else
            node.right = insertRecursive(node.right, val);
        
        //Return the updated node
        return node;
    }
    
    //Method to remove and return the node with minimum value from BST
    public TreeNode removeAndReturnMin() {
        TreeNode minNode = findMin(root);
        root = removeRecursive(root, minNode.val); 
        return minNode; 
    }
    
    //Method to find the node with the minimum value in BST
    public TreeNode findMin(TreeNode node) {
        //Traverse left until the leftmost node is found
        while (node.left != null)
            node = node.left;
        return node;
    }
    
    //Recursive function to remove a node with a specific value from BST
    public TreeNode removeRecursive(TreeNode node, int val) {
        //Base case: if the tree is empty
        if (node == null)
            return null;
        
        //Recursive case: traverse the tree to find the node to remove
        if (val < node.val)
            node.left = removeRecursive(node.left, val);
        else if (val > node.val)
            node.right = removeRecursive(node.right, val);
        else {
            //Case 1: Node to be deleted has no children or only one child
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;
            //Case 2: Node to be deleted has two children
            //Find the minimum value node in the right subtree (successor)
            TreeNode successor = findMin(node.right);
            //Replace the node's value with the successor's value
            node.val = successor.val;
            //Remove the successor node from the right subtree
            node.right = removeRecursive(node.right, successor.val);
        }
        
        return node;
    }
    
    //Method to print BST in-order
    public void printInOrder() {
        printInOrderRecursive(root);
        System.out.println(); //Print a newline at the end
    }
        
    //Helper method for in-order traversal
    private void printInOrderRecursive(TreeNode node) {
        if (node != null) {
            printInOrderRecursive(node.left); 
            System.out.print(node.val + " ");
            printInOrderRecursive(node.right);
        }
    }
}
        
//Class to represent a single tree node
class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    
    public TreeNode(int x) {
        val = x;
    }
}

    