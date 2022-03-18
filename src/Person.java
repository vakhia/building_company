abstract public class Person {
    private String first_name;
    private String last_name;
    private int age;

    private void setFirst_name(String first_name) {
        if(first_name.length()>0){
            this.first_name = first_name;
        } else {
            throw new NullPointerException("First name cannot be null");
        }
    }

    private void setLast_name(String last_name) {
        if(last_name.length()>0){
            this.last_name = last_name;
        } else {
            throw new NullPointerException("Last name cannot be null");
        }
    }

    private void setAge(int age) {
        if(age>0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be null!");
        }
    }

    public Person(String first_name, String last_name, int age) {
        this.setFirst_name(first_name);
        this.setLast_name(last_name);
        this.setAge(age);
    }
}
