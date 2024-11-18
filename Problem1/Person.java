package Problem1;

public class Person {
    // Instance variables
    protected String myName;   // name of the person
    protected int myAge;       // person’s age
    protected String myGender; // "M" for male, "F" for female

    // Constructor
    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // Getter methods
    public String getName() {
        return myName;
    }

    public int getAge() {
        return myAge;
    }

    public String getGender() {
        return myGender;
    }

    // Setter methods
    public void setName(String name) {
        myName = name;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public void setGender(String gender) {
        myGender = gender;
    }

    // toString method
    @Override
    public String toString() {
        return myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}

