import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int t=num;
        int rem;int sOdd=0;int sEven=0;
        int temp=1;
        int c=0;
        while(t>0){
            rem=t%10;
            c=c+1;
            t=t/10;
        }
        t=num;
        if (c%2==0){
            while(t>0){
            rem=t%10;
            if (temp%2==0){
                sEven=sEven+rem;
            }
            else{
                sOdd=sOdd+rem;
            }
            temp=temp+1;
            t=t/10;
        }

        }
        else{
            while(t>0){
            rem=t%10;
            if (temp%2==0){
                sEven=sEven+rem;
            }
            else{
                sOdd=sOdd+rem;
            }
            temp=temp+1;
            t=t/10;
        }

        }
        System.out.println(sOdd);
        System.out.println(sEven);

    }
}

