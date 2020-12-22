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

        LinkedListUtils.reverseList(strings);

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

        System.out.printf("The oldest person in the list is %s\n", LinkedListUtils.max(people));
    }
}
