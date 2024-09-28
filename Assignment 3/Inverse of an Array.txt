import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            a[v]=i;
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}