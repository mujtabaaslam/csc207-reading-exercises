
public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private int age;

    /**
     * Sets the firstName of the student. This value must be a string.
     *
     * @param firstName the new, firstName of the student.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the lastName of the student. This value must be a string.
     *
     * @param lastName the new, lastName of the student.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
    * Sets the id of the student. This value must be non-negative.
    *
    * @param id the new, non-negative id of the student.
    * @throws IllegalArgumentException if a non-negative value is given.
    */
    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Sets the age of the student. This value must be non-negative.
     *
     * @param age the new, non-negative age of the student.
     * @throws IllegalArgumentException if a non-negative value is given.
     */
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public Student(String firstName, String lastName, int id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    /**
    * Returns the firstName of the student.
    *
    * @return a string the firstName of the student.
    */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Returns the lastName of the student.
     *
     * @return a string the lastName of the student.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns the id of the student.
     *
     * @return an int the id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     * Returns the age of the student.
     *
     * @return an int the age of the student.
     */
    public int getAge() {
        return age;
    }

}
