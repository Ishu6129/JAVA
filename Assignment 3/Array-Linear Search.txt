import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Boolean fnd=true;
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            if (arr[i]==target){
                System.out.println(i);
                fnd=false;
                break;
            }
        }
        if(fnd){
            System.out.println(-1);
        }
    }
}