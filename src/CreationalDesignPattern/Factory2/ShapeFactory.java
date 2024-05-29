package CreationalDesignPattern.Factory2;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        } else if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("square")) {
            return new Square();

        } else if (shapeType.equalsIgnoreCase("rectangular")) {
            return new Rectangular();

        }
        return null;
    }
}
