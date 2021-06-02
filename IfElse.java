class IfElse{
    public static void main(String args[]){
        int age=20;
        if(age>18){
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println(" you are not eligible for vote");
        }
        int a=4; int b=7; int c=9;
        if(a>b && a>c){
            System.out.println("a is great");
        }
        else if(b>a && b>c){
            System.out.println(" b is great");
        }
        else{
            System.out.println(" c is great");
        }
    }
}