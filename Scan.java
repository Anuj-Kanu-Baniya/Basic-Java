import java.util.Scanner;
public class Scan {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        String d=sc.next();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        sc.nextLine();
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println(name);

    }
    
}
