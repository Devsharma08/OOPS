class Parent{
    int num ;
    Parent(int x){
        this.num = x ;
    }
    void show(){
        System.out.println("This is from parent class " + this.num);
    }
}

class Child extends Parent{
    int num ;
    Child(int x1,int x2){
        super(x1);
        this.num = x2;
        // super.show();
    }
    @Override
    void show(){
        System.out.println("This is from child class " + this.num);
    }
}

public class OverRiding{
    public static void main(String[] args){
        Parent p = new Child(5,10);
        p.show(); // overriding
        System.out.println(p.num); // shadowing
        return ;
    }
}