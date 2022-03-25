public abstract  class Person {
    private String first_name;
    private String last_name;
    private int age;

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getAge() {
        return age;
    }

    public void setFirst_name(String first_name) {
        if(first_name.length()>0){
            this.first_name = first_name;
        } else {
            throw new NullPointerException("First name cannot be null");
        }
    }

    public void setLast_name(String last_name) {
        if(last_name.length()>0){
            this.last_name = last_name;
        } else {
            throw new NullPointerException("Last name cannot be null");
        }
    }

    public void setAge(int age) {
        if(age>0){
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age cannot be null!");
        }
    }

    public Person(){
    }

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person =" +
                "first_name ='" + first_name + '\'' +
                ", last_name ='" + last_name + '\'' +
                ", age =" + age;
    }
}
