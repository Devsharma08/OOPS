import java.util.*;

class Cars{
    int doors ;
    int tyres ;
    String origin ;

    public Cars(int d,int t,String o){
        this.doors = d;
        this.tyres = t ;
        this.origin = o;
    }

    public void starting(){
        System.out.printf("Starting car \n");
    }

    public void Props(){
        System.out.printf("%d %d %s \n",doors,tyres,origin);
    }
}

class ElectricCars extends Cars{
    String carType;
    String startingAmount ;

    public ElectricCars(int d,int t,String o,String c,String s){
        super(d,t,o);
        this.carType = c;
        this.startingAmount = s ;
    }

    public void MainComponent(){
        System.out.printf("%s %s \n",this.carType,this.startingAmount);
    }

}

class NormalCars extends Cars{
    String carType;
    String startingAmount ;

    public NormalCars(int d,int t,String o,String c,String s){
        super(d,t,o);
        this.carType = c; // manuual
        this.startingAmount = s ; // 2,50,000
    }

    public void MainComponent(){
        System.out.printf("%s %s \n",this.carType,this.startingAmount);
    }
}

public class Inheritance{
    public static void main(String[] args){
        ElectricCars e1 = new ElectricCars(2,4,"India","Electric","6,00,00");
        NormalCars n1 = new NormalCars(4,4,"China","Normal","2,50,000");

        // main components
        e1.MainComponent();
        
        n1.MainComponent();

        // parent class methods
        e1.Props();
        n1.Props();
        e1.starting();
        n1.starting();

        return ;

    }
}
