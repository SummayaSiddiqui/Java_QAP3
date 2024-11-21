package Problem4;

public class Circle extends Ellipse {

    public Circle(double radius) {
        super(radius, radius); // Circle is an Ellipse with a = b = r
        this.name = "Circle"; // Update the name to "Circle"
    }

}
