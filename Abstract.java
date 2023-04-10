//Abstract class Must be create when therir is absrtract method.we have to method overrided 
//we can not created a object of abstract class but we can created the reference of abstract class.
// we have to used the extend keyword to extend the abstract class in subclass.
public class Abstract {
    public static void main(String args[]){
        Subclass obj=new Subclass();
        obj.greet();
        obj.fast(4);


    }
    
}
abstract class Parent{
    void greet(){
        System.out.println("Good Morning");
    }

   abstract void fast(int x);
}
class Subclass extends Parent{
    public void fast(int x){
        System.out.println("im a fast subclass");
    }



}
