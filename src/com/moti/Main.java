package com.moti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> strings = new LinkedList<>();

        Scanner stdin = new Scanner(System.in);
        for (int i = 0; i < 6; ++i) {
            System.out.print("Enter string: ");
            strings.add(stdin.nextLine());
        }

        System.out.println(strings);

        ArrayList<String> strings_arr = new ArrayList<>();

        while(true) {
            try {
                strings_arr.add(0, strings.remove());
            } catch (EmptyListException e) {
                break;
            }
        }

        LinkedList<String> reverse_strings = new LinkedList<>();
        for (String str : strings_arr) {
            reverse_strings.add(str);
        }

        System.out.println(reverse_strings);

        LinkedList<Person> persons = new LinkedList<>();
        persons.add(new Person("Moti", "123", 2006));
        persons.add(new Person("Shoval", "456", 1972));
        persons.add(new Person("Orit", "789", 1967));
        persons.add(new Person("Eli", "159", 1948));

        System.out.printf("The oldest person in the list is: %s\n", max(persons));
    }

    public static <T extends Comparable<T>> T max(LinkedList<T> list) {

        Node<T> current_node = list.get_head();
        T max = current_node.get_data();
        while (null != current_node) {

            if (max.compareTo(current_node.get_data()) < 0) {
                max = current_node.get_data();
            }

            current_node = current_node.get_next();
        }

        return max;
    }
}
