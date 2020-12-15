/*
 * Moti Azran
 */

import java.util.Scanner;

/**
 * Program main class
 */
public class Main {
    /**
     * Program entry point
     * @param args command line arguments
     */
    public static void main(String[] args) {
        final int STRINGS_COUNT = 6;

        LinkedList<String> strings = new LinkedList<>();

        // Get from user all strings
        Scanner stdin = new Scanner(System.in);
        for (int i = 0; i < STRINGS_COUNT; ++i) {
            System.out.print("Enter string: ");
            strings.add(stdin.nextLine());
        }

        System.out.print("Strings: ");
        System.out.println(strings);

        reverseList(strings);

        System.out.print("Reversed Strings: ");
        System.out.println(strings);

        // Initialize people list
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Moti", "123", 1997));
        people.add(new Person("Shoval", "456", 1996));
        people.add(new Person("Orit", "789", 1970));
        people.add(new Person("Eli", "159", 1967));

        System.out.print("People: ");
        System.out.println(people);

        System.out.printf("The oldest person in the list is %s\n", max(people));
    }

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
