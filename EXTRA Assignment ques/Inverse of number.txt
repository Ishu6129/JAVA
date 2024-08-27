import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String n1=sc.next();
        int n=Integer.parseInt(n1);
        int t=n;
        int a[] = new int[n1.length()];
        int b[] = new int[n1.length()];
        int i=0;
        int r;
        while (t>0){
            r=t%10;
            a[i]=r;
            t=t/10;
            i++;
        }
        for(int j=0;j<a.length;j++){
            b[a.length-a[j]]=j+1;
        }
        for (int k=0;k<b.length;k++){
            System.out.print(b[k]);
        }

       
    }
}