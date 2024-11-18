package Problem1;

public class Teacher extends Person {
    // Instance variables specific to Teacher
    protected String subject; // Subject taught by the teacher
    protected double salary;  // Annual salary of the teacher

    // Constructor
    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        // Call the constructor of the superclass (Person)
        super(myName, myAge, myGender);

        // Initialize Teacher-specific fields
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", Salary: " + salary;
    }
}

