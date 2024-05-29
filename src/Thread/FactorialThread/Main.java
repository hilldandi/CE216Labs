package Thread.FactorialThread;

public class Main {
    public static void main(String[] args) {
        int numbers[]={5,6,7,8,1,2,3,6,4,10};
        for (int number:numbers){
            FactorialThread t1=new FactorialThread(number);
            Thread m1= new Thread(t1);
            m1.start();
        }
    }
}
