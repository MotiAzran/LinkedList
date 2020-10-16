package com.moti;

/**
 * Linked list of type T
 * @param <T> type of the list elements
 */
public class LinkedList<T> {
    private Node<T> _head;
    private Node<T> _tail;

    /**
     * Initialize an empty list
     */
    public LinkedList() {
        _head = null;
        _tail = null;
    }

    /**
     * Get list first node
     * @return list first node
     */
    public Node<T> getHead() {
        return _head;
    }

    /**
     * Get list last node
     * @return list last node
     */
    public Node<T> getTail() {
        return _tail;
    }

    /**
     * Add new node at the end of
     * the list
     * @param data data of the node to add
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (null == _head) {
            // first node in the list
            _head = newNode;
        } else {
            _tail.setNext(newNode);
        }

        // Add the new node to end of the list
        _tail = newNode;
    }

    /**
     * Remove the first node of the list
     * @return first node data
     * @throws EmptyListException thrown when the list is empty
     */
    public T remove() throws EmptyListException {
        if (null == _head) {
            // Empty list
            throw new EmptyListException();
        }

        T headData = _head.getData();

        // Remove list first node
        _head = _head.getNext();

        return headData;
    }

    /**
     * Get string representation of the list
     * @return string representation of the list
     */
    public String toString() {
        String result = "";

        Node<T> currentNode = _head;
        while (null != currentNode) {
            result = result.concat(currentNode.toString() + " -> ");

            currentNode = currentNode.getNext();
        }

        result = result.concat("null");

        return result;
    }
}
