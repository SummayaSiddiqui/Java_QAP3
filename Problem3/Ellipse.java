package Problem3;

import static java.lang.Math.*;

public class Ellipse extends Shape {
    protected double a; // Major axis
    protected double b; // Minor axis

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        // Assign the larger value to a and the smaller to b
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double getArea() {
        return PI * a * b; // πab
    }

    @Override
    public double getPerimeter() {
        // Approximation formula for the perimeter of an ellipse
        return PI * 2 * (pow(a, 2) + pow(b, 2)) - (pow(a - b, 2) / 2);
    }
}

