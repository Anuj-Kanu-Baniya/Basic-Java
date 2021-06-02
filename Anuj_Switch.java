import java.util.Scanner;
class Anuj_Switch{
    public static void main(String args[]){
        Scanner a=new Scanner(System.in);
        int age;
        System.out.println("Enter your age::");
        age=a.nextInt();
        switch(age){
            case 18:
            System.out.println("you are eligible for vote");
            break;
            case 25:
            System.out.println("you are astudent");
            break;
            case 45:
            System.out.println("you are in job");
            break;
            case 60:
            System.out.println("you are retired from job");
            break;
            default :
            System.out.println("enjoy your life");
        }
    }
}