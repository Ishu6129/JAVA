package GLA.codeforces;
import java.util.*;
public class BThreeBrothers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int i=2;
        while(i>0){
            int n=sc.nextInt();
            s=s+n;
            i--;
        }
        System.out.println(6-s);
    }
}

