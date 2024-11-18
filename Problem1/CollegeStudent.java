package Problem1;

public class CollegeStudent extends Student {
    // Instance variables specific to CollegeStudent
    private String major;
    private int year;

    // Constants for year (Freshman = 1, Sophomore = 2, etc.)
    public static final int FROSH = 1;
    public static final int SOPH = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    // Constructor for CollegeStudent class
    public CollegeStudent(String myName, int myAge, String myGender, String myIdNum, double myGPA, int year, String major) {
        // Call the constructor of the superclass (Student)
        super(myName, myAge, myGender, myIdNum, myGPA); 

        // Initialize the new instance variables
        this.major = major;
        this.year = year;
    }

    // Getter methods

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    // Setter methods

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Override the toString() method to include CollegeStudent-specific details
    @Override
    public String toString() {
        return super.toString() + ", Major: " + major + ", Year: " + year;
    }
}

