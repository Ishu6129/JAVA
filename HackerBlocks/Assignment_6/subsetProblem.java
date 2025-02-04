import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        ArrayList<Integer>ans=new ArrayList<>();
        Count(arr,0,ans,target);
        System.out.print("\n"+ count);
      

    }
    public static void Count(int[]arr,int indx,List<Integer>cur,int target){
        if(target==0){
            for(int num:cur){
                System.out.print(num+" ");
            }
            System.out.print(" ");
            count++;
            return;
            
        }
        if(indx==arr.length || target<-1){
            return;
        }
        cur.add(arr[indx]);
        Count(arr,indx+1,cur,target-arr[indx]);
        cur.remove(cur.size()-1);
        Count(arr,indx+1,cur,target);
    }
}