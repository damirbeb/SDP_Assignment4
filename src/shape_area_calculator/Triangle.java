package shape_area_calculator;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void accept(Visitor visitor) {
        visitor.visitTriangle(this);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}