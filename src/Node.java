/**
 * Represent a list single node
 * @param <T> type of the node data
 */
public class Node<T> {
    private T data;
    private Node<T> next;

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
        this.data = data;
        this.next = next;
    }

    /**
     * Get node data
     * @return node data
     */
    public T getData() {
        return data;
    }

    /**
     * Set node data
     * @param data node new data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Get next node
     * @return next node
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Set new next node
     * @param next new next node
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Get string representation of node
     * @return string representation of node
     */
    public String toString() {
        return "(" + data + ")";
    }
}
