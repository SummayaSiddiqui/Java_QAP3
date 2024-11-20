package Problem3;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
    return String.format("%s: Area = %.2f, Perimeter = %.2f", 
                         this.name, 
                         getArea(), 
                         getPerimeter());
}

}
