import java.util.*;

interface NumberOperations{
    int addition();
    int subtraction();
    int multiplication();
    int division();
}

class Abstraction implements NumberOperations{
    int number1;
    int number2;

    
    public Abstraction(int num1,int num2){
        this.number1 = num1;
        this.number2 = num2;
    }

    @Override
    public int addition(){
        return this.number1+this.number2;
    }

    @Override
    public int subtraction(){
        return this.number1-this.number2;
    }
    @Override
    public int multiplication(){
        return this.number1*this.number2;
    }
    @Override
    public int division(){
        return this.number1/this.number2;
    }

    public static void main(String[] args){
        Abstraction ab = new Abstraction(4,5);
        System.out.println("Addition result: "+ab.addition());
        System.out.println("Subtraction result: "+ab.subtraction());
        System.out.println("multiplication result: "+ab.multiplication());
        System.out.println("division result: "+ab.division());
        return;
    }
}