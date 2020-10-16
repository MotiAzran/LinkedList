/*
 * Moti Azran
 */
package com.moti;

import java.util.ArrayList;
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
        LinkedList<String> strings = new LinkedList<>();

        // Get from user all strings
        Scanner stdin = new Scanner(System.in);
        for (int i = 0; i < 6; ++i) {
            System.out.print("Enter string: ");
            strings.add(stdin.nextLine());
        }

        System.out.print("Strings: ");
        System.out.println(strings);

        LinkedList<String> reverseStrings = reverseList(strings);

        System.out.print("Reversed Strings: ");
        System.out.println(reverseStrings);

        // Initialize people list
        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Moti", "123", 2006));
        people.add(new Person("Shoval", "456", 1972));
        people.add(new Person("Orit", "789", 1967));
        people.add(new Person("Eli", "159", 1948));

        System.out.print("People: ");
        System.out.println(people);

        System.out.printf("The oldest person in the list is: %s\n", max(people));
    }

    /**
     * Reverse linked list
     * @param list list to reverse
     * @param <T> type of the list data
     * @return reversed list
     */
    public static <T> LinkedList<T> reverseList(LinkedList<T> list) {
        ArrayList<T> reversedListArr = new ArrayList<>();

        // Enter strings to array list in reversed order
        while(null != list.getHead()) {
            try {
                reversedListArr.add(0, list.remove());
            } catch (EmptyListException e) {
                System.out.println("Error: " + e.getMessage());
                return null;
            }
        }

        LinkedList<T> reversedList = new LinkedList<>();
        while (!reversedListArr.isEmpty()) {
            reversedList.add(reversedListArr.remove(0));
        }

        return reversedList;
    }

    /**
     * Get the max element in list
     * @param list the list to search for the max element
     * @param <T> the type of the list data
     * @return the max element in the list
     */
    public static <T extends Comparable<T>> T max(LinkedList<T> list) {
        Node<T> currentNode = list.getHead();
        T max = currentNode.getData();
        while (null != currentNode) {
            // compare current element with the current max element
            if (max.compareTo(currentNode.getData()) < 0) {
                // The current element is bigger
                max = currentNode.getData();
            }

            currentNode = currentNode.getNext();
        }

        return max;
    }
}
