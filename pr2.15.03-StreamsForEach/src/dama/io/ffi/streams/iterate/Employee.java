package dama.io.ffi.streams.iterate;

import java.util.Objects;

public class Employee {

    private final String name;
    private final Boolean licensed;
    private final int birthYear;
    private final int id;

    /**
     * @param name
     * @param license
     * @param birthYear
     * @param id
     */
    public Employee(String name, Boolean license, int birthYear, int id) {
        super();
        this.name = name;
        this.licensed = license;
        this.birthYear = birthYear;
        this.id = id;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return this.name;
    }

    /**
     * @return the license
     */
    public final Boolean getLicense() {
        return this.licensed;
    }

    /**
     * @return the birthYear
     */
    public final int getBirthYear() {
        return this.birthYear;
    }

    /**
     * @return the id
     */
    public final int getId() {
        return this.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.birthYear, this.licensed, this.id, this.name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) obj;
        return (this.birthYear == other.birthYear) && Objects.equals(this.licensed, other.licensed)
                && (this.id == other.id) && Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return String.format("Person [name=%s, license=%s, birthYear=%s, id=%s]", this.name, this.licensed,
                this.birthYear, this.id);
    }

}
