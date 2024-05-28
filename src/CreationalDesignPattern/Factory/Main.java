package CreationalDesignPattern.Factory;

public class Main {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();

        Car car1= carFactory.getCar("SEDAN");
        car1.drive();

        Car car2 = carFactory.getCar("suv");
        car2.drive();

        Car car3 = carFactory.getCar("HATCHBACK");
        car3.drive();
    }

}
