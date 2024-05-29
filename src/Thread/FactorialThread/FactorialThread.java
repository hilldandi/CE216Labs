package Thread.FactorialThread;

public class FactorialThread implements Runnable{
    public int number;
    public FactorialThread(int number){
        this.number=number;
    }

    @Override
    public void run(){
        System.out.println("factorial of "+number+" is : "+calcFact(number));

    }

    public int calcFact(int num){
        int result=1;
        for(int i=0;i<=num;i++){
            result*=i;
        }
        return result;
    }
}
