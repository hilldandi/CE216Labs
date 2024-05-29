package CreationalDesignPattern.Singleton2;

public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instance == null){
            instance=new Singleton();
        }
    return instance;
    }

    public void open(){
        System.out.println("connection opened");
    }

    public void close(){
        System.out.println("connection closed");
    }
}
