import java.util.*;

class Operations{
    // defining private -- only accessable with-in the class
    private int number1;
    private int number2;

    
    public Operations(int num1,int num2){
        this.number1 = num1;
        this.number2 = num2;
    }

    
    public int addition(){
        return this.number1+this.number2;
    }

    
    public int subtraction(){
        return this.number1-this.number2;
    }
    
    public int multiplication(){
        return this.number1*this.number2;
    }
    
    public int division(){
        return this.number1/this.number2;
    }
}

class Encapsulation{
    public static void main(String[] args){
        Operations ab = new Operations(4,5);
        // ab.number1 = 5;  // error: number1 has private access in Operations
        System.out.println("Addition result: "+ab.addition());
        System.out.println("Subtraction result: "+ab.subtraction());
        System.out.println("multiplication result: "+ab.multiplication());
        System.out.println("division result: "+ab.division());
        return;
    }
}