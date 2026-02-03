package OOPs;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;

    }
    int add(int a,int b,int c){
        return a+b+c;

    }
}

class Parent{
    void display(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("Parent class");
    }
}
public class polymorphism{
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println(obj.add(1, 2));

        Child child=new Child();
        child.display();
        
    }
}