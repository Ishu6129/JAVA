import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int mn=sc.nextInt();
        int mx=sc.nextInt();
        int stp=sc.nextInt();
        int i=mn;
        int res=0;
        while (i<=mx){
            System.out.print(i+" ");
            res=(int)((5.0/9)*(i-32));
            System.out.print(res);
            System.out.println();
            i=i+stp;
        }
    }
}
