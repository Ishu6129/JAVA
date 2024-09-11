package GLA.codeforces;
import java.util.*;
public class AYogurtSale {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b,c,s;
        while(n>0){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            s=(a/2)*c+(a%2)*(b);
            if (s<(a*b)){
                System.out.println(s);}
            else{
                System.out.println(a*b);
            }
            n--;
        }
    }
}
