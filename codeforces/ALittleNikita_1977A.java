package GLA.codeforces;
import java.util.*;
public class ALittleNikita {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,b;
        while(n>0){
            a=sc.nextInt();
            b=sc.nextInt();
            if (a<b){
                System.out.println("No");
            }
            else{
                if ((a-b)%2==0){
                    System.out.println("Yes");}
                else{
                    System.out.println("No");
                }
            }
            n--;
        }
    }
}
