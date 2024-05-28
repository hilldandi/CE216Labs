package CreationalDesignPattern.Singleton;

public class DatabaseConnection {
    private static volatile DatabaseConnection instance;
    //volatile anahtar kelimesi, değişkenin farklı iş parçacıkları arasında
    // doğru bir şekilde senkronize edilmesini sağlar.

    private DatabaseConnection(){
        //veritabanı ile iletişim kurmak için gerekli işlemler yazılır buraya
    }

    //erişim metodu , statik ve public olmak zorunda!!!
    public static DatabaseConnection getInstance(){
        if (instance==null){
            synchronized (DatabaseConnection.class){//thread uyumlu yapar
                if (instance==null){
                    instance =new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void connect(){
        System.out.println("connected");
    }

    public void disconnetc(){
        System.out.println("disconnect");
    }



}
