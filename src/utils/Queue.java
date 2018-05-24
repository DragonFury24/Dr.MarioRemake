package utils;

public class Queue<E> {
        private java.util.LinkedList<E> list;

    public Queue() {
        list = new java.util.LinkedList<E>();
    }

    public void add(E x) {
        list.add(x);
    }

    public E remove() {
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public E peek() {
        return list.peek();
    }

    public int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }

}
