import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int s=0;
        while(true){
            int n=sc.nextInt();
            s +=n;
            if(s<0){
                break;
            }
            System.out.println(n);
        }

    }
}
