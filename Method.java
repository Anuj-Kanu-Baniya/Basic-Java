public class Method {
    public static void main(String args[]){
        int a=3;
        int b=4;
        int c=sum(a,b);
        System.out.println(c);
        Method obj=new Method();
        int j=obj.min(6,2);
        System.out.println(j);
        Sum sc=new Sum();
        int u=sc.min_1(65,25);
        System.out.println(u);
        int e=sum(87);
        System.out.println(e);


    }
    static int sum(int x,int y){
        return x+y;

    }
    static int sum(int x){ // Metho overloading must be same name but different function on arguments.
        return x;
    }
     int min(int x,int y){
        return x-y;
    }
    
}
//Creating an outside class with the function which can be called by creating an object.
class Sum{
     int sum_1(int x,int y){
        return x+y;

    }
     int min_1(int x,int y){
        return x-y;
    }
}
