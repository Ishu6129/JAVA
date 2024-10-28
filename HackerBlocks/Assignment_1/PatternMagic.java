import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=(2*n)-1;
        int a = n / 2;
        int i = 0;
        while (i < a) {
            int j = 0;
            while (j < (a - i)) {
                System.out.print("*");
                j++;
            }
            System.out.print("*");
            i++;
            int s = (2 * i - 3);
            boolean f=false;
            while (s > 0) {
                f=true;
                System.out.print(" ");
                s--;
            }
            if(f){
            System.out.print("*");}
            s = i;
            while (s < (a + 1)) {
                System.out.print("*");
                s++;
            }
            System.out.println();

        }
        System.out.print("*");
        int e = 0;
        while (e < (2*a-1)) {
            System.out.print(" ");
            e++;
        }
        System.out.print("*");
        System.out.println();
        i = 0;
        while (i < a) {
            int j = -1;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.print("*");
            i++;
            int s = 2 * (a - i)-1;
            boolean f=false;
            while (0 < s) {
                System.out.print(" ");
                s--;
                f=true;
            }
            s = i;
            while (s > 0) {
                System.out.print("*");
                s--;
            }
            if (f){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}