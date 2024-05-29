package Thread.Lesson;

public class Main {
    public static void main(String[] args) {
        MyThread t1=new MyThread("TH-1");
        MyThread t2=new MyThread("th2");

        Thread m1=new Thread(t1);
        Thread m2 =new Thread(t2);
        m1.start();
        m2.start();

    }
}