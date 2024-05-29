package CreationalDesignPattern.Singleton2;

public class Main {
    public static void main(String[] args) {
        Singleton sing1=Singleton.getInstance();
        sing1.open();

        Singleton sing2=Singleton.getInstance();
        sing2.close();


        if (sing1 == sing2) {
            System.out.println("Both connections are the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
