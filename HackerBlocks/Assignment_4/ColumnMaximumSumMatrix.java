package As4;
import java.util.*;
public class ColumnMaximumSumMatrix {
    public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int[] res={0,Integer.MIN_VALUE};
        int tp=0;
        for(int i=0;i<arr.length;i++){
            tp=findSum(i,arr);
            if (tp>res[1]){
                res[0]=i+1;
                res[1]=tp;
            }
        }
        System.out.println(res[0]+" "+res[1]);
    }
    public static int findSum(int n,int[][] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][n];
        }
        return sum;
    }
}
