import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int a=2*b+1;
        int i=1;
        int space=0;
        int lp=0;
        while (i<a+1){
            int j=0;
            int f=i;
            if (f>b){
                f=a-i+1;
            }
            while (j<f){
                System.out.print(b-j+" ");
                j++;
            }
            if (i<=(2*b)/2){
            space=2*(b-i+1)-1;}
            else{
                space=2*(i-b-1)-1;
            }
            while(space>0){
                System.out.print("  ");
                space--;
            }
            j=0;
            f=i;
            if (f>b){
                f=a-i+1;
            }
            lp=b-f;
            if (f==b+1){
                j++;
                lp++;
            }
            while (j<f){
                System.out.print(lp+1+" ");
                j++;
                lp++;
            }
            i++;
            System.out.println();
        }

    }
}