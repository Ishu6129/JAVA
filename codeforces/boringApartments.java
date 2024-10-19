package codeforces;
import java.util.*;
public class boringApartments{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            c=0;
            String v=sc.next();
            int st=Integer.parseInt(v.substring(0,1));
            int ln=v.length();
            c+=10*(st-1);
            c+=ln*(ln+1)/2;
            System.out.println(c);
            n--;
        }
        sc.close();
    }
}
