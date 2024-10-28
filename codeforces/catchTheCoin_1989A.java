package codeforces;
import java.util.*;
public class catchTheCoin{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (b<=-2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            n--;
        }
        sc.close();
    }
}
