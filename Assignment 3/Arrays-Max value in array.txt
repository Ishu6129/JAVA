import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int mx=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if (i==0){
                mx=arr[0];
            }
            if (arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println(mx);
    }
}
