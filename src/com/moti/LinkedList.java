package com.moti;

public class LinkedList<T> {

    private Node<T> _head;
    private Node<T> _tail;

    LinkedList() {
        _head = null;
        _tail = null;
    }

    public Node<T> get_head() {
        return _head;
    }

    public Node<T> get_tail() {
        return _tail;
    }

    public void add(T data) {
        Node<T> new_node = new Node<T>(data);
        _tail.set_next(new_node);

        _tail = new_node;
    }

    public T remove() throws EmptyListException {
        if (null == _head) {
            throw new EmptyListException();
        }

        T head_data = _head.get_data();

        _head = _head.get_next();

        return head_data;
    }

    public String toString() {
        String result = "";

        Node<T> current_node = _head;
        while (null != current_node) {
            result = result.concat(current_node.get_data().toString());
            if (!_tail.equals(current_node)) {
                result = result.concat(" -> ");
            }

            current_node = current_node.get_next();
        }

        return result;
    }
}
