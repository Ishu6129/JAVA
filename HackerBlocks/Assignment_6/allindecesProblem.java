package Assignment_6;
import java.util.*;
public class allIndicesProblem {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        find(arr,m,0);
    }
    public static void find(int[] arr,int m,int idx){
        if(idx==arr.length){
            return;
        }
        if(arr[idx]==m){
            System.out.print(idx+" ");
        }
        find(arr,m,idx+1);
    }
}
//5
//3
//2
//1
//2
//3
//2

//1 3