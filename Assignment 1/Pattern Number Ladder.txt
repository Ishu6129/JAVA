import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
         int i=0;
        int j=0;
        int c=1;
        while(i<a){
            j=0;
            while (j<i+1){
                System.out.print(c+" ");
                c++;
                j++;
            }
            i++;
            System.out.println();
        }
    }
}