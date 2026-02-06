package OOPs;
abstract  class Car{
    Car(){
        System.out.println("Car constructor");
    }
    abstract public void start();
    public void noise(){
        System.out.println("Noise......");

    }
}
abstract class Dealer extends Car{
    int numberofCars;
}
interface Carinterface{
    public void start();

    //default and static 
    default void noise(){
        System.out.println("Noise is starting......");
    }
    static  void numberofwheels(){
        System.out.println("Four wheels");
    }
}

class Manualcar implements Carinterface{
    public void start(){
        Carinterface.numberofwheels();
        System.out.println("Car is startinggg");
    }
    public  void printname(){//cant be placed in parent class
        System.out.println("Hey i am manual");
    }
}
class automaticcar extends Car{
    public void start(){
        System.out.println("Automatic car is starting ");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Manualcar manualcar=new Manualcar(); 
         manualcar.noise();
        manualcar.start();
        
        Car automatiCar=new automaticcar();
        automatiCar.start();
        automatiCar.noise();

    }
    
}
