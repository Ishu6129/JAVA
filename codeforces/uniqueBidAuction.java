package codeforces;
import java.util.*;
public class uniqueBidAuction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int n_bid=sc.nextInt();
            int[] arr=new int[n_bid];
            int[] temp=new int[n_bid];
            for(int i=0;i<n_bid;i++){
                int v=sc.nextInt();
                arr[i]=v;
                temp[i]=v;
            }
            prnt(arr,unqbid(temp));

            n--;
        }
    }
    public static int unqbid(int[] arr){
        Arrays.sort(arr);
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])){
                mn=Math.min(mn,arr[i]);
            }
        }
        return mn==Integer.MAX_VALUE ? -1 : mn;
    }
    public static void prnt(int[] arr,int unq) {
        if(unq==-1){
            System.out.println(-1);
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(unq==arr[i]){
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
