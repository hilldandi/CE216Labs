package CreationalDesignPattern.Factory2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFact=new ShapeFactory();

        Shape shp1= shapeFact.getShape("circle");
        shp1.draw();
        Shape shp2=shapeFact.getShape("RecTangular");
        shp2.draw();

    }

}
