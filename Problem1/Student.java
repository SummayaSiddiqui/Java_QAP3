package Problem1;

public class Student extends Person {
    // Instance variables specific to Student
    protected String myIdNum;    // Student ID Number
    protected double myGPA;      // Grade Point Average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        // Call the constructor of the superclass (Person)
        super(name, age, gender);

        // Initialize Student-specific fields
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // Override the toString method
    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
