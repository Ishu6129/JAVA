import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int sb=sc.nextInt();
        int db=sc.nextInt();
        int sn=sc.nextInt();
        int n=sn;
            int mult=1, rem=0, scon=0;
            while(n>0){
                rem=n%10;
                scon=scon+mult*rem;
                mult=mult*sb;
                n=n/10;
            }
            mult=1;int sum=0;
            while(scon>0){
                rem=scon%db;
                sum=sum+mult*rem;
                mult=mult*10;
                scon=scon/db;
            }
            System.out.println(sum);
        
    }
}