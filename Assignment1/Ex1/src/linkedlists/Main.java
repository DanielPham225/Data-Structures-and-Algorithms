package linkedlists;

public class Main {
    public static void main(String[] args) {
        // Your code goes here
        DoublyLinkedList<Integer> P = new DoublyLinkedList<>();
        DoublyLinkedList<Integer> T = new DoublyLinkedList<>();

        P.addLast(1);
        P.addLast(2);
        P.addLast(3);
        P.addLast(4);
        T.addLast(5);
        T.addLast(6);
        T.addLast(7);
        T.addLast(8);
        DoublyLinkedList<Integer> A = new DoublyLinkedList<Integer>().Concat(P,T);

        System.out.println(A.toString());
        System.out.println(A.size());

    }
}
