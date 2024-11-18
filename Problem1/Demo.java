package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create a Person object
        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(bob);

        // Print the person's initial details
        System.out.println();
        System.out.println("Person's Name: " + bob.toString());

        // Update the details using setters
        bob.setName("Jessica White");
        bob.setAge(30);
        bob.setGender("F");

        // Print updated details
        System.out.println();
        System.out.println("The details of a person using setters:");
        System.out.println(bob.toString());

        // Retrieve individual details using getters
        System.out.println();
        System.out.println("Retrieve person's details using getters:");
        System.out.println("Name: " + bob.getName());
        System.out.println("Age: " + bob.getAge());
        System.out.println("Gender: " + bob.getGender());

        // Create a Student object
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println();
        System.out.println(
                "---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(lynne);


        // Print the initial details of the Student
        System.out.println();
        System.out.println("Student's Name: " + lynne.toString());

        // Update the student details using setters
        System.out.println();
        System.out.println("The details of a student using setters:");
        lynne.setIdNum("S54321");
        lynne.setGPA(4.0);

        // Print updated details
        System.out.println(lynne.toString());

        // Retrieve individual details using getters
        System.out.println();
        System.out.println("The details of a student using getters: ");
        System.out.println("ID Number: " + lynne.getIdNum());
        System.out.println("GPA: " + lynne.getGPA());

        // Create a Teacher object
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(mrJava);

        // Print initial details
        System.out.println();
        System.out.println("Teacher's Name: " + mrJava.toString());

        // Update teacher details using setters
        mrJava.setSubject("Mathematics");
        mrJava.setSalary(80000.0);

        // Print updated details
        System.out.println();
        System.out.println("The details of a teacher using setters: ");
        System.out.println(mrJava.toString());

        // Retrieve individual details using getters
        System.out.println();
        System.out.println("The details of a teacher using getters: ");
        System.out.println("Subject: " + mrJava.getSubject());
        System.out.println("Salary: " + mrJava.getSalary());

        // Create a College Student object
        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println(ima);

        // Print the College Student's initial details
        System.out.println();
        System.out.println("College Student's Name: " + ima.toString());

        // Update the details using setters
        ima.setYear(2);
        ima.setMajor("Chemistry");

        // Print updated details
        System.out.println();
        System.out.println("The details of a college student using setters:");
        System.out.println(ima.toString());

        // Retrieve individual details using getters
        System.out.println();
        System.out.println("Retrieve college student's details using getters:");
        System.out.println("Year: " + ima.getYear());
        System.out.println("Major: " + ima.getMajor());
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println();
    }

}
