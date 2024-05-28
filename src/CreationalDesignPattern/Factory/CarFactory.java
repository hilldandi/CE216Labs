package CreationalDesignPattern.Factory;

public class CarFactory {
    public Car getCar(String carType){
        if (carType==null){
            return null;
        } else if (carType.equalsIgnoreCase("SEDAN")) {
            return new Sedan();

        } else if (carType.equalsIgnoreCase("SUV")) {
            return new Suv();

        } else if (carType.equalsIgnoreCase("HATCHBACK")) {
            return new Hatchback();

        }
        return null;
    }


}
