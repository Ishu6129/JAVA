import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rows=2*n+1;
        int i=0,j,p;
        int c=n+1;
        while(i<rows){
            if(i<=n){c--;
                j=i;}
            else{c++;
                j=rows-i-1;}
            p=c;
            while(j>0){
                System.out.print("  ");
                j--;
            }
            while(p>0){
                System.out.print(p+" ");
                p--;
            }
            System.out.print(0+" ");
            p++;
            while(p<c+1){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
            i++;
        }
    }
}