package shape_area_calculator;

public interface Shape {
    void accept(Visitor visitor);
}