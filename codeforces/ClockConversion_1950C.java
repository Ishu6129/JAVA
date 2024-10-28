package codeforces;
import java.util.*;
public class clockConversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String s=sc.next();
            int st=Integer.parseInt(s.substring(0,2));
            if(st==0){
                System.out.println("12:"+s.substring(3,5)+" AM");
            }
            else if(st<=12){
                if(st==12){
                    System.out.println(s+" "+"PM");
                }
                else{
                    System.out.println(s+" "+"AM");
                }
            }
            else{
                System.out.println(String.format("%02d",st-12)+s.substring(2,5)+" PM");
            }
            n--;
        }
    }
}
