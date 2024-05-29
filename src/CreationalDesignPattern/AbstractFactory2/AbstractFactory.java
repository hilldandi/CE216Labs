package CreationalDesignPattern.AbstractFactory2;

public abstract class AbstractFactory {
    abstract Shhape getShape(String shapeType);
    abstract Color getColor(String color);

}
