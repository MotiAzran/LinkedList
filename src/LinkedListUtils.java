/**
 * Implement utils functions for
 * LinkedList
 */
public class LinkedListUtils {

    /**
     * Reverse linked list
     * @param list list to reverse
     * @param <T> type of the list data
     */
    public static <T> void reverseList(LinkedList<T> list) {
        T value;
        try {
            value = list.remove();
        } catch (EmptyListException e) {
            // The list is empty retrieve recursion
            return;
        }

        reverseList(list);

        list.add(value);
    }

    /**
     * Get the max element in list
     * @param list the list to search for the max element
     * @param <T> the type of the list data
     * @return the max element in the list
     */
    public static <T extends Comparable<T>> T max(LinkedList<T> list) {
        T max = list.getHead().getData();
        for (T data : list) {
            if (max.compareTo(data) < 0) {
                // The current element is bigger
                max = data;
            }
        }

        return max;
    }

}
