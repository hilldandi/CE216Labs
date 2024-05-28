package Thread.Lesson;

public class MyThread implements Runnable{
    String tName;

    public MyThread(String tName){
        this.tName=tName;
    }

    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println("print thread"+tName+"for i:"+i);
        }

    }
}
