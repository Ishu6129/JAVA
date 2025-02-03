package Assignment_6;
import java.util.*;
public class replace0with5 {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int I=sc.nextInt();
        int R=0;
        int t=I;
        int r;
        while(t>0){
            r=t%10;
            if(r==0){
                R=R*10+5;
            }
            else{
                R=R*10+r;
            }
            t=t/10;
        }
        int ans=0;
        while(R>0){
            r=R%10;
            ans=ans*10+r;
            R=R/10;
        }
        System.out.print(ans);
    }
}

//103

//153