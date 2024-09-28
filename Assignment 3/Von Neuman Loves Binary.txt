import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        while(row>0){
            int n=sc.nextInt();
            int mult=1,rem,sum=0;
            while(n>0){
                rem=n%10;
                sum=sum+mult*rem;
                mult=mult*2;
                n=n/10;
            }
            System.out.println(sum);
            row--;
        }
    }
}
