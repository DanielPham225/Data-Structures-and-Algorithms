package Ex2;

public class Ex2 {
    static class Node {
        int value;
        Node left, right;

        Node(int v) {
            value = v;
        }
    }

    //postOrder traversal
    public static int computeHeight(Node p) {
        if (p == null) {
            return -1;
        }

        int leftH = computeHeight(p.left);
        int rightH = computeHeight(p.right);

        int height = 1 + Math.max(leftH, rightH);

        System.out.println("Node " + p.value + " => Height = " + height);

        return height;
    }

    public static void main(String[] args) {

        Node n0 = new Node(4);
        Node n1 = new Node(2);
        Node n2 = new Node(6);
        Node n3 = new Node(1);
        Node n4 = new Node(3);
        Node n5 = new Node(7);

        n0.left = n1;    n0.right = n2;
        n1.left = n3;    n1.right = n4;
        n2.right = n5;

        computeHeight(n0);
    }
}
