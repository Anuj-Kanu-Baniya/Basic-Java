/// String methods are:::

import java.util.Scanner;
class Str{
    public static void main(String args[]){
    int a=55; // a++ it will assign or used the value first then increase the value in next step
    System.out.println(a++);
    System.out.println(a);
    int j=23;
    int c=++j; // a++ it will incresed the value and then assign the value
    System.out.println(c);
    Scanner sc= new Scanner(System.in); // new is a keyboard
    System.out.println(" enter the string for a meythod to followed::");
    String m=sc.next();
    System.out.println(m.length()); // to find length
    System.out.println(m.toUpperCase()); // to convert upper case letter
    System.out.println(m.toLowerCase()); //// to convert lower case letter
    System.out.println(m.substring(3)); // to start the string from that index value
    System.out.println(m.substring(2,5)); // to start and end with n-1 index value
    System.out.println(m.replace("ya","zx")); // replace string
    System.out.println(m.startsWith("pri")); // check whether its start with this or not 
    System.out.println(m.endsWith("pri")); // check whether its end with this or not 
    System.out.println(m.equals("priya")); // check whether its equal with this string or not 
    System.out.println(m.equalsIgnoreCase("priyanka")); //// check whether its equal with this string  or not without case sensitive 
    System.out.println(m.charAt(5)); // to find charcter at that index value
    System.out.println(m.indexOf('i')); // to find index value of that letter which is come first
    System.out.println(m.indexOf('i',2));
   // System.out.println(m.lastOf('i'));
   // System.out.println(m.LasttOf('i',2));

   

    }
}