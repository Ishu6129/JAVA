import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,j=0,a=0,c=0,b=0;
        while(i<n){
            j=0;
            if(i==0){
                a=0;b=0;
            }
            else if (i==1){
                a=0;b=1;j++;
                System.out.print(1+" ");
            }
            while(j<i+1){
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}