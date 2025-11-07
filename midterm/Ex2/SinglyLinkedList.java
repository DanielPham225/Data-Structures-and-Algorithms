public static <E> void reverse(SinglyLinkedList<E> D) {
  Node<E> prev = null;
  Node<E> current = D.head;
  Node<E> next = null;

  //loop
  while (current != null) {
    next = current.next;
    current.next = prev;
    prev = current;
    current = next;
  }

  //fix the pointer
  D.tail = D.head;
  D.head = prev;
}
