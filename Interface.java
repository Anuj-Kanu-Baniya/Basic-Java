// Interface is an totaled abstract method we have to implement the all the method in the subclass.
// we can not create an object of interface and can created an refrence of interface
public class Interface {
    public static void main(String args[]){
        Subclass sc=new Subclass();
        sc.fast();
        sc.greet();
        sc.ram();
        sc.oop();

    }
    
}
interface Parent{
    void fast();
    void greet();
    default void play(){
        System.out.println("im playing football");

    }
}
class Child  implements Parent{
    public void fast(){
        System.out.println("im fast");

    }
    public void greet(){
        System.out.println("Im good morning");
    }

}
class Subclass extends Child{
    void oop(){
        System.out.println("function of subclass");

    }
    void ram(){
        System.out.println("im an inner class of interface type");
    }
}
