package Problem3;

public class Demo {
    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];

        // Add valid shape objects
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        // Print details for each shape
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
        shapes[4] = new Triangle(10, 20, 30); // Invalid triangle
        System.out.println();
        System.out.println("----------------------------------------------------------------------");
        System.out.println();
    }
}

