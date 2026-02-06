package OOPs;
abstract  class Car{
    abstract public void start();
    public void noise(){
        System.out.println("Noise......");

    }
}

class Manualcar extends  Car{
    public void start(){
        System.out.println("Car is startinggg");
    }
    public  void printname(){//cant be placed in parent class
        System.out.println("Hey i am manual");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Car manualcar=new Manualcar(); 
         manualcar.noise();
        manualcar.start();
        
    }
    
}
