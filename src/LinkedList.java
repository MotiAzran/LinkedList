import java.util.Iterator;

/**
 * Linked list of type T
 * @param <T> type of the list elements
 */
public class LinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;

    /**
     * Initialize an empty list
     */
    public LinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Get list first node
     * @return list first node
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * Get list last node
     * @return list last node
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     * Add new node at the end of
     * the list
     * @param data data of the node to add
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);

        if (null == head) {
            // first node in the list
            head = newNode;
        } else {
            tail.setNext(newNode);
        }

        // Add the new node to end of the list
        tail = newNode;
    }

    /**
     * Remove the first node of the list
     * @return first node data
     * @throws EmptyListException thrown when the list is empty
     */
    public T remove() throws EmptyListException {
        if (null == head) {
            // Empty list
            throw new EmptyListException();
        }

        T headData = head.getData();

        // Remove list first node
        head = head.getNext();

        if (null == head) {
            // The list is empty now, update the tail
            tail = null;
        }

        return headData;
    }

    /**
     * Get string representation of the list
     * @return string representation of the list
     */
    public String toString() {
        String result = "";

        Node<T> currentNode = head;
        while (null != currentNode) {
            result = result.concat(currentNode + " -> ");

            currentNode = currentNode.getNext();
        }

        result = result.concat("null");

        return result;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> currentNode = head;

            @Override
            public boolean hasNext() {
                return null != currentNode;
            }

            @Override
            public T next() {
                T data = currentNode.getData();
                currentNode = currentNode.getNext();

                return data;
            }
        };
    }
}
