package shape_area_calculator;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing();

        drawing.addShape(new Circle(5));
        drawing.addShape(new Rectangle(4, 3));
        drawing.addShape(new Triangle(6, 4));

        drawing.calculateAreas();
    }
}