import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            arr[i]=v;
            c+=arr[i];
            arr[i]=c;
            System.out.print(arr[i]+" ");
        }
    }
}
