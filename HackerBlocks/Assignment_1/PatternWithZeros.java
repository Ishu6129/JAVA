import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int c=0;
        int s=0;
        int t=0;
        int p;
        while (i<a){
            i++;
            s=i;
            c++;
            t=c;
            System.out.print(t+" ");
            p=t;
            int p1=p;
            while ((2*p1)-4>0){
                System.out.print(0+" ");
                p1--;
            }
            if (t>1){
            System.out.print(p);}
            System.out.println();
        }

    }
}
