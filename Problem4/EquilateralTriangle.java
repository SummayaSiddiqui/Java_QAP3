package Problem4;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side); // All sides are equal in an equilateral triangle
        this.name = "Equilateral Triangle";
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * Math.pow(side1, 2); // Area of an equilateral triangle
    }

    @Override
    public double getPerimeter() {
        return 3 * this.side1; // Perimeter of an equilateral triangle
    }

}
