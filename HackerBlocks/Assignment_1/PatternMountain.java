import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i1=1;
        int tp;
        while(i1<n+1){
            int i2=0;
            while (i2<i1){
                System.out.print((i2+1)+" ");
                i2++;
            }
            tp=i1+1;
            int i3=2*(n-tp)+1;
            boolean f=false;
            while (i3>0){
                System.out.print("  ");
                f=true;
                i3--;
            }
            if (i1<n){
            i2=i1;}
            else{i2=i1-1;}
            while (i2>0){
                System.out.print((i2)+" ");
                i2--;
            }
            i1++;

            System.out.println();
        }
    }
}
