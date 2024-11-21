// package Problem4;

// public class Demo {
//      public static void scaleShapes(Scalable[] shapes, double factor) {
//         System.out.println("-------------------------------------------------------------------------------------------------");
//         System.out.println("\nScaling shapes by factor: " + factor + "\n");

//         for (Scalable shape : shapes) {
//             System.out.println("-------------------------------------------------------------------------------------------------");
//             System.out.println("\nBefore scaling: " + shape);
//             shape.scale(factor);
//             System.out.println("After scaling: " + shape + "\n");
//         }
//     }

//     public static void main(String[] args) {
//         // Create shape instances
//         Circle circle = new Circle(5);
//         Ellipse ellipse = new Ellipse(4, 3);
//         Triangle triangle = new Triangle(3, 4, 5);
//         Triangle triangle2 = new Triangle(3, 4, 10);
//         EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);

//         // Create array of Scalable shapes
//         Scalable[] shapes = {circle, ellipse, triangle, equilateralTriangle, triangle2};

//         // Display and scale shapes
//         scaleShapes(shapes, 2.0);
//     }
// }

package Problem4;

public class Demo {
    public static void scaleShapes(Scalable[] shapes, double factor) {
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println("\nScaling shapes by factor: " + factor + "\n");

        for (Scalable shape : shapes) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("\nBefore scaling: " + shape);
            shape.scale(factor);
            System.out.println("After scaling: " + shape + "\n");
        }
    }

    public static void main(String[] args) {
        // Create shape instances
        Circle circle = new Circle(5);
        Ellipse ellipse = new Ellipse(4, 3);
        Triangle triangle = new Triangle(3, 4, 5);
        
        Triangle triangle2 = null; // Initialize to null
        try {
            triangle2 = new Triangle(3, 4, 10);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(6);

        // Create an array of Scalable shapes, excluding triangle2 if it's invalid
        Scalable[] shapes = (triangle2 != null) 
            ? new Scalable[]{circle, ellipse, triangle, equilateralTriangle, triangle2}
            : new Scalable[]{circle, ellipse, triangle, equilateralTriangle};

        // Display and scale shapes
        scaleShapes(shapes, 2.0);
    }
}
