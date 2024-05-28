package Thread.Lesson;

public class Main {
    public static void main(String[] args) {
        MyThread m1=new MyThread("thread 1");
        MyThread m2=new MyThread("thread 2");

        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);

        t1.start();
        t2.start();

    }
}