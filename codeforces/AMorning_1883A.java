package GLA.codeforces;
import java.util.*;
public class AMorning{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c;
        while(n>0){
            String s=sc.next();
            c=0;
            int current=1;
            int dest;
            for (int i = 0; i < s.length(); i++) {
                dest=Integer.parseInt(Character.toString(s.charAt(i)));
                if (dest==0){
                    dest=10;
                }
                c=c+Math.abs(dest-current)+1;
                current =dest;
            }
            System.out.println(c);
            n--;
        }
    }
}
