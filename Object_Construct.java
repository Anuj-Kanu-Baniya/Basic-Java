// Object Creating and Constructor used with overloaded Constructor same as MethodOverloaded.
//


public class Object_Construct {
    public static void main(String args[]){
        Emp obj=new Emp();
        obj.name();
        obj.id();
        obj.salary();
        Emp obj1=new Emp(2);
        obj1.name();
        obj1.id();
        obj1.salary();

    }
    
}
class Emp{
    int id;
    String name;
    int salary;
    Emp(){
        id=4;
        name="anuj kanu";
        salary=4500;
    }
    Emp(int x){
        id=23;
        name="ajay";
        salary=123;
    }
    void name(){
        System.out.println("my name is "+name);

    }
    void salary(){
        System.out.println("my name is "+salary);
        
    }
    void id(){
        System.out.println("my name is "+id);
        
    }
}

