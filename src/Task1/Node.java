package Task1;

public class Node<T> {
    final T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}