/**
 * Represent a person
 */
public class Person implements Comparable<Person> {
    private String name;
    private String id;
    private int birthYear;

    /**
     * Initialize person
     * @param name person name
     * @param id person ID
     * @param birthYear person birth year
     */
    public Person(String name, String id, int birthYear) {
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
    }

    /**
     * Get string representation of person
     * @return string representation of person
     */
    public String toString() {
        return String.format("%s - %s, born at %d", name, id, birthYear);
    }

    /**
     * Compare people by their age
     * @param other person to compare
     * @return 0 if the person at the same age,
     *         positive number if this person is older
     *         negative number if the other person is older
     */
    @Override
    public int compareTo(Person other) {
        return other.birthYear - birthYear;
    }
}
