package CreationalDesignPattern.AbstractFactory2;

import CreationalDesignPattern.Factory2.Shape;
import CreationalDesignPattern.Factory2.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
        Shhape shape1=shapeFactory.getShape("circle");
        shape1.draw();

        Shhape shape2=shapeFactory.getShape("rectangular");
        shape2.draw();

        AbstractFactory colorFactory=FactoryProducer.getFactory("color");
        Color color1=colorFactory.getColor("pink");
        color1.fill();

        Color color2=colorFactory.getColor("blue");
        color2.fill();

    }
}
