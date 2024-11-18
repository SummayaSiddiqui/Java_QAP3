package Problem3;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side); // All sides are equal in an equilateral triangle
    }

    @Override
    public double calculateArea() {
        return Math.sqrt(3) / 4 * Math.pow(super.side1, 2); // Area of equilateral triangle
    }

    @Override
    public double calculatePerimeter() {
        return 3 * super.side1; // Perimeter of equilateral triangle
    }
}

