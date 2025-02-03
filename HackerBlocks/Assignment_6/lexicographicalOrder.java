package Assignment_6;
import java.util.*;
public class lexicographicalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        print(n,0);
    }
    public static void print(int n,int curr){
        if(curr>n){
            return;
        }
        System.out.print(curr+" ");
        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            print(n,curr*10+i);
        }
    }
}

//10

//0 1 10 2 3 4 5 6 7 8 9

