package Debugging_Testing.Test2;

public class Calculator {
    //add, subtract, multiply, divide
    int num1,num2;
    public Calculator(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
        int result=num1+num2;
        return result;
    }
    public int subt(){
        int result=num1-num2;
        return result;
    }
    public int mult(){
        int result=num1*num2;
        return result;
    }
    public int div(){
        int result=num1/num2;
        return result;
    }
}
