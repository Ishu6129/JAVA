package Assignment_6;
import java.util.*;
public class firstIndex {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int ans=-1;
        System.out.println(find(arr,ans,m,0));
    }
    public static int find(int[] arr,int ans,int m,int idx){
        if(idx==arr.length){
            return ans;
        }
        if(arr[idx]==m){
            return idx;
        }
        return find(arr,ans,m,idx+1);
    }
}
//5
//3
//2
//1
//2
//3
//2

//1