import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int c=0;
        int s=0;
        int t=0;
        while (i<a){
            int j=0;
            while (j<(a-i-1)){
                System.out.print("  ");
                j++;
            }
            i++;
            s=i;
            c++;
            t=c;
            while(s>0){
                System.out.print(t);
                System.out.print(" ");
                s--;
                t++;
            }
            while (t>c+1){
                System.out.print(t-2);
                System.out.print(" ");
                t--;
            }

            System.out.println();
            }

    }
}