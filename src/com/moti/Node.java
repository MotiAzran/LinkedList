package com.moti;

public class Node<T> {

    private T _data;
    private Node<T> _next;

    public Node(T data) {
        this(data, null);
    }

    public Node(T data, Node<T> next) {
        _data = data;
        _next = next;
    }

    public T get_data() {
        return _data;
    }

    public void set_data(T data) {
        _data = data;
    }

    public Node<T> get_next() {
        return _next;
    }

    public void set_next(Node<T> next) {
        _next = next;
    }
}
