import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int lp=sc.nextInt();
        int div=sc.nextInt();
        int c=1;
        int i=1;
        int res=0;
        while (true){
            res=3*i+2;
            if (res%div!=0){
                System.out.println(res);
                
                c++;
            }
            i++;
            if (c==lp+1)
            break;

        }
    }
}