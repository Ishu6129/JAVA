import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=1;
        int i =1;
        while (i<a+1){
            if (a%i==0 && b%i==0)
                c=i;
            i++;
        }
        System.out.println(c);
    }
}
