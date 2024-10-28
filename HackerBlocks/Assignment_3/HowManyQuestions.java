import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int d=sc.nextInt();
            if ((a+b+d)>=2){
                c++;
            }
            n--;
        }
        System.out.println(c);
    }
}