package Task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> {
    private Node<T> top;

    public Stack() {
        top = null;
    }

    public void push(final T data) {
        final Node<T> newNode = new Node<>(data);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        final T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек порожній");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Iterable<T> iterable() {
        return () -> new Iterator<T>() {
            private Node<T> current = top;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                final T data = current.data;
                current = current.next;
                return data;
            }
        };
    }
}