package CreationalDesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection1=DatabaseConnection.getInstance();
        connection1.connect();

        DatabaseConnection connection2=DatabaseConnection.getInstance();
        connection2.disconnetc();

        // İki bağlantının aynı örneği referans edip etmediğini kontrol etmek
        if (connection1 == connection2) {
            System.out.println("Both connections are the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}
