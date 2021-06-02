import java.util.Scanner;
class Scan{
    public static void main(String args[]){
        String a="hello world";
        System.out.println(" this is store in variable " + a);
        // using scanner class to give coomand to user to enter the value
        Scanner sc=new Scanner(System.in);
       // System.out.println("enter the first numner");
        //int b=sc.nextInt(); // it will run line by line
        //System.out.println("enter the float");
        //float c=sc.nextFloat();
       // System.out.println("enter the string");
        //String d=sc.next();
        //System.out.println("the output is as");
        //System.out.println(b);
        //System.out.println(c);
        //System.out.println(d);
        boolean m=sc.hasNextInt(); // it will compared whether the enter value is int or not by(hasNext)
        boolean n=sc.hasNextFloat(); 
       // boolean o=sc.hasNextString(); // this is not available 
        System.out.println(m);
        System.out.println(n);
        //System.out.println(o);
    }
}