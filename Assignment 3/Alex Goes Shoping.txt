import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int itemNo=sc.nextInt();
        int[] item=new int[itemNo];
        for(int i=0;i<itemNo;i++){
            item[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        while(q>0){
            int A=sc.nextInt();
            int k=sc.nextInt();
            for(int i=0;i<itemNo;i++){
                if(A%item[i]==0){
                    k--;
                }
            }
            if(k<=0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }    
    }
}