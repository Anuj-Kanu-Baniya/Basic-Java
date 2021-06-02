// remaining question are maximun mininum and sort the array by asc and desc
class Exercise_Array{
    public static void main(String args[]){
       // to find sum of marks and average
        int[] mark={34,56,75,45,40,60,80};
        int i, sum=0;
        for(i=0;i<mark.length;i++){
            sum=sum+mark[i];
        }
        System.out.println(" sum of marks "+sum);
        System.out.println("average of marks is::"+sum/mark.length);
        // reverse of array is::
        for(i=mark.length-1;i>=0;i--){
            System.out.print(mark[i]+" ");
        }
        System.out.println("");
        // sum of 2 d array::
        int[][] mat1={{1,2,3},{2,4,6}};;
        int[][] mat2={{9,8,7},{6,4,2}};
        int result;

        int j;
        for(i=0;i<mat1.length;i++){
            for(j=0;j<mat1[i].length;j++){
                result=mat1[i][j]+mat2[i][j];
                System.out.print(result+" ");
            }
            System.out.println(" ");
        }
    }
}