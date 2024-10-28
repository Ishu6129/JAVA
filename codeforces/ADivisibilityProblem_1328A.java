package GLA.codeforces;
import java.util.*;
public class ADivisibilityProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0,v=0;
        int[] ab=new int[2];
        while(i<n){
            j=0;
            while (j<2){
                v=sc.nextInt();
                ab[j]=v;
                j++;
            }
            if (!(ab[0]%ab[1]==0)){
                System.out.println(ab[1]-(ab[0]%ab[1]));
            }
            else{
                System.out.println(0);;
            }
            i++;
        }
    }
}
