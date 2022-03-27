public abstract class Person {
    private String firstName;
    private String lastName;
    private int age;


    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 0) {
            this.firstName = firstName;
        } else {
            throw new NullPointerException("First name cannot be null");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 0) {
            this.lastName = lastName;
        } else {
            throw new NullPointerException("Last name cannot be null");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be null!");
        }
    }

    @Override
    public String toString() {
        return "Person =" +
                "firstName ='" + firstName + '\'' +
                ", lastName ='" + lastName + '\'' +
                ", age =" + age;
    }
}
