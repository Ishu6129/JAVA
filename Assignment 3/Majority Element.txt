import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int n = arr.length;
        int e=1;
        int v=arr[0];
        for(int i=1;i<n;i++){
            if (v==arr[i]){
                e++;
            }
            else{
                if (e>1){
                    e--;
                }
                else{
                    v=arr[i];
                    e=1;
                }
            }
        }
        System.out.println(v);
    }
}
