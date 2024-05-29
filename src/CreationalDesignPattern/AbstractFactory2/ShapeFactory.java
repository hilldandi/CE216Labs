package CreationalDesignPattern.AbstractFactory2;

import CreationalDesignPattern.Factory2.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shhape getShape(String shapeType){
        if (shapeType==null){
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("rectangular")) {
            return new Rectangular();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
