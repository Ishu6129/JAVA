import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int it=sc.nextInt();
        long[] arr=new long[it];
        for(int i=0;i<it;i++){
            arr[i]=sc.nextLong();
        }
        int n=arr.length;
        long[] left =new long[n];
        long[] right = new long[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*arr[j+1];
        }
        for(int k=0;k<n;k++){
            left[k]=left[k]*right[k];
        }
        for(long i:left){
            System.out.print(i+" ");
        }
    }
}