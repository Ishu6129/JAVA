package As4;
import java.util.*;
public class AggressiveCow {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int noc=sc.nextInt();
        int[] stall=new int[a];
        for(int i=0;i<a;i++){
            stall[i]=sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.println(Largest_minimum(stall,noc));
    }
    public static int Largest_minimum(int[] stall,int noc){
        int lo=0;
        int hi=stall[stall.length-1]-stall[0];
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(isitpossible(stall,noc,mid)){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall,int noc,int mid){
        int pos=stall[0];
        int cow=1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                cow++;
                pos=stall[i];
            }
            if(cow==noc){
                return true;
            }
        }
        return false;
    }
}
