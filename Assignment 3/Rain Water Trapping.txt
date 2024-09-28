import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int v=sc.nextInt();
            int[] arr=new int[v];
            for(int i=0;i<v;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(traping(arr));
        n--;
        }
    }
    public static int traping(int[] arr) {
        int n=arr.length;
        int []left=new int[n];
        int []right=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++) {
            left[i]=Math.max(left[i-1], arr[i]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--) {
            right[i]=Math.max(right[i+1], arr[i]);
        }
        int sum=0;
        for(int i=0;i<n;i++) {
            sum =sum+Math.min(left[i], right[i] ) -arr[i];
        }
        return sum;
    }
}
