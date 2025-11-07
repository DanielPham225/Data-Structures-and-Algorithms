package Ex3;

public class LinkedQueue<E> {

    private SinglyLinkedList<E> list = new SinglyLinkedList<E>();

    public void enqueue(E e)   { list.addLast(e); }
    public E dequeue()         { return list.removeFirst(); }
    public boolean isEmpty()   { return list.isEmpty(); }
    public int size()          { return list.size(); }
    public E first()           { return list.first(); }
    @Override
    public String toString() {
        return list.toString();
    }
    public void concatenate(LinkedQueue<E> Q2) {
        this.list.append(Q2.list);
    }
}
