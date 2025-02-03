package Assignment_6;
import java.util.*;
public class boardPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int f=sc.nextInt();
        System.out.println("\n"+print(n,f,0,""));
    }
    public static int  print(int n,int f,int curr,String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int count=0;
        for(int i=1;i<=f;i++){
            count+=print(n,f,curr+i,ans+i);
        }
        return count;
    }
}

//3
//3
//
//111 12 21 3
//4