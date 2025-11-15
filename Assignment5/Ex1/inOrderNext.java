package Ex1;

class Node {
    int value;
    Node left, right, parent;

    public Node(int value) {
        this.value = value;
    }
}

public class inOrderNext {
    public static Node inorderNext(Node p) {
        if (p == null) return null;

        //case 1 go right then go left
        if (p.right != null) {
            return leftmost(p.right);
        }

        //case2 no right subtree
        Node parent = p.parent;
        while (parent != null && p == parent.right) {
            p = parent;
            parent = parent.parent;
        }

        return parent;
    }

    //return leftmost child
    private static Node leftmost(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    //test
    public static void main(String[] args) {

        Node n0 = new Node(4);
        Node n1 = new Node(2);
        Node n2 = new Node(6);
        Node n3 = new Node(1);
        Node n4 = new Node(3);
        Node n5 = new Node(7);

        n0.left = n1;    n0.right = n2;
        n1.parent = n0;  n2.parent = n0;

        n1.left = n3;   n3.parent = n1;
        n1.right = n4;  n4.parent = n1;

        n2.right = n5;  n5.parent = n2;

        Node next = inorderNext(n3);

        System.out.println("Inorder next of " + n3.value + " = " +
                (next != null ? next.value : "null"));
    }
}

//worst-case: p has no right child then has to go through all elements O(h) h is the height of the tree
// for unbalanced tree, O(n)
//balanced tree: o(log n)
