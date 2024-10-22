package shape_area_calculator;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}