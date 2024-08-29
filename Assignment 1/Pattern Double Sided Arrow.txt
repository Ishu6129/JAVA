import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int a=(n/2)+1;
       int i=0,j=0,m=0,r=0,space=0,sp=a;
       while(i<n){
            if (i<a){m++;r++;space++;sp--;}
            else{m--;r--;space--;sp++;}
            j=sp;
            while(j>0){
                System.out.print("    ");
                j--;
            }
            j=0;
            while (j<m){
                System.out.print(r-j+" ");
                j++;
            }
            j=1;
            while(j<2*space-2){
                System.out.print("  ");
                j++;
            }
            if (!(i==0 || i==n-1)){
            j=0;
           while (j<m){
               System.out.print((j+1)+" ");
               j++;
           }}
           System.out.println();
            i++;
        }
        
    }
}
