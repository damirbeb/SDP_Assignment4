package shape_area_calculator;

import java.util.ArrayList;
import java.util.List;

public class Drawing {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void calculateAreas() {
        Visitor visitor = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}