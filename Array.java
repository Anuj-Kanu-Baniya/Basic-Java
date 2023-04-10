public class Array {
    public static void main(String args[]){
        int arr[]=new int[5];
        arr[0]=12;
        arr[1]=1;
        arr[2]=3;
        arr[3]=45;
        arr[4]=12;
        System.out.println(arr[3]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("it is first one");
        int ar[]={12,45,76,45,78,90};
        for(int ele:ar){
            System.out.println(ele);
        }
    }
    
}
