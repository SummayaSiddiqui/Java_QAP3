package Problem2;

public class Demo {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        // Printing a Point object with initial coordinates (1.0, 2.0)
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println("Point: " + p1);
        

        // Printing the point coordinates using setter method
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        p1.setXY(3.0f, 4.0f);
        System.out.println("Point: " + p1);

        // Printing MoveablePoint point with initial coordinates (1.0, 2.0) and speed (0.5, 1.5)
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        MoveablePoint mp1 = new MoveablePoint(1.0f, 2.0f, 0.5f, 1.5f); 
        System.out.println("MoveablePoint: " + mp1);

        // Printing the MoveablePoint to a new position using the move method
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        mp1.move(); // Updating the position of MoveablePoint based on its speed
        System.out.println("MoveablePoint: " + mp1);
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
    }
}

