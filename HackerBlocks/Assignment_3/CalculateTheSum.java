import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] org = new int[n];
        for(int i=0;i<n;i++){
         org[i]=sc.nextInt();
        }
        int[] arr=new int[org.length];
        System.arraycopy(org,0,arr,0,n);
        int opr=sc.nextInt();
        while(opr>0){
            int x=sc.nextInt();
            for(int i=0;i<arr.length;i++){
                int t=i-x;
                if (t<0){
                    t=n+t;
                }
                org[i]=arr[i]+arr[t];
            }
            System.arraycopy(org,0,arr,0,n);
            opr--;
        }
        int sum=0;
        for(int i:org){
            sum+=i;
        }
        System.out.println(sum);
    }
}
