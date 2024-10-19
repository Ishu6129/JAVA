package codeforces;
import java.util.*;
public class grassField{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if (a+b+c+d==4){
                System.out.println(2);
            }
            else if(a+b+c+d==0){
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
            n--;
        }
        sc.close();
    }
}
