package com.moti;

/**
 * Represent a person
 */
public class Person implements Comparable<Person> {
    private String _name;
    private String _id;
    private int _birth_year;

    /**
     * Initialize person
     * @param name person name
     * @param id person ID
     * @param birth_year person birth year
     */
    public Person(String name, String id, int birth_year) {
        _name = name;
        _id = id;
        _birth_year = birth_year;
    }

    /**
     * Get string representation of person
     * @return string representation of person
     */
    public String toString() {
        return String.format("%s - %s, Age: %d", _name, _id, _birth_year);
    }

    /**
     * Compare between persons
     * by their age
     * @param other person to compare
     * @return 0 if the person at the same age,
     *         positive number if this person is older
     *         negative number if the other person is older
     */
    @Override
    public int compareTo(Person other) {
        return other._birth_year - _birth_year;
    }
}
