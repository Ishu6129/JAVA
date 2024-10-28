import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
       int row=(2*n)-1;
        int i=0,c=0,j=0,p=0,s=0,c1=0,l=1;
        int star=n;
        while (i<row){
            if (i<n){
                star--;
            }
            else{
                star++;
            }
            s=star;
            while(s>0){
                System.out.print("  ");
                s--;
            }
            j=0;
            if (i<n){
                p=2*(i+1)-1;
            }
            else{
                p=2*(row-i)-1;
            }
            if (i<n)
            {c1++;}
            else {c1--;}
            c=c1;
            while(j<p){
                l=2;
                if (j<(p/2)+1){
                System.out.print(c+" ");
                c++;}
                else{
                    System.out.print(c-l+" ");
                    c--;
                    l++;
                }
                j++;
            }

            System.out.println();
            i++;

        }
    }
}