package CreationalDesignPattern.AbstractFactory2;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shhape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color){
        if (color==null){
            return null;
        } else if (color.equalsIgnoreCase("blue")) {
            return new Blue();

        } else if (color.equalsIgnoreCase("pink")) {
            return new Pink();

        }
        return null;
    }


}
