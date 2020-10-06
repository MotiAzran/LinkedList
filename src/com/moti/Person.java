package com.moti;

public class Person implements Comparable<Person> {

    private String _name;
    private String _id;
    private int _birth_year;

    public Person(String name, String id, int birth_year) {
        _name = name;
        _id = id;
        _birth_year = birth_year;
    }

    public String toString() {
        return String.format("%s - %s, Age: %d", _name, _id, _birth_year);
    }

    @Override
    public int compareTo(Person o) {
        return o._birth_year - _birth_year;
    }
}
