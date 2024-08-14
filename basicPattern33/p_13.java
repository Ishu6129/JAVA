package GLA.pattern;
import java.util.*;
public class p_13 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int a=2*b-1;
        int i=1;
        while (i<a+1){
            int j=0;
            int f=i;
            if (f>b){
                f=a-i+1;
            }
            while (j<f){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
