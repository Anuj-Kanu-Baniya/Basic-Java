import java.util.Scanner;
class Exercise_loop{
    public static void main(String args[]){
    // to find sum of digit of number::
    int sum=0;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    while(a>0){
        n=a%10;
        sum=sum+n;
        a=a/10;
    }
    System.out.println("sum of digit is "+ sum);
    }
}

// armstrong is 153=1^3+5^3+3^3 if 153=153 after power then a number is armstrong

lass Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int l=sc.nextInt();
        int o,add=0;
        int tem=l;
        while(l>0){
            o=l%10;
            add=add+(o*o*o);
            l=l/10;
        }
        System.out.println("armstrong number is "+add);

        if(tem==add){
            System.out.println("it is armstrong");
        }
        else{
            System.out.println("it is not armstrong");
        }

    
    }
    
}

import java.util.Scanner;
// palindrome number=121,313 which is a no.after reverse it will be a same number is called palindrome
import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for a palindrome::");
        int n=sc.nextInt();
        int m, sum=0, temp=n;
        while(n>0){
            m=n%10;
            sum=(sum*10)+m;
            n=n/10;
        }
        System.out.println(" palindrome number is "+ sum);
        if(temp==sum){
            System.out.println("it is a palindrme");
        }
        else{
            System.out.println(" it is not palindrme");
        }

    }
    
} 

// factorial of a number like 5!=1*2*3*4*5
import java.util.Scanner;
class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorail of a number is "+fact);
    
    }
}