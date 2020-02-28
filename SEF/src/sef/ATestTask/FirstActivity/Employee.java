package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;
    private String name;
    private int age;

    //TODO 1 create different constructors
    //Behavior - default constructor
    public Employee(){
        this.name="Unknown";
        this.age = 0;
        this.companyName = "Unknown";
        this.jobTitle = "Unknown";
    }

    //Behavior - parameterized constructor
    public Employee(String name, int age, String title, String company) {
        this.name = name;
        this.age = age;
        this.companyName = company;
        this.jobTitle = title;
    }
    //TODO 2 add getters and setters
// getter for String name
    public String getName() {
        return name;
    }

    // setter for String name
    public void setName(String name) {
        this.name = name;
    }

    // getter for int age
    public int getAge() {
        return age;
    }

    // setter for int age
    public void setAge(int age) {
        this.age = age;
    }

    // getter for int age
    public String getCompany() {
        return companyName;
    }

    // setter for int age
    public void setCompany(String company) {
        this.companyName = company;
    }

    // getter for int age
    public String getJobTitle() {
        return jobTitle;
    }

    // setter for int age
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //TODO 3 override method announce()
    public void announce(){
        System.out.println("My name is" + name + "and i am" + age + "years old." +
                " I work as" + jobTitle + "in" + companyName);
    }

}



