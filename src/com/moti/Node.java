package com.moti;

/**
 * Represent a list single node
 * @param <T> type of the node data
 */
public class Node<T> {
    private T _data;
    private Node<T> _next;

    /**
     * Initialize the node with
     * the data and next as null
     * @param data date to put in node
     */
    public Node(T data) {
        this(data, null);
    }

    /**
     * Initialize node with given
     * data and next
     * @param data data to put in the node
     * @param next the next node
     */
    public Node(T data, Node<T> next) {
        _data = data;
        _next = next;
    }

    /**
     * Get node data
     * @return node data
     */
    public T getData() {
        return _data;
    }

    /**
     * Set node data
     * @param data node new data
     */
    public void setData(T data) {
        _data = data;
    }

    /**
     * Get next node
     * @return next node
     */
    public Node<T> getNext() {
        return _next;
    }

    /**
     * Set new next node
     * @param next new next node
     */
    public void setNext(Node<T> next) {
        _next = next;
    }

    /**
     * Get string representation of node
     * @return string representation of node
     */
    public String toString() {
        return "(" + _data.toString() + ")";
    }
}
