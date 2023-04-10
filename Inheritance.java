// Inheritance is the act of deriving new things from the existing thing .
// We can extend the subclass by Extends keyword used.
// In Inheritance we can do 
//1. Constructor overloading in inheritance.
//2. Method Ovveriding Having same Method in both Parents and Child class --We can Extract each 
//by using Object. of each other.
//3. Lasty we can do the Dynamic Memory Dispatch By changing the Parent reference==Child Object creating.
// -- In Memory dispatch method overrided can be take Object one only which method is defined.
public class Inheritance {
    public static void main(String args[]){
        Child sc=new Child(3,4);

    }
    
}
class Parent{
    Parent(){
        System.out.println("Im parents constructor");
    }
    Parent(int x){
        System.out.println("Im with value x"+ x);
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Im child constructor");
    }
    Child(int x,int y){
        super(x);
        System.out.println("Im with value y at child"+ y);
    }
}
