package Ex1;

public class BinarySearchTree {

    static class Node {
        int key;
        Node left, right;
        Node(int key) { this.key = key; }
    }

    // Ex1
    public Node treeSearch(Node root, int key) {
        Node current = root;

        while (current != null) {
            if (key == current.key) {
                return current;
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null; // Not found
    }

    // test
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);

        Node result = tree.treeSearch(root, 40);
        if (result != null)
            System.out.println("Found: " + result.key);
        else
            System.out.println("Not found");
    }
}

